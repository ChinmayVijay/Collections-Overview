package treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class CreateTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(30);
		ts.add(4);
		ts.add(12);
		ts.add(8);
		ts.add(55);
		
//		ts.add(null); // gives null pointer exception
		System.out.println(ts);
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>(ts);
		ts1.add(44);
		ts1.add(22);
		ts1.add(34);
		
		System.out.println(ts1);
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>(new MyComparator());
		ts2.add(30);
		ts2.add(4);
		ts2.add(12);
		ts2.add(8);
		ts2.add(55);
		System.out.println(ts2);
		
		

	}
	

}

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer i1, Integer i2) {
		// TODO Auto-generated method stub
//		if(i1 < i2) {
//			return +1;
//		}
//		else if(i1 > i2) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
		
//		return -(i1.compareTo(i2));
		return i2.compareTo(i1);
	}
	
}
