package treeset;

import java.util.TreeSet;

public class TreeSetUserDefinedObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Employee> ts1 = new TreeSet<Employee>();
		
		ts1.add(new Employee(34, "Victor"));
		ts1.add(new Employee(22, "Ray"));
		ts1.add(new Employee(29, "John"));
		ts1.add(new Employee(54, "Wick"));
		ts1.add(new Employee(41, "Lisa"));
		
		System.out.println(ts1);
		
		

	}

}

//class AgeComparator implements Comparator<Integer>{
//
//	@Override
//	public int compare(Integer o1, Integer o2) {
//		// TODO Auto-generated method stub
//		return o2.compareTo(o1); //descending
//	}
//}
//
//class NameComparator implements Comparator<String>{
//
//	@Override
//	public int compare(String o1, String o2) {
//		// TODO Auto-generated method stub
//		return o2.compareTo(o1);
//	}
//	
//}

class Employee implements Comparable<Employee>{
	int age;
	String name;
	
	public Employee(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Employee e1) {
		// TODO Auto-generated method stub
		Integer i = this.age;
		Integer i1 = e1.age;
		if(i < i1) {
			return 1;
		}
		else if(i > i1) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.age+ " : " + this.name;
	}
	
	
}
