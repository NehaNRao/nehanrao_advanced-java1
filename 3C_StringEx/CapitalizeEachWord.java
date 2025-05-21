/*Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package CapitalizeEachWord;


	import java.util.Scanner;

	public class CapitalizeEachWord {

	    // User-defined function to capitalize the first letter of each word
	    public static String capitalizeWords(String input) {
	        if (input == null || input.isEmpty()) {
	            return input;
	        }

	        String[] words = input.trim().split("\\s+"); // Split by one or more spaces
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                // Capitalize the first letter and make the rest lowercase
	                capitalized.append(Character.toUpperCase(word.charAt(0)));
	                if (word.length() > 1) {
	                    capitalized.append(word.substring(1).toLowerCase());
	                }
	                capitalized.append(" ");
	            }
	        }

	        return capitalized.toString().trim(); // Remove trailing space
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a sentence: ");
	        String input = scanner.nextLine();

	        // Capitalize and display
	        String result = capitalizeWords(input);
	        System.out.println("Capitalized: " + result);

	        scanner.close();
	    }
	}



