package arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
/**
 * This class demonstrates how to use following methods:
 * 	1. remove(Element e)
 * 	2. removeAll(Collection c)
 * 	3. removeIf( new Predicator.....)
 * 	4. clear()
 * @author ichin
 *
 */
public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Virat");
		arrayList.add("Rohit");
		arrayList.add("Dhawan");
		arrayList.add("Dhoni");
		arrayList.add(null);
		arrayList.add("Jadeja");
		arrayList.add("Dhawan");
		
		System.out.println(arrayList);
		//Methods to remove specified element
		System.out.println("removing element");
		arrayList.remove("Jadeja");
		System.out.println(arrayList);
		
		//removing null
		System.out.println("removing null element");
		arrayList.remove(null);
		System.out.println(arrayList);
		
		List<String> bowlerList = new ArrayList<String>();
		bowlerList.add("Virat");
		bowlerList.add("Rohit");
		bowlerList.add("Dhoni");
		
//		arrayList.removeAll(bowlerList);
		
//		System.out.println(arrayList);
		
		arrayList.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				
				return t.startsWith("R");
			}
		});
		
		System.out.println(arrayList);
		//using lambda expressions above can be written as
//		arrayList.removeIf(t -> t.startsWith("D"));
		
//		System.out.println(arrayList);
		
		//remove all objects using clear method
		
		arrayList.clear();
		
		System.out.println(arrayList);
		
		

	}

}
