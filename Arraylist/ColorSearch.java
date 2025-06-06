/*Write a java program for getting different colors through ArrayList interface and search whether
the color "Red" is available or not*/
package ArrayList;
import java.util.ArrayList;



	public class ColorSearch {
	    public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Orange");

	        // Display all the colors
	        System.out.println("Available colors: " + colors);

	        // Check if "Red" is present in the list
	        if (colors.contains("Red")) {
	            System.out.println("The color 'Red' is available in the list.");
	        } else {
	            System.out.println("The color 'Red' is NOT available in the list.");
	        }
	    }
	}



