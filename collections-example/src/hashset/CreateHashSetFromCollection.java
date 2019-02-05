package hashset;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class CreateHashSetFromCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		List<String> l = new ArrayList<String>();
		l.add("Alpha");
		l.add("Beta");
		l.add("Gamma");
		l.add("Lambda");
		l.add("Theta");
		
		HashSet<String> hs = new HashSet<String>(l);
		
		System.out.println(hs);

	}

}
