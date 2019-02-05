package arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * Methods used are
 * indexOf()
 * lastIndexOf()
 * @author ichin
 *
 */
public class SearchElementInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");
        System.out.println(names);
        System.out.println("using indexOf method: "+names.indexOf("Alice"));
        System.out.println("using indexOf method: "+names.indexOf("John"));//in case of duplicate elements it will return first index 
        System.out.println("using lastIndexOf method: "+names.lastIndexOf("John"));
        
        
		

	}

}
