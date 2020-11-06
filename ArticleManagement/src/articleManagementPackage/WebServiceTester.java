package articleManagementPackage;  

import java.util.List; 
import javax.ws.rs.client.Client; 
import javax.ws.rs.client.ClientBuilder; 
import javax.ws.rs.client.Entity; 
import javax.ws.rs.core.Form; 
import javax.ws.rs.core.GenericType; 
import javax.ws.rs.core.MediaType;  

public class WebServiceTester  {  
   private Client client; 
   private String REST_SERVICE_URL = "http://localhost:8080/ArticleManagement/ArticleService"; 
   private static final String SUCCESS_RESULT = "<result>success</result>"; 
   private static final String PASS = "pass"; 
   private static final String FAIL = "fail";  
   private void init(){ 
      this.client = ClientBuilder.newClient(); 
   }  
   public static void main(String[] args){ 
      WebServiceTester tester = new WebServiceTester(); 
      //initialize the tester 
      tester.init(); 
      //test get all Articles Web Service Method 
      tester.testGetAllArticles(); 
      //test get Article Web Service Method  
      tester.testGetArticle();
      //test update Article Web Service Method 
      tester.testUpdateArticle(); 
      //test add Article Web Service Method 
      tester.testAddArticle(); 
      //test delete Article Web Service Method 
      tester.testDeleteArticle(); 
   } 
   //Test: Get list of all Articles 
   //Test: Check if list is not empty 
   private void testGetAllArticles(){ 
      GenericType<List<Article>> list = new GenericType<List<Article>>() {}; 
      List<Article> articles = client 
         .target(REST_SERVICE_URL) 
         .request(MediaType.APPLICATION_XML) 
         .get(list); 
      String result = PASS; 
      if(articles.isEmpty()){ 
         result = FAIL; 
      } 
      System.out.println("Test case name: testGetAllArticles, Result: " + result ); 
   } 
   //Test: Get Article of id 1 
   //Test: Check if Article is same as sample Article 
   private void testGetArticle(){ 
      Article sampleArticle = new Article(); 
      sampleArticle.setId(1);  
      Article article = client 
         .target(REST_SERVICE_URL) 
         .path("/{articleid}") 
         .resolveTemplate("articleid", 1) 
         .request(MediaType.APPLICATION_XML) 
         .get(Article.class); 
      String result = FAIL; 
      if(sampleArticle != null && sampleArticle.getId() == article.getId()){
         result = PASS; 
      } 
      System.out.println("Test case name: testGetArticle, Result: " + result ); 
   } 
   //Test: Update Article of id 1 
   //Test: Check if result is success XML. 
   private void testUpdateArticle(){ 
      Form form = new Form(); 
      form.param("id", "1"); 
      form.param("name", "suresh"); 
      form.param("profession", "clerk");  
      String callResult = client 
         .target(REST_SERVICE_URL) 
         .request(MediaType.APPLICATION_XML) 
         .post(Entity.entity(form, 
         MediaType.APPLICATION_FORM_URLENCODED_TYPE), 
         String.class); 
      String result = PASS; 
      if(!SUCCESS_RESULT.equals(callResult)){ 
         result = FAIL; 
      }  
      System.out.println("Test case name: testUpdateArticle, Result: " + result); 
   } 
   //Test: Add Article of id 2 
   //Test: Check if result is success XML. 
   private void testAddArticle(){ 
      Form form = new Form(); 
      form.param("id", "2"); 
      form.param("authors", "titlu"); 
      form.param("Ion", "Moara cu noroc");  
      String callResult = client 
         .target(REST_SERVICE_URL) 
         .request(MediaType.APPLICATION_XML) 
         .put(Entity.entity(form, 
         MediaType.APPLICATION_FORM_URLENCODED_TYPE), 
         String.class); 
    
      String result = PASS; 
      if(!SUCCESS_RESULT.equals(callResult)){ 
         result = FAIL; 
      }  
      System.out.println("Test case name: testAddArticle, Result: " + result ); 
   } 
   //Test: Delete Article of id 2 
   //Test: Check if result is success XML. 
   private void testDeleteArticle(){ 
      String callResult = client 
         .target(REST_SERVICE_URL) 
         .path("/{articleid}") 
         .resolveTemplate("articleid", 2) 
         .request(MediaType.APPLICATION_XML) 
         .delete(String.class);  
      String result = PASS; 
      if(!SUCCESS_RESULT.equals(callResult)){ 
         result = FAIL; 
      } 
      System.out.println("Test case name: testDeleteArticle, Result: " + result); 
   } 
}