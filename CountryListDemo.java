/*5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.*/
package CountryListDemo;

	import javax.swing.*;
	import javax.swing.event.*;
	import java.awt.*;
	import java.util.List;

	public class CountryListDemo {

	    public static void main(String[] args) {
	        // Create the JFrame
	        JFrame frame = new JFrame("Country List");
	        frame.setSize(300, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());

	        // Country names
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Create JList with countries
	        JList<String> countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(8); // Display up to 8 rows
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Add a scroll pane in case list is long
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add list selection listener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    List<String> selected = countryList.getSelectedValuesList();
	                    for (String country : selected) {
	                        System.out.println(country + " is selected");
	                    }
	                }
	            }
	        });

	        // Add scroll pane (with JList) to the frame
	        frame.add(scrollPane);

	        // Make frame visible
	        frame.setVisible(true);
	    }
	}



