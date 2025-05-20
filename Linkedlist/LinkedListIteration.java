/*1. Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package LinkedListIteration;


	import java.util.LinkedList;
	import java.util.Iterator;
	import java.util.ListIterator;

	public class LinkedListIteration {
	    public static void main(String[] args) {
	        // Create a LinkedList and add elements
	        LinkedList<String> colors = new LinkedList<>();
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Orange");

	        // Display original list
	        System.out.println("Complete list: " + colors);

	        // Start iterating from the 2nd position (index 1)
	        System.out.println("Iterating from the 2nd element:");
	        Iterator<String> iterator = colors.listIterator(1); // index 1 = 2nd element

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


