/*1.a Develop a Java program for adding elements [Apple, Banana, Orange] into an ArrayList
and a LinkedList to perform the following operations with different functions directed as
follows
1. Adding elements, 2. Adding element at specific index, 3. Adding multiple elements, 4.
Accessing elements,5. Updating elements, 6. Removing elements, 7. Searching elements, 8. List
size, 9. Iterating over list, 10. Using Iterator, 11. Sorting, 12. Sublist, 13. Clearing the list*/
package ArrayListLinkedList;
import java.util.*;
public class ArrayListLinkedList {
	

	
	    public static void main(String[] args) {
	        // 1. Adding elements
	        ArrayList<String> arrayList = new ArrayList<>();
	        LinkedList<String> linkedList = new LinkedList<>();

	        arrayList.add("Apple");
	        arrayList.add("Banana");
	        arrayList.add("Orange");

	        linkedList.add("Apple");
	        linkedList.add("Banana");
	        linkedList.add("Orange");

	        System.out.println("Initial ArrayList: " + arrayList);
	        System.out.println("Initial LinkedList: " + linkedList);

	        // 2. Adding element at specific index
	        arrayList.add(1, "Mango");
	        linkedList.add(1, "Mango");

	        // 3. Adding multiple elements
	        List<String> moreFruits = Arrays.asList("Pineapple", "Grapes");
	        arrayList.addAll(moreFruits);
	        linkedList.addAll(moreFruits);

	        // 4. Accessing elements
	        System.out.println("Element at index 2 in ArrayList: " + arrayList.get(2));
	        System.out.println("Element at index 2 in LinkedList: " + linkedList.get(2));

	        // 5. Updating elements
	        arrayList.set(0, "Strawberry");
	        linkedList.set(0, "Strawberry");

	        // 6. Removing elements
	        arrayList.remove("Banana");
	        linkedList.remove("Banana");

	        // 7. Searching elements
	        System.out.println("ArrayList contains 'Orange': " + arrayList.contains("Orange"));
	        System.out.println("LinkedList contains 'Orange': " + linkedList.contains("Orange"));

	        // 8. List size
	        System.out.println("Size of ArrayList: " + arrayList.size());
	        System.out.println("Size of LinkedList: " + linkedList.size());

	        // 9. Iterating over list (for-each loop)
	        System.out.println("ArrayList elements:");
	        for (String fruit : arrayList) {
	            System.out.println(fruit);
	        }

	        System.out.println("LinkedList elements:");
	        for (String fruit : linkedList) {
	            System.out.println(fruit);
	        }

	        // 10. Using Iterator
	        System.out.println("ArrayList using Iterator:");
	        Iterator<String> arrayIterator = arrayList.iterator();
	        while (arrayIterator.hasNext()) {
	            System.out.println(arrayIterator.next());
	        }

	        System.out.println("LinkedList using Iterator:");
	        Iterator<String> linkedIterator = linkedList.iterator();
	        while (linkedIterator.hasNext()) {
	            System.out.println(linkedIterator.next());
	        }

	        // 11. Sorting
	        Collections.sort(arrayList);
	        Collections.sort(linkedList);
	        System.out.println("Sorted ArrayList: " + arrayList);
	        System.out.println("Sorted LinkedList: " + linkedList);

	        // 12. Sublist
	        List<String> arraySubList = arrayList.subList(1, 3);
	        List<String> linkedSubList = linkedList.subList(1, 3);
	        System.out.println("Sublist of ArrayList (index 1 to 3): " + arraySubList);
	        System.out.println("Sublist of LinkedList (index 1 to 3): " + linkedSubList);

	        // 13. Clearing the list
	        arrayList.clear();
	        linkedList.clear();
	        System.out.println("Cleared ArrayList: " + arrayList);
	        System.out.println("Cleared LinkedList: " + linkedList);
	    }
	}

	


