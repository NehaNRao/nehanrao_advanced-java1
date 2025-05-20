/*Q4. Write a Java Program for Checking if a string reads the same backward as forward (ignoring case
and punctuation) using user defined function isPalindrome():*/
package PalindromeChecker;

	import java.util.Scanner;

	public class PalindromeChecker {

	    // User-defined function to check if a string is a palindrome
	    public static boolean isPalindrome(String input) {
	        if (input == null) {
	            return false;
	        }

	        // Remove all non-alphanumeric characters and convert to lowercase
	        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

	        // Compare characters from start and end
	        int left = 0;
	        int right = cleaned.length() - 1;

	        while (left < right) {
	            if (cleaned.charAt(left) != cleaned.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string to check if it's a palindrome: ");
	        String input = scanner.nextLine();

	        // Check using the user-defined function
	        if (isPalindrome(input)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }

	        scanner.close();
	    }
	}



