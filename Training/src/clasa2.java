//	import java.awt.*;
//	import java.awt.event.*;
//	import javax.swing.*;



//	public class clasa2 extends JFrame{

//	private JPanel mousepanel;
//	private JLabel statusbar;
	
//	public clasa2() {
//		super("Mouse events app");
		
//		mousepanel = new JPanel();
//		mousepanel.setBackground(Color.WHITE);
//		add(mousepanel, BorderLayout.CENTER);
		
//		statusbar = new JLabel("default");
//		add(statusbar, BorderLayout.SOUTH);
		
//		HandlerClass handler = new HandlerClass();
//		mousepanel.addMouseListener(handler);
//		mousepanel.addMouseMotionListener(handler);
		
//	}
//	private class HandlerClass implements MouseListener, MouseMotionListener {
//		public void mouseClicked(MouseEvent event) {
//			statusbar.setText(String.format("Clicked at %d,%d", event.getX(), event.getY()));
//		}
//		public void mousePressed(MouseEvent event) {
//			statusbar.setText("You pressed down the mouse");
//		}
//		public void mouseReleased(MouseEvent event) {
//			statusbar.setText("You released the button");
//		}
//		public void mouseEntered(MouseEvent event) {
//			statusbar.setText("You entered the area");
//			mousepanel.setBackground(Color.RED);
//		}
//		public void mouseExited(MouseEvent event) {
//			statusbar.setText("The mouse has left the window");
//			mousepanel.setBackground(Color.WHITE);
//		}
		//these are mouse motion events
//		public void mouseDragged(MouseEvent event) {
//			statusbar.setText("You are dragging the mouse");
//		}
//		public void mouseMoved(MouseEvent event) {
//			statusbar.setText("You moved the mouse");
//		}
//	}
//}
	
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;

//public class clasa3 extends JFrame {
	//private String details;
	//private JLabel statusbar;

	//public clasa3() {
		//super("The title");
		
		//statusbar = new JLabel("this is default");
		//add(statusbar, BorderLayout.SOUTH);
		//addMouseListener(new MouseClass());
		
//	}
	
//	private class MouseClass extends MouseAdapter{
//		public void mouseClicked(MouseEvent event) {
//			details = String.format("You clicked %d ", event.getClickCount());
			
//			if(event.isMetaDown())
//				details += "With right mouse button";
//			else if(event.isAltDown())
//				details += "with center mouse button";
//			else
//				details += "with left mouse button";
			
//			statusbar.setText(details);
//		}
//	}
	
//}