package linkedlist;

import java.util.LinkedList;

public class RemoveElementsLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> batsmanList = new LinkedList<String>();
		batsmanList.add("Steve");
		batsmanList.add("Mark");
		batsmanList.add("Ricky");
		batsmanList.add("Damien");
		batsmanList.add("Bevan");
		batsmanList.add("Adam");
		
		System.out.println(batsmanList);
		
		batsmanList.removeFirst();
		batsmanList.removeLast();
		
		System.out.println(batsmanList);
		
		

	}

}
