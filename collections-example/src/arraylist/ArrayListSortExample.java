package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> characters = new ArrayList<String>();
		characters.add("Joey");
		characters.add("Chandler");
		characters.add("Phoebe");
		characters.add("Monica");
		characters.add("Ross");
		characters.add("Rachel");
		
		//using simple Comparator object
		System.out.println("1. using a sample Comparator to define the customised sorting order");
		characters.sort(new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				// TODO Auto-generated method stub
				return str1.compareTo(str2); //read as subtract method
			}
			
		});
		System.out.println(characters);
		
		System.out.println("2. using sort() method and providing lambda expression to define sorting order");
		characters.sort((str1,str2) -> str1.compareTo(str2));
		System.out.println(characters);
		
		System.out.println("3. using naturalOrder() method from Comparotor Interface");
		characters.sort(Comparator.naturalOrder());
		System.out.println(characters);
		
		System.out.println("4. using Collections.sort()");
		Collections.sort(characters);
		System.out.println(characters);
		
		

	}

}
