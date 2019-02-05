package linkedlist;

import java.util.LinkedList;

public class CreateLinkedList {
	
	public static void main(String... args) {
		
		LinkedList<String> batsmanList = new LinkedList<String>();
		batsmanList.add("Steve");
		batsmanList.add("Mark");
		batsmanList.add("Ricky");
		batsmanList.add("Damien");
		batsmanList.add("Bevan");
		batsmanList.add("Adam");
		
		batsmanList.add(2,"Darren");
		
		batsmanList.addFirst("Hayden");
		batsmanList.addLast("Mcgrath");
		
		LinkedList<String> playersList = new LinkedList<String>(batsmanList);
		
		playersList.addLast("Gillespie");
		playersList.addLast("Bracken");
		playersList.addLast("Kasprowicz");
		playersList.addLast("Warne");
		
		System.out.println(playersList);
		
		
	}

}
