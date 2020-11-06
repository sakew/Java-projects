import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXArticleHandler extends DefaultHandler {
	
	boolean bAuthor = false;
	boolean bTitle = false;
	boolean bPage = false;
	boolean bSection = false;
	boolean bDOI = false;
	boolean bKeyword = false;
	boolean bCrossreference = false;
	boolean bEditor = false;
	boolean bConferenceTitle = false;
	boolean bBookTitle = false;
	boolean bPublisher = false;
	boolean bMonth = false;
	boolean bYear = false;
	boolean bISBN = false;
	
	String yearno = null;
	
	 public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		 	
		 	
		 	
		 	if (qName.equalsIgnoreCase("article")) {
		 		yearno = attributes.getValue("yearno");
		 		
		 		
		 	}
		 	
		 	if(("2016").equals(yearno) && qName.equalsIgnoreCase("article")) {
		 		System.out.println("Start Element: " + qName);
		 		System.out.println("--------------------------------");
		 		System.out.println("--------------------------------");
		 	}
		 	
		 	else if (qName.equalsIgnoreCase("authors")) {
		 		
		 		bAuthor = true;
		 	}else if (qName.equalsIgnoreCase("title")) {
		 		
		 		bTitle = true;
		 	}else if (qName.equalsIgnoreCase("pages")) {
		 		
		 		bPage = true;
		 	}else if (qName.equalsIgnoreCase("section")) {
		 		
		 		bSection = true;
		 	}else if (qName.equalsIgnoreCase("DOI")) {
		 		
		 		bDOI = true;
		 	}else if (qName.equalsIgnoreCase("keywords")) {
		 		
		 		bKeyword = true;
		 	}else if (qName.equalsIgnoreCase("crossreference")) {
		 		
		 		bCrossreference = true;
		 	}else if (qName.equalsIgnoreCase("editor")) {
		 		
		 		bEditor = true;
		 	}else if (qName.equalsIgnoreCase("conferenceTitle")) {
		 		
		 		bConferenceTitle = true;
		 	}else if (qName.equalsIgnoreCase("bookTitle")) {
		 		
		 		bBookTitle = true;
		 	}else if (qName.equalsIgnoreCase("publisher")) {
		 		
		 		bPublisher = true;
		 	}else if (qName.equalsIgnoreCase("month")) {
		 		
		 		bMonth = true;
		 	}else if (qName.equalsIgnoreCase("year")) {
		 		
		 		bYear = true;
		 	}else if (qName.equalsIgnoreCase("ISBN")) {
		 		
		 		bISBN = true;
		 	}
	 }
	
	 public void endElement(String uri,String localName, String qName) throws SAXException {
		 if (qName.equalsIgnoreCase("article")) {
			 if(("2016").equals(yearno) && qName.equalsIgnoreCase("article"))
			 System.out.println("End Element: " + qName);
		 }
	 }
	 
	 public void characters(char ch[], int start, int length) throws SAXException {
		  
	
		 
		 if (bAuthor && ("2016").equals(yearno)) {
		 		 
			 System.out.println("Authors:" + new String(ch, start, length));
		 	
			 bAuthor = false;
		 	}else if (bTitle && ("2016").equals(yearno)) {
		 	
		 		System.out.println("Title:" + new String(ch, start, length));
		 		
		 		bTitle = false;
		 	}else if (bPage && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Pages:" + new String(ch, start, length));
		 		
		 		bPage = false;
		 	}else if (bSection && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Section:" + new String(ch, start, length));
		 		
		 		bSection = false;
		 	}else if (bDOI && ("2016").equals(yearno)) {
		 		
		 		System.out.println("DOI:" + new String(ch, start, length));
		 		
		 		bDOI = false;
		 	}else if (bKeyword && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Keywords:" + new String(ch, start, length));
		 		
		 		bKeyword = false;
		 	}else if (bCrossreference && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Cross Reference:" + new String(ch, start, length));
		 		
		 		bCrossreference = false;
		 	}else if (bEditor && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Editor:" + new String(ch, start, length));
		 		
		 		bEditor = false;
		 	}else if (bConferenceTitle && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Conference Title:" + new String(ch, start, length));
		 		
		 		bConferenceTitle = false;
		 	}else if (bBookTitle && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Book Title:" + new String(ch, start, length));
		 		
		 		bBookTitle = false;
		 	}else if (bPublisher && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Publisher:" + new String(ch, start, length));
		 		
		 		bPublisher = false;
		 	}else if (bMonth && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Month:" + new String(ch, start, length));
		 		
		 		bMonth = false;
		 	}else if (bYear && ("2016").equals(yearno)) {
		 		
		 		System.out.println("Year:" + new String(ch, start, length));
		 		
		 		bYear = false;
		 	}else if (bISBN && ("2016").equals(yearno)) {
		 		
		 		System.out.println("ISBN:" + new String(ch, start, length));
		 		
		 		bISBN = false;
		 	}
	 }
	 
	 
	
}
