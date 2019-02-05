package arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> firstFivePrimeNumbers = new ArrayList<Integer>();
		firstFivePrimeNumbers.add(2);
		firstFivePrimeNumbers.add(3);
		firstFivePrimeNumbers.add(5);
		firstFivePrimeNumbers.add(7);
		firstFivePrimeNumbers.add(11);
		
		System.out.println(firstFivePrimeNumbers);
		
		List<Integer> firstTenPrimeNumbers = new ArrayList<Integer>(firstFivePrimeNumbers);
		
		List<Integer> nextFivePrimeNumbers = new ArrayList<Integer>();
		nextFivePrimeNumbers.add(13);
		nextFivePrimeNumbers.add(17);
		nextFivePrimeNumbers.add(19);
		nextFivePrimeNumbers.add(23);
		nextFivePrimeNumbers.add(29);
		
		System.out.println(nextFivePrimeNumbers);
		
		firstTenPrimeNumbers.addAll(nextFivePrimeNumbers); 
		
		System.out.println("using default addAll "+firstTenPrimeNumbers);
		
//		firstTenPrimeNumbers.addAll(3,nextFivePrimeNumbers);
		
//		System.out.println("using addAll at index"+ firstTenPrimeNumbers);
		
		
	}

}
