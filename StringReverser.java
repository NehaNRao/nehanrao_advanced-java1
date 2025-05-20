package StringReverser;

	import java.util.Scanner;

	public class StringReverser {

	    // User-defined function to reverse a string
	    public static String reverseString(String input) {
	        if (input == null) {
	            return null;
	        }

	        StringBuilder reversed = new StringBuilder(input);
	        return reversed.reverse().toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the string
	        System.out.print("Enter a string to reverse: ");
	        String input = scanner.nextLine();

	        // Call the user-defined function and print the result
	        String reversed = reverseString(input);
	        System.out.println("Reversed string: " + reversed);

	        scanner.close();
	    }
	}

