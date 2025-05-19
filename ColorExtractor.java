package ColorExtractor;


	import java.util.ArrayList;
	import java.util.List;

	public class ColorExtractor {
	    public static void main(String[] args) {
	        // Create an ArrayList to store color names
	        ArrayList<String> colors = new ArrayList<>();

	        // Add colors to the list
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display the original list
	        System.out.println("Original list of colors: " + colors);

	        // Extract 1st and 2nd elements using subList (index 0 to 2, exclusive of 2)
	        if (colors.size() >= 2) {
	            List<String> extractedColors = colors.subList(0, 2);
	            System.out.println("Extracted 1st and 2nd colors: " + extractedColors);
	        } else {
	            System.out.println("The list does not have enough elements to extract.");
	        }
	    }
	}



