package hashset;

import java.util.HashSet;
import java.util.Set;

public class OtherOperationsHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(23);
		hs.add(55);
		hs.add(2);
		hs.add(46);
		hs.add(11);
		
		System.out.println(hs);
		if(hs.contains(55))
			System.out.println("Yes we got it");
		
//		hs.remove(11);
		hs.removeIf(num -> num %2==0); //remove all even numbers
		System.out.println(hs);
		
		hs.clear();
	}

}
