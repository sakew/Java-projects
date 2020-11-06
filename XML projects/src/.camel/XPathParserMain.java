import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;



public class XPathParserMain {

	public static void main(String[] args) {
		
		try {
			File inputFile = new File("/home/dorin/Desktop/eclipse-workspace/XML projects/src/Articles.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;
			
			dBuilder = dbFactory.newDocumentBuilder();
			
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			
			XPath xPath = XPathFactory.newInstance().newXPath();
			
			String expression = "/articles/article";
			
			NodeList nodeList = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);
			
			for (int i=0;i<nodeList.getLength();i++) {
				Node nNode = nodeList.item(i);
				System.out.println("---------------------------------------");
				System.out.println("---------------------------------------");
				System.out.println("---------------------------------------");
				System.out.println("\nCurrent Element: " +nNode.getNodeName());
				
				if(nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					
					System.out.println("Article number : " + eElement.getAttribute("number"));
					
					System.out.println("Authors : " + eElement.getElementsByTagName("authors").item(0).getTextContent());
					
					System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
					
					System.out.println("Number of Pages : " + eElement.getElementsByTagName("pages").item(0).getTextContent());
					
					System.out.println("Section : " + eElement.getElementsByTagName("section").item(0).getTextContent());
					
					System.out.println("DOI : " + eElement.getElementsByTagName("DOI").item(0).getTextContent());
					
					System.out.println("Keywords : " + eElement.getElementsByTagName("keywords").item(0).getTextContent());
					
					System.out.println("Crossreference : " + eElement.getElementsByTagName("crossreference").item(0).getTextContent());
					
					System.out.println("Editor : " + eElement.getElementsByTagName("editor").item(0).getTextContent());
					
					System.out.println("Conference Title : " + eElement.getElementsByTagName("conferenceTitle").item(0).getTextContent());
					
					System.out.println("Book Title : " + eElement.getElementsByTagName("bookTitle").item(0).getTextContent());
					
					System.out.println("Publisher : " + eElement.getElementsByTagName("publisher").item(0).getTextContent());
					
					System.out.println("Month : " + eElement.getElementsByTagName("month").item(0).getTextContent());
					
					System.out.println("Year : " + eElement.getElementsByTagName("year").item(0).getTextContent());
					
					System.out.println("ISBN : " + eElement.getElementsByTagName("ISBN").item(0).getTextContent());
				}	
			}		
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}
	}
}
