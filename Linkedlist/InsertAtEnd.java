/*Write a Java program to insert the specified element at the end of a linked list.( using
l_listobj.offerLast("Pink"))*/
package InsertAtEnd;


	import java.util.LinkedList;

	public class InsertAtEnd {
	    public static void main(String[] args) {
	        // Create a LinkedList and add some initial elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");

	        // Display the original list
	        System.out.println("Original LinkedList: " + colors);

	        // Insert "Pink" at the end using offerLast()
	        colors.offerLast("Pink");

	        // Display the updated list
	        System.out.println("LinkedList after inserting 'Pink' at the end: " + colors);
	    }
	}



