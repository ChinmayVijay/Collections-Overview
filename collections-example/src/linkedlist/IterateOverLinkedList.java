package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateOverLinkedList {
	
	 public static void main(String[] args) {
	        LinkedList<String> cricketerList = new LinkedList<>();

	        cricketerList.add("Adam Gilchrist");
	        cricketerList.add("Sachin Tendulkar");
	        cricketerList.add("Ricky Ponting");
	        cricketerList.add("Jacque Kallis");

	        System.out.println("=== Iterate over a LinkedList using Java 8 forEach and lambda ===");
	        cricketerList.forEach(name -> {
	            System.out.println(name);
	        });


	        System.out.println("\n=== Iterate over a LinkedList using iterator() ===");
	        Iterator<String> cricketerIterator = cricketerList.iterator();
	        while (cricketerIterator.hasNext()) {
	            String name = cricketerIterator.next();
	            System.out.println(name);
	        }

	        System.out.println("\n=== Iterate over a LinkedList using iterator() and Java 8 forEachRemaining() method ===");
	        cricketerIterator = cricketerList.iterator();
	        cricketerIterator.forEachRemaining(name -> {
	            System.out.println(name);
	        });

	        System.out.println("\n=== Iterate over a LinkedList using descendingIterator() ===");
	        Iterator<String> descendingCricketerIterator = cricketerList.descendingIterator();
	        while (descendingCricketerIterator.hasNext()) {
	            String name = descendingCricketerIterator.next();
	            System.out.println(name);
	        }


	        System.out.println("\n=== Iterate over a LinkedList using listIterator() ===");
	        // ListIterator can be used to iterate over the LinkedList in both forward and backward directions
	        // In this example, we start from the end of the list and traverse backwards
	        ListIterator<String> cricketerListIterator = cricketerList.listIterator(cricketerList.size());
	        while (cricketerListIterator.hasPrevious()) {
	            String name = cricketerListIterator.previous();
	            System.out.println(name);
	        }

	        System.out.println("\n=== Iterate over a LinkedList using simple for-each loop ===");
	        for(String cricName: cricketerList) {
	            System.out.println(cricName);
	        }
	    }

}
