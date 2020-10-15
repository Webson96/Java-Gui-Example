import java.awt.Color;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class GuiPanel {
	

	public static void main(String args []) {
	
		
		
		
		
		
		
		JButton button1 = new JButton("Action !");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button1, "Yummmy !!!");
			}
		});
		
		
		JButton button2 = new JButton("Camera !");
		button2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button2, "OMG such nice !!!");
				
			}
		});
		
		
		JButton button3 = new JButton("Come On !");
		button3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button3, "Yeah that's great !!!");
				
				
			}
		});
		
		JButton button4 = new JButton("Let's Go !");
		button4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button4, "I like IT !!!");
								
			}
		});
		
		
	
JFrame frame = new JFrame("Gui App");
JLabel label = new JLabel("Java Dream");
label.setBounds(260,10,100,20);




JPanel panel = new JPanel();
JPanel panel2 = new JPanel();
JPanel panel3 = new JPanel();
JPanel panel4 = new JPanel();




//panel.setPreferredSize( new Dimension(200, 200)); alternative method

panel.setBounds(40, 100, 200, 200);
panel.setBackground(Color.gray);
panel.add(button1);
button1.setBounds(50, 100, 40, 100);
button1.setSize(100, 20);

//panel2.setPreferredSize(new Dimension(200, 200)); alternative method

panel2.setBounds(350, 100, 200, 200);
panel2.setBackground(Color.gray);
panel2.add(button2);
button2.setBounds(50, 100, 40, 100);
button2.setSize(100, 20);

//panel3.setPreferredSize(new Dimension(200, 200)); alternative method

panel3.setBackground(Color.gray);
panel3.setBounds(40, 350, 200, 200);
panel3.add(button3);
button3.setBounds(50, 100, 40, 100);
button3.setSize(100, 20);

//panel4.setPreferredSize(new Dimension(200, 200)); alternative method
panel4.setBackground(Color.gray);
panel4.setBounds(350, 350, 200, 200);
panel4.add(button4);
button4.setBounds(50, 100, 40, 100);
button4.setSize(100, 20);




frame.addWindowListener(new WindowAdapter() {
	
	public void windowClosing(WindowEvent we) {
		
		
		
		int result = JOptionPane.showConfirmDialog(frame, "Do you want exit ?", 
				"Exit Confirmation : ", JOptionPane.YES_NO_OPTION);
		
		if (result == JOptionPane.YES_OPTION) {
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
			
			else if (result == JOptionPane.NO_OPTION) {
				
				frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				
			}
			
		}
	
	
});

frame.add(label);
frame.add(panel);
frame.add(panel2);
frame.add(panel3);
frame.add(panel4);



frame.setLayout(null);
panel.setLayout(null);
panel2.setLayout(null);
panel3.setLayout(null);
panel4.setLayout(null);


frame.setSize(600, 600);
frame.setLocationRelativeTo(null);


frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);	
	
}

	
}


// Button example

//JButton button = new JButton();
//button.setText("Start");
//button.setOpaque(true);
//button.setBackground(Color.cyan);


//panel.add(button);

