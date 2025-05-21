/*Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package StringTruncator;

	import java.util.Scanner;

	public class StringTruncator {

	    // User-defined function to truncate the string
	    public static String truncate(String input, int maxLength) {
	        if (input == null || maxLength < 0) {
	            return input;
	        }

	        if (input.length() <= maxLength) {
	            return input; // No need to truncate
	        }

	        if (maxLength <= 3) {
	            // Not enough room for any part of the original string
	            return "...".substring(0, maxLength);
	        }

	        // Truncate and add ellipsis
	        return input.substring(0, maxLength - 3) + "...";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Input desired maximum length
	        System.out.print("Enter maximum length: ");
	        int maxLength = scanner.nextInt();

	        // Truncate and display result
	        String result = truncate(input, maxLength);
	        System.out.println("Truncated string: " + result);

	        scanner.close();
	    }
	}



