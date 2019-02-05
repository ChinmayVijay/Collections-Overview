package hashset;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> hs = new LinkedHashSet<String>();
		hs.add("Alpha");
		hs.add("Beta");
		hs.add("Gamma");
		hs.add("Lambda");
		hs.add("Theta");
		
		System.out.println("LinkedHashSet will preserve the insertion order:");
		hs.forEach(value -> {
			System.out.println(value);
		});

	}

}
