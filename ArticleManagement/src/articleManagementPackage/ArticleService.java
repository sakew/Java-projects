package articleManagementPackage;

import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Application;

@Path("/ArticleService")

public class ArticleService {

	ArticleDao articleDao = new ArticleDao();
	private static final String SUCCESS_RESULT = "<result>success</result>";
	private static final String FAILURE_RESULT = "<result>failure</result>";
	@GET
	@Path("/articles")
	@Produces(MediaType.APPLICATION_XML)
	public List<Article> getArticles() {
		return articleDao.getAllArticles();
	}
	@GET
	@Path("/articles/{articleid}")
	@Produces(MediaType.APPLICATION_XML)
	public Article getArticle(@PathParam("articleid") int articleid) {
		return articleDao.getArticle(articleid);
	}
	@PUT
	@Path("/articles")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String createArticle(@FormParam("id") int id, 
		@FormParam("authors") String authors,
		@FormParam("title") String title,
		@FormParam("pages") String pages,
		@FormParam("section") String section,
		@FormParam("DOI") String DOI,
		@FormParam("keywords") String keywords,
		@FormParam("crossreference") String crossreference,
		@FormParam("editor") String editor,
		@FormParam("conferenceTitle") String conferenceTitle,
		@FormParam("bookTitle") String bookTitle,
		@FormParam("publisher") String publisher,
		@FormParam("month") String month,
		@FormParam("year") String year,
		@FormParam("ISBN") String ISBN,
		@Context HttpServletResponse servletResponse) throws IOException{
		Article article = new Article(id, authors,title,pages,section,DOI,
				keywords,crossreference,editor,conferenceTitle,bookTitle,publisher,month,year,ISBN);
		int result = articleDao.addArticle(article);
		if(result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}
	@POST
	@Path("/articles")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String updateArticle(@FormParam("id") int id, 
		@FormParam("authors") String authors,
		@FormParam("title") String title,
		@FormParam("pages") String pages,
		@FormParam("section") String section,
		@FormParam("DOI") String DOI,
		@FormParam("keywords") String keywords,
		@FormParam("crossreference") String crossreference,
		@FormParam("editor") String editor,
		@FormParam("conferenceTitle") String conferenceTitle,
		@FormParam("bookTitle") String bookTitle,
		@FormParam("publisher") String publisher,
		@FormParam("month") String month,
		@FormParam("year") String year,
		@FormParam("ISBN") String ISBN,
		@Context HttpServletResponse servletResponse) throws IOException{
		Article article = new Article(id, authors,title,pages,section,DOI,
				keywords,crossreference,editor,conferenceTitle,bookTitle,publisher,month,year,ISBN);
		int result = articleDao.addArticle(article);
		if(result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}
	@DELETE
	@Path("/articles/{articleid}")
	@Produces(MediaType.APPLICATION_XML)
	public String deleteArticle(@PathParam("articleid") int articleid) {
		int result = articleDao.deleteArticle(articleid);
		if(result == 1) {
			return SUCCESS_RESULT;
		}
		return FAILURE_RESULT;
	}
	@OPTIONS
	@Path("/articles")
	@Produces(MediaType.APPLICATION_XML)
	public String getSupportedOperations() {
		return "<operations>GET,PUT,POST,DELETE</operations>";
	}
	
	
	
}













