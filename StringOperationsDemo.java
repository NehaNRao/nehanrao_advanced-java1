package StringOperationsDemo;
	public class StringOperationsDemo {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of String 1: " + str1.length());
	        System.out.println("Character at index 1 in String 1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("str1.equals(str3): " + str1.equals(str3)); // case-sensitive
	        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        String sample = "Welcome to Java Programming";
	        System.out.println("Index of 'Java': " + sample.indexOf("Java"));
	        System.out.println("Contains 'Java': " + sample.contains("Java"));

	        // 5. Substring Operations
	        System.out.println("Substring (11 to 15): " + sample.substring(11, 15));

	        // 6. String Modification
	        String modified = sample.replace("Java", "Python");
	        System.out.println("Modified string: " + modified);

	        // 7. Whitespace Handling
	        String strWithSpaces = "   Trim this string   ";
	        System.out.println("Original with spaces: '" + strWithSpaces + "'");
	        System.out.println("After trim(): '" + strWithSpaces.trim() + "'");

	        // 8. String Concatenation
	        String fullString = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated string: " + fullString);

	        // 9. String Splitting
	        String sentence = "This,is,a,sample,string";
	        String[] parts = sentence.split(",");
	        System.out.println("Splitted parts:");
	        for (String part : parts) {
	            System.out.println(part);
	        }

	        // 10. StringBuilder Demo (efficient string modifications)
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" World");
	        sb.insert(5, ",");
	        sb.replace(0, 5, "Hi");
	        sb.deleteCharAt(2);
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Alice";
	        int age = 30;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted string: " + formatted);

	        // 12. Validate Email with contains(), startsWith(), endsWith()
	        String email = "user@example.com";
	        System.out.println("Valid email check:");
	        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
	            System.out.println(email + " is a valid format.");
	        } else {
	            System.out.println(email + " is not a valid format.");
	        }
	    }
	}


