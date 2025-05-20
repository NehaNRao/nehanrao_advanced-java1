package RandomStringGenerator;


	import java.util.Random;
	import java.util.Scanner;

	public class RandomStringGenerator {

	    // User-defined function to generate a random string
	    public static String generateRandomString(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length()); // Pick a random index
	            result.append(characters.charAt(index));         // Add the character to result
	        }

	        return result.toString();
	    }

	    // Main method
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // User input for string length
	        System.out.print("Enter the length of the random string: ");
	        int length = scanner.nextInt();

	        // Generate and display the random string
	        String randomString = generateRandomString(length);
	        System.out.println("Random String: " + randomString);

	        scanner.close();
	    }
	}


