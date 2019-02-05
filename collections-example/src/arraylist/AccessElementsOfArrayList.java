package arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccessElementsOfArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> characters = new ArrayList<String>();
		characters.add("Joey");
		characters.add("Chandler");
		characters.add("Phoebe");
		characters.add("Monica");
		characters.add("Ross");
		characters.add("Rachel");
		
		//to access elements use get() method
		System.out.println("best: "+characters.get(0));
		System.out.println("funniest: "+characters.get(1));
		
		//modify the element at index
		characters.set(4, "Dr. Ross");
		System.out.println("We were on a break..quotes: "+characters.get(4));

	}

}
