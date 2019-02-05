package hashset;

import java.util.HashSet;
import java.util.Iterator;

public class IterateOverHasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Alpha");
		hs.add("Beta");
		hs.add("Gamma");
		hs.add("Lambda");
		hs.add("Theta");
		
		//Iterate using forEach - Java8 and Lambda
		System.out.println("Iterate using forEach - Java8 and Lambda");
		hs.forEach(variable -> {
			System.out.println(variable);
		});		
		
		//using iterator
		System.out.println("using iterator");
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("using iterator and lambda expression using forEachRemaining");
		Iterator<String> lambdaItr = hs.iterator();
		lambdaItr.forEachRemaining(variable -> {
			System.out.println(variable);
		});
		
		System.out.println("using foreach only");
		for(String x : hs) {
			System.out.println(x);
		}

	}

}
