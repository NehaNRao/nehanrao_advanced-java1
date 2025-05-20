package ImageButtonDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ClockButtonDemo {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame frame = new JFrame("Clock Image Button Demo");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Load icons (use correct path if not in same folder)
        ImageIcon digitalClockIcon = new ImageIcon("digital_clock.png");
        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

        // Optionally resize icons for better UI
        ImageIcon resizedClockIcon = new ImageIcon(
            digitalClockIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
        ImageIcon resizedHourglassIcon = new ImageIcon(
            hourGlassIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));

        // Create buttons with image icons
        JButton digitalClockButton = new JButton(resizedClockIcon);
        JButton hourGlassButton = new JButton(resizedHourglassIcon);

        // Create label to display messages
        JLabel messageLabel = new JLabel("Click an image button");
        messageLabel.setFont(new Font("Arial", Font.BOLD, 18));

        // Add ActionListeners
        digitalClockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        hourGlassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add components to frame
        frame.add(digitalClockButton);
        frame.add(hourGlassButton);
        frame.add(messageLabel);

        // Display the window
        frame.setVisible(true);
    }
}
