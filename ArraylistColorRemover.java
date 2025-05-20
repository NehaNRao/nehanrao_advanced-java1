/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
package ColorRemover;

public class ColorRemover {
	import java.util.ArrayList;
	import java.util.Scanner;

	public class ColorRemover {
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

	        // Get the index (n) to remove from user
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the index (starting from 0) of the color to remove: ");
	        int index = scanner.nextInt();

	        // Validate index and remove element
	        if (index >= 0 && index < colors.size()) {
	            String removedColor = colors.remove(index);
	            System.out.println("Removed color at index " + index + ": " + removedColor);
	        } else {
	            System.out.println("Invalid index. No color removed.");
	        }

	        // Display updated list
	        System.out.println("Updated list of colors: " + colors);

	        scanner.close();
	    }
	}


}
