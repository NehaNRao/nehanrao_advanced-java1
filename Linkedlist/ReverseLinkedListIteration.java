/*Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/
package ReverseLinkedListIteration;

	import java.util.LinkedList;
	import java.util.Iterator;

	public class ReverseLinkedListIteration {
	    public static void main(String[] args) {
	        // Create a LinkedList and add elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Original list: " + colors);

	        // Iterate in reverse order using descendingIterator()
	        System.out.println("Iterating in reverse order:");
	        Iterator<String> reverseIterator = colors.descendingIterator();
	        
	        while (reverseIterator.hasNext()) {
	            System.out.println(reverseIterator.next());
	        }
	    }
	}


