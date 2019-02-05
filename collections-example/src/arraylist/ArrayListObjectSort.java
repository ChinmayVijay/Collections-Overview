package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListObjectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("John",25));
		personList.add(new Person("Adam",26));
		personList.add(new Person("Bob",35));
		personList.add(new Person("Ryan",15));
		personList.add(new Person("Zoe",44));
		
		System.out.println(personList);
		
//		Collections.sort(personList, Comparator.comparingInt(Person :: getAge));
//		System.out.println("Person List sorted by age : \n"+personList);
		
//		personList.sort((person1,person2)->{
//			return person1.getAge() - person2.getAge();
//		});

//		System.out.println("Person List sorted by age : \n"+personList);
		
		Collections.sort(personList, Comparator.comparing(Person :: getName));
		System.out.println("Person List sorted by name : \n"+personList);
	}

}

class Person{
	int age;
	String name;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	public String toString() {
		return name+" -- "+ age;
	}
	
	
}
