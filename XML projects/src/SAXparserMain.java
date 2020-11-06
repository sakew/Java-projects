import java.io.File;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class SAXparserMain {

	public static void main(String[] args) {
		
		try {
			File inputFile = new File("/home/dorin/Desktop/eclipse-workspace/XML projects/src/Articles.xml");
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			SAXArticleHandler articleHandler = new SAXArticleHandler();
			saxParser.parse(inputFile, articleHandler);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}














