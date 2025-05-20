package ColorTabbedPane;
import javax.swing.*;
import java.awt.*;

public class ColorTabbedPane extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ColorTabbedPane() {
        // Set up the frame
        setTitle("Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame

        // Create the tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each color
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);

        // Add tabs to the tabbed pane
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Add the tabbed pane to the frame
        add(tabbedPane);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI code on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> new ColorTabbedPane());
    }
}
