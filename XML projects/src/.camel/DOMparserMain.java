import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;



public class DOMparserMain {
	
	public static void main(String[] args) {
		
		try {
			File inputFile = new File("/home/dorin/Desktop/eclipse-workspace/XML projects/src/Articles.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("article");
			System.out.println("-----------------------------------------------");
			
			for (int temp = 0;temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				String articleNumber = nNode.getAttributes().getNamedItem("number").getNodeValue();
				
				Element eElement = (Element) nNode;
				
				
				if (nNode.getNodeType() == Node.ELEMENT_NODE && eElement.hasAttribute("yearno") && eElement.getAttribute("yearno").equals("2017"))  {
					
					System.out.println("-----------------------------------------------");
					
					
					System.out.println("\nCurrent Element :" + nNode.getNodeName() +" number "+ articleNumber);
					
					
					System.out.println("-----------------------------------------------");
					
					
					System.out.println("Article filter identifier: " + eElement.getAttribute("yearno"));
					
					System.out.println("Authors: " + eElement.getElementsByTagName("authors").item(0).getTextContent());
					
					System.out.println("Title: " + eElement.getElementsByTagName("title").item(0).getTextContent());
					
					System.out.println("Number of Pages: " + eElement.getElementsByTagName("pages").item(0).getTextContent());
					
					System.out.println("Section: " + eElement.getElementsByTagName("section").item(0).getTextContent());
					
					System.out.println("DOI: " + eElement.getElementsByTagName("DOI").item(0).getTextContent());
					
					System.out.println("Keywords: " + eElement.getElementsByTagName("keywords").item(0).getTextContent());
					
					System.out.println("CrossReference: " + eElement.getElementsByTagName("crossreference").item(0).getTextContent());
					
					System.out.println("Editor: " + eElement.getElementsByTagName("editor").item(0).getTextContent());
					
					System.out.println("Conference Title: " + eElement.getElementsByTagName("conferenceTitle").item(0).getTextContent());
					
					System.out.println("Book Title: " + eElement.getElementsByTagName("bookTitle").item(0).getTextContent());
					
					System.out.println("Publisher: " + eElement.getElementsByTagName("publisher").item(0).getTextContent());
					
					System.out.println("Month: " + eElement.getElementsByTagName("month").item(0).getTextContent());
					
					System.out.println("Year: " + eElement.getElementsByTagName("year").item(0).getTextContent());
					
					System.out.println("ISBN: " + eElement.getElementsByTagName("ISBN").item(0).getTextContent());
				}
 			}
		}catch(Exception e) {
			e.printStackTrace();;
		}
		
	}
		
}
