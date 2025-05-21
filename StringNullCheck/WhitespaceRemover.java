/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package WhitespaceRemover;

	import java.util.Scanner;

	public class WhitespaceRemover {

	    // User-defined function to remove all whitespace characters from a string
	    public static String removeWhitespace(String input) {
	        if (input == null) {
	            return null;
	        }

	        // \\s matches all whitespace characters (spaces, tabs, newlines, etc.)
	        return input.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Remove whitespace and display result
	        String result = removeWhitespace(input);
	        System.out.println("String without whitespace: " + result);

	        scanner.close();
	    }
	}


