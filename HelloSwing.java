package HelloSwing;

	import javax.swing.*;
	import java.awt.*;

	public class HelloSwing {

	    public static void main(String[] args) {
	        // Create a new JFrame
	        JFrame frame = new JFrame("Swing Hello Program");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 200); // Set window size

	        // Create the message label
	        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

	        // Set font: plain style, size 32
	        label.setFont(new Font("SansSerif", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Add label to the frame
	        frame.add(label);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
	}



