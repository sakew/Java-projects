//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;

//public class clasa3 extends JFrame{
	
//	private JButton lb;
//	private JButton cb;
//	private JButton rb;
	
//	private FlowLayout layout;
//	private Container container;
	
//	public clasa3() {
//		super("Interactive Gui");
//		layout = new FlowLayout();
//		container = getContentPane();
//		setLayout(layout);
		
		//left stuff in here
//		lb = new JButton("left click");
//		add(lb);
//		lb.addActionListener( 
	//			new ActionListener() {
//					public void actionPerformed(ActionEvent event) {
//						layout.setAlignment(FlowLayout.LEFT);
//						layout.layoutContainer(container);
//					}
//				}
//			);
		//center stuff in here
//		cb = new JButton("Center button click");
	//	add(cb);
//		cb.addActionListener( 
//				new ActionListener() {
//					public void actionPerformed(ActionEvent event) {
//						layout.setAlignment(FlowLayout.CENTER);
//						layout.layoutContainer(container);
//					}
//				}
//			);
//		//right stuff in here
//		rb = new JButton("right click");
//		add(rb);
//		rb.addActionListener( 
//				new ActionListener() {
//					public void actionPerformed(ActionEvent event) {
//						layout.setAlignment(FlowLayout.RIGHT);
//						layout.layoutContainer(container);
//					}
//				}
//			);
//	}
	
//}
						
						
//	Creating a game with JAVA..
						


//	public class clasa3 extends JPanel{
		
//		public void paintComponent(Graphics g) {
			
//			super.paintComponent(g);
//			this.setBackground(Color.WHITE);
			
//			g.setColor(Color.BLUE);
//			g.fillRect(25, 25, 100, 30);
			
//			g.setColor(new Color(190,81,215));
//			g.fillRect(25, 65, 100, 30);
			
//			g.setColor(Color.RED);
//			g.drawString("This is some text", 25, 120);
			
			
			
			
//		}
		
//	}

// Panel setup, positioning and coloring;


//public class clasa3 extends JFrame{
	
//	private JButton b;
//	private Color color = (Color.WHITE);
//	private JPanel panel;
	
//	public clasa3() {
//		super("ColorPicker app");
//		panel = new JPanel();
//		panel.setBackground(color);
		
//		b = new JButton("Choose a color");
//		b.addActionListener(
//				new ActionListener() {
//					public void actionPerformed(ActionEvent event) {
//						color = JColorChooser.showDialog(null, "Pick your color", color);
//						if(color==null)
//							color=(Color.WHITE);
						
//						panel.setBackground(color);
//					}
//				}
//		);
		
//		add(panel, BorderLayout.CENTER);
//		add(b, BorderLayout.SOUTH);
//		setSize(425,150);
//		setVisible(true);

// ColorPicker app		
//	}
	
//}


//public class clasa3 extends JPanel{
//	
//	public void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		this.setBackground(Color.WHITE);
//		
//		g.setColor(Color.blue);
//		g.drawLine(10, 25, 200, 45);
//		
//		
//		g.setColor(Color.RED);
//		g.drawRect(10, 55, 100, 30);
//		
//		
//		g.setColor(Color.GREEN);
//		g.fillOval(10, 95, 100, 30);
//		
//		
//		g.setColor(Color.ORANGE);
//		g.fill3DRect(10, 160, 100, 50, true);
//		
		
		
//	}
	
//}

//Drawing graphics functions..		






						
						