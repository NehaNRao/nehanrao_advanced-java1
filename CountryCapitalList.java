/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/
package CountryCapitalList;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;
	import java.util.HashMap;

	public class CountryCapitalList extends JFrame {

	    // Country-capital mapping
	    private HashMap<String, String> countryCapitalMap;

	    public CountryCapitalList() {
	        setTitle("Country-Capital List");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // Center the window

	        // Initialize country-capital map
	        countryCapitalMap = new HashMap<>();
	        countryCapitalMap.put("USA", "Washington, D.C.");
	        countryCapitalMap.put("India", "New Delhi");
	        countryCapitalMap.put("Vietnam", "Hanoi");
	        countryCapitalMap.put("Canada", "Ottawa");
	        countryCapitalMap.put("Denmark", "Copenhagen");
	        countryCapitalMap.put("France", "Paris");
	        countryCapitalMap.put("Great Britain", "London");
	        countryCapitalMap.put("Japan", "Tokyo");
	        countryCapitalMap.put("Africa", "No single capital"); // Africa is a continent
	        countryCapitalMap.put("Greenland", "Nuuk");
	        countryCapitalMap.put("Singapore", "Singapore");

	        // Create the JList
	        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add a selection listener
	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
	                for (String country : selectedCountries) {
	                    String capital = countryCapitalMap.get(country);
	                    System.out.println("Capital of " + country + " is: " + capital);
	                }
	            }
	        });

	        add(scrollPane, BorderLayout.CENTER);
	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new CountryCapitalList());
	    }
	}



