
public class processMainPanel {
	public static void main (String args[]) throws Exception {
	
		
// print processes from the method created in the class processShow
		processShow p = new processShow();
		p.printProcess();
		
		
		TimeLapseGUI timeLapseGUI = new TimeLapseGUI();
		timeLapseGUI.startGUI();
		
	}
}
