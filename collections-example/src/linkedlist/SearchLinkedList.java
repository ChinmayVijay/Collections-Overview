package linkedlist;

import java.util.LinkedList;

public class SearchLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> batsmanList = new LinkedList<String>();
		batsmanList.add("Steve");
		batsmanList.add("Mark");
		batsmanList.add("Ricky");
		batsmanList.add("Adam");
		batsmanList.add("Damien");
		batsmanList.add("Bevan");
		batsmanList.add("Adam");
		
		System.out.println(batsmanList);
		System.out.println(batsmanList.contains("Ricky"));
//		System.out.println(batsmanList.contains(new StringBuffer("Ricky"))); //false
		
		System.out.println(batsmanList.indexOf("Adam"));
		System.out.println(batsmanList.lastIndexOf("Adam"));
		

	}

}
