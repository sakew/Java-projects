package articlePackage;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="articles")



public class Article implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String authors;
	private String title;
	private String pages;
	private String section;
	private String DOI;
	private String keywords;
	private String crossreference;
	private String editor;
	private String conferenceTitle;
	private String bookTitle;
	private String publisher;
	private String month;
	private String year;
	private String ISBN;
	public Article(){}
	
	public Article(int id, String authors, String title, String pages,
			String section, String DOI, String keywords, 
			String crossreference, String editor, String conferenceTitle,
			String bookTitle, String publisher, String month, String year, String ISBN) {
		
		this.id = id;
		this.authors = authors;
		this.title = title;
		this.pages = pages;
		this.section = section;
		this.DOI = DOI;
		this.keywords = keywords;
		this.crossreference = crossreference;
		this.editor = editor;
		this.conferenceTitle = conferenceTitle;
		this.bookTitle = bookTitle;
		this.publisher = publisher;
		this.month = month;
		this.year = year;
		this.ISBN = ISBN;
		
	}
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}
	public String getAuthors() { 
		return authors;
	}
	@XmlElement
	public void setAuthors(String authors) {
		this.authors = authors;
	}
	public String getTitle() { 
		return title;
	}
	@XmlElement
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPages() { 
		return pages;
	}
	@XmlElement
	public void setPages(String pages) {
		this.pages = pages;
	}
	public String getSection() { 
		return section;
	}
	@XmlElement
	public void setSection(String section) {
		this.section = section;
	}
	public String getDOI() { 
		return DOI;
	}
	@XmlElement
	public void setDOI(String DOI) {
		this.DOI = DOI;
	}
	public String getKeywords() { 
		return keywords;
	}
	@XmlElement
	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}
	public String getCrossreference() { 
		return crossreference;
	}
	@XmlElement
	public void setCrossreference(String crossreference) {
		this.crossreference = crossreference;
	}
	public String getEditor() { 
		return editor;
	}
	@XmlElement
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getConferenceTitle() { 
		return conferenceTitle;
	}
	@XmlElement
	public void setConferenceTitle(String conferenceTitle) {
		this.conferenceTitle = conferenceTitle;
	}
	public String getBookTitle() { 
		return bookTitle;
	}
	@XmlElement
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getPublisher() { 
		return publisher;
	}
	@XmlElement
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getMonth() { 
		return month;
	}
	@XmlElement
	public void setMonth(String month) {
		this.month = month;
	}
	public String getYear() { 
		return year;
	}
	@XmlElement
	public void setYear(String year) {
		this.year = year;
	}
	public String getISBN() { 
		return ISBN;
	}
	@XmlElement
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		} else {
			Article article = (Article)object;
			if(id == article.getId()
				&& authors.equals(article.getAuthors())
				&& title.equals(article.getTitle())
				&& pages.equals(article.getPages())
				&& section.equals(article.getSection())
				&& DOI.equals(article.getDOI())
				&& keywords.equals(article.getKeywords())
				&& crossreference.equals(article.getCrossreference())
				&& editor.equals(article.getEditor())
				&& conferenceTitle.equals(article.getConferenceTitle())
				&& bookTitle.equals(article.getBookTitle())
				&& publisher.equals(article.getPublisher())
				&& month.equals(article.getMonth())
				&& year.equals(article.getYear())
				&& ISBN.equals(article.getISBN())) {
					return true;
			}
		}
		return false;
	}
}
