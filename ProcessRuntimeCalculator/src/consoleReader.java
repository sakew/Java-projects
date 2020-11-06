import java.io.*;


public class consoleReader {
	public void readConsole() throws IOException {
	
//  we create a new stream for reading the file		
		
	InputStream input = new BufferedInputStream(new FileInputStream("output.odt"));
	
//  we allocate 8 kb for the buffer	
	
	byte[] buffer = new byte[8192];
	
//  we give the buffer a starting point and an end point and an offset
//	, the end point being the length of the file	
	
	try {
		for (int length = 0; (length = input.read(buffer)) != -1;) {
			System.out.write(buffer, 0, length);
		}
	} catch(Exception e) {
		
			System.out.println("Error reading file");
		
	}finally {
//	close the input after we finish 
		
		input.close();
	}
	

	}
}