package arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayList {

	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Virat");
		arrayList.add("Rohit");
		arrayList.add("Dhawan");
		arrayList.add("Dhoni");
		arrayList.add(null);
		arrayList.add("Jadeja");
		arrayList.add("Dhawan");
		
		System.out.println("Properties of arrayList : \n"
				+ "1. Underlying data structure is growable array or resizable array.\n"
				+ "2. Duplicates are allowed.\n"
				+ "3. Insertion order is preserved.\n"
				+ "4. Null insertion is allowed.\n"
				+ "5. Homogeneous objects are allowed and not Heterogeneous.\n");
		
		arrayList.add(2,"Prithvi"); //add element at particular index
		System.out.println(arrayList);
		
	}

}
