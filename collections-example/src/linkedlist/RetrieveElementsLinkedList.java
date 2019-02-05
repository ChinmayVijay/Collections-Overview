package linkedlist;

import java.util.LinkedList;

public class RetrieveElementsLinkedList {

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
		
		System.out.println(batsmanList.get(3));
		System.out.println(batsmanList.getLast());
		System.out.println(batsmanList.getFirst());
		

	}

}
