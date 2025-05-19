/*2. Write a java program for getting different colors through ArrayList interface and remove the
2nd element and color "Blue" from the ArrayList*/
package ColorManager;
import java.util.ArrayList;



	public class ColorManager {
	    public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original list of colors: " + colors);

	        // Remove the 2nd element (index 1)
	        if (colors.size() > 1) {
	            String removedColor = colors.remove(1);
	            System.out.println("Removed 2nd element: " + removedColor);
	        } else {
	            System.out.println("The list has fewer than 2 elements, cannot remove 2nd element.");
	        }

	        // Remove the color "Blue" if it exists
	        boolean isBlueRemoved = colors.remove("Blue");
	        if (isBlueRemoved) {
	            System.out.println("The color 'Blue' was found and removed.");
	        } else {
	            System.out.println("The color 'Blue' was not found in the list.");
	        }

	        // Display updated list
	        System.out.println("Updated list of colors: " + colors);
	    }
	}



