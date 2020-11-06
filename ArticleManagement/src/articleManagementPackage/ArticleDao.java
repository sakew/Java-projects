package articleManagementPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ArticleDao {
	@SuppressWarnings("unchecked")
	public List<Article> getAllArticles() {
	
	List<Article> articleList = null;
	try {
		File file = new File("Articles.xml");
		if(!file.exists()) {
			Article article = new Article(7, "autor", "titlu", "pagini", "sectiune", "DOI", 
					"cuvintecheie", "crossreference", "editor", "titluconferinta",
					"titlucarte","publisher","month","year","ISBN");
			articleList = new ArrayList<Article>();
			articleList.add(article);
			saveArticleList(articleList);
		} else {
			FileInputStream fileinputstream = new FileInputStream(file);
			ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
			articleList = (List<Article>) objectinputstream.readObject();
			objectinputstream.close();
		}
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	return articleList;
	
	}
	
	public Article getArticle(int id) {
		List<Article> articles = getAllArticles();
		for(Article article: articles) {
			if(article.getId() == id) {
				return article;
			}
		}
		return null;
	}
	
	public int addArticle(Article printArticle) {
		List<Article> articleList = getAllArticles();
		boolean articleExists = false;
		for(Article article: articleList) {
			if(article.getId() == printArticle.getId()) {
				articleExists = true;
				break;
			}
		}
		if(!articleExists) {
			articleList.add(printArticle);
			saveArticleList(articleList);
			return 1;
		}
		return 0;
	}
	public int updateArticle(Article printArticle) {
		List<Article> articleList = getAllArticles();
		for(Article article: articleList) {
			if ( article.getId() == printArticle.getId()) {
				int index = articleList.indexOf(article);
				articleList.set(index, printArticle);
				saveArticleList(articleList);
				return 1;
			}
		}
		return 0;
	}
	public int deleteArticle(int id) {
		List<Article> articleList = getAllArticles();
		for(Article article: articleList) {
			if(article.getId() == id) {
				int index = articleList.indexOf(article);
				articleList.remove(index);
				saveArticleList(articleList);
				return 1;
			}
		}
		return 0;
	}
	
	
	
	private void saveArticleList(List<Article> articleList) {
		try {
			File file = new File("Articles.xml");
			FileOutputStream fileinputstream;
			fileinputstream = new FileOutputStream(file);
			ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileinputstream);
			objectoutputstream.writeObject(articleList);
			objectoutputstream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
