import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class TimeLapseGUI {
		public void startGUI() throws IOException, InterruptedException { 	
			

//	 	creating JFrame object
			
			JFrame frame = new JFrame();
			
			
// .pack() to resize the window depending on it's subcomponents' width and height
			
			
			frame.pack();
			
// default close operation (without this the window can't be closed)
			
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
// setting preferred width and height of window
			
			
			frame.setSize(900,600);
			
// if setLocationRelativeTo is set to null , the window pops in the center of the screen as default position		
			
			frame.setLocationRelativeTo(null);
			
// setting visibility to true so we can see the JFrame window
			
			
			frame.setVisible(true);
			
// creating arraylist for each of the column headers
			
			
			List<String> outputUsers = new ArrayList<String>();
			List<String> outputPids = new ArrayList<String>();
			List<String> outputStartTimes = new ArrayList<String>();
			List<String> outputCommands = new ArrayList<String>();
			List<String> outputTimeLapse = new ArrayList<String>();
			
// reading from file 'output.odt'
			
			try(BufferedReader br = new BufferedReader(new FileReader("output.odt"))) {
				try {
					
					
					
			// looping through the entire file line by line
					
					for (String line; (line = br.readLine()) != null;) {	
						
						if(line.length()!=0) {
							
			// splitting the file into an array of strings
							
					String[] splitLineString = line.split("\\s+");
//							System.out.println(splitLineString[0]);
			
			// storing each column of the text file by it's index number after splitting the file above 		
					
							String users = splitLineString[0];
							String processIds = splitLineString[1];
							String startTimes = splitLineString[2];
							String timeLapse = splitLineString[3];
							String commands = splitLineString[4];
							
							
			// adding each variable of type string to it's designated column header list				
							
							outputUsers.add(users);
							outputPids.add(processIds);
							outputStartTimes.add(startTimes);
							outputCommands.add(commands);
							outputTimeLapse.add(timeLapse);				
							
						}
						
					}
					
					
			} catch (IOException e) {
			
				e.printStackTrace();
			
			} finally {
			
			// after everything is checked and no errors are thrown , check if there is no data left and close the file reading action	
				
				if (br != null) {
				
					br.close();
				
				}
			} 

	// setting headers for the columns in JTable			
				
			String col[] = {"INDEX", "USER", "PID", "STARTED", "COMMAND", "TIMELAPSE"};
			
	// creating the table model		
			
			DefaultTableModel tableModel = new DefaultTableModel(col, 0);

	// creating JTable object		
			
			JTable table = new JTable(tableModel);
			
			
	// looping through the list of elements by taking one of the arraylists 
			
			for(int i=0; i<outputUsers.size();i++) {
	//	we set index as integer, for each position it will fill with the iterated value;		
				
				int index = i;
				
	// we define the column headers and get the data from the arrayLists
				
				String USER = outputUsers.get(i);
				String PID = outputPids.get(i);
				String START = outputStartTimes.get(i);
				String COMMAND = outputCommands.get(i);
				String TimeLapse = outputTimeLapse.get(i);
				
				
				
				
	// we make the object data and store all the column headers inside it			
				
				Object[] data = {index,USER,PID,START,COMMAND,TimeLapse};
	// we add the data to the table model			
				
				tableModel.addRow(data);
			}
			
	// we add scrollbars to our table
			
			JScrollPane scrollPane = new JScrollPane(table);
			scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			
	// we add the scrollPane to the frame		
			
			frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
			frame.add(scrollPane);
			
			
		}
	}
}


//// 	creating JFrame object
//
//JFrame frame = new JFrame();
//
//
//// .pack() to resize the window depending on it's subcomponents' width and height
//
//
//frame.pack();
//
//// default close operation (without this the window can't be closed)
//
//
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//// setting preferred width and height of window
//
//
//frame.setSize(900,600);
//
//// if setLocationRelativeTo is set to null , the window pops in the center of the screen as default position		
//
//frame.setLocationRelativeTo(null);
//
//// setting visibility to true so we can see the JFrame window
//
//
//frame.setVisible(true);
//
//// Creating list model		
//
//DefaultListModel<String> listModel = new DefaultListModel<String>();
//
//// reading from the file 'output.odt'		
//
//try(BufferedReader br = new BufferedReader(new FileReader("output.odt"))) {
//	try {
//		
//// adding each element of the file to the list model
//		
//		for (String line; (line = br.readLine()) != null;) {	
//			
//		listModel.addElement(line);
//			
//	}
//} catch (IOException e) {
//
//	e.printStackTrace();
//
//} finally {
//
//// after everything is checked and no errors are thrown , check if there is no data left and close the file reading action	
//	
//	if (br != null) {
//	
//		br.close();
//	
//	}
//} 
//
//	
//	
//// creating JList object			
//	
//	JList<String> jList = new JList<String>(listModel);
//	
//	
//	
//// adding the JList to the JFrame 'frame' object			
//	
//	JScrollPane scrollPane = new JScrollPane(jList);
//	scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
//	scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//	
//	
//	
//	frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
//	frame.add(scrollPane);
//	
