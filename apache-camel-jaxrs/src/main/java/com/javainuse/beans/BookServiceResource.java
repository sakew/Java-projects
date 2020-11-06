package com.javainuse.beans;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/bookService")
@ApplicationPath("/resources")


public class BookServiceResource {

		public BookServiceResource() {
			
		}
	
		@GET
		@Path("/articles")
		public String getArticle() {
			return "Article: ";
		}
		
		
}
