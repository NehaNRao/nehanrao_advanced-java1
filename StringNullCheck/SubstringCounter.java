/*Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
package SubstringCounter;

	import java.util.Scanner;

	public class SubstringCounter {

	    // User-defined function to count substring occurrences
	    public static int countOccurrences(String mainStr, String subStr) {
	        if (mainStr == null || subStr == null || subStr.isEmpty()) {
	            return 0;
	        }

	        int count = 0;
	        int index = 0;

	        // Loop through the main string and find all occurrences of the substring
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length(); // Move index forward to avoid overlapping
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input main string
	        System.out.print("Enter the main string: ");
	        String mainStr = scanner.nextLine();

	        // Input substring to count
	        System.out.print("Enter the substring to count: ");
	        String subStr = scanner.nextLine();

	        // Call user-defined function and display result
	        int occurrences = countOccurrences(mainStr, subStr);
	        System.out.println("The substring \"" + subStr + "\" appears " + occurrences + " time(s).");

	        scanner.close();
	    }
	}


