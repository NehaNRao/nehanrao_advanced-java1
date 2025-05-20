package CountryButtonDemo;


	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	public class CountryButtonDemo {

	    public static void main(String[] args) {
	        // Create a new frame
	        JFrame frame = new JFrame("Country Button Demo");
	        frame.setSize(400, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());

	        // Create buttons
	        JButton indiaButton = new JButton("India");
	        JButton srilankaButton = new JButton("Srilanka");

	        // Create label to display the message
	        JLabel messageLabel = new JLabel("Click a button");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

	        // Add ActionListeners to the buttons
	        indiaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("India is pressed");
	            }
	        });

	        srilankaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Srilanka is pressed");
	            }
	        });

	        // Add components to the frame
	        frame.add(indiaButton);
	        frame.add(srilankaButton);
	        frame.add(messageLabel);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}



