package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> characters = new ArrayList<String>();
		characters.add("Joey");
		characters.add("Chandler");
		characters.add("Phoebe");
		characters.add("Monica");
		characters.add("Ross");
		characters.add("Rachel");
		
		//iterate using java 8 forEach and lambda
		System.out.println("1. Iterate using lambda expression");
		characters.forEach(character -> {
			System.out.println(character);
		});
		
		System.out.println("2. Iterate using simple iterator");
		Iterator<String> itr = characters.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("3. Iterate using iterator() and forEachRemaining() from Java 8 ");
		Iterator<String> friendsItr = characters.iterator();
		friendsItr.forEachRemaining(character -> {
			System.out.println(character);
			});
		
		System.out.println("4. Iterate using listIterator() for both direction iteration--forward and backward ");
//		ListIterator<String> friendsListItr = characters.listIterator();//for forward direction using without parameter
		ListIterator<String> friendsListItr = characters.listIterator(characters.size());//for reverse direction use parameterised method.
		while(friendsListItr.hasPrevious()) {
			System.out.println(friendsListItr.previous());
		}
		
		System.out.println("5. using simple forEach()");
		for(String character: characters) {
			System.out.println(character);
		}
		
		System.out.println("6. using simple for()");
		for(int i = 0; i<characters.size();i++) {
			System.out.println(characters.get(i));
		}

	}

}
