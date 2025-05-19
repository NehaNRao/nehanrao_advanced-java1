package ColorSorter;

	import java.util.ArrayList;
	import java.util.Collections;

	public class ColorSorter {
	    public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Yellow");
	        colors.add("Blue");
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original list of colors: " + colors);

	        // Sort the list using Collections.sort()
	        Collections.sort(colors);

	        // Display the sorted list
	        System.out.println("Sorted list of colors: " + colors);
	    }
	}



