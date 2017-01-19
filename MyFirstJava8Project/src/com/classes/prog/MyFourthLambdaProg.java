package com.classes.prog;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.classes.pojo.Person;

public class MyFourthLambdaProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> persons = Arrays.asList(new Person(3, "Tushar", "Kulkarni", 29),
				new Person(2, "Prajakta", "Deshpande", 25),
				new Person(6, "Ramchandra", "Kulkarni", 68),
				new Person(5, "Rohini", "Herwadkar", 58),
				new Person(4, "Shilpa", "Joshi", 31),
				new Person(1, "Pranav", "Deshpande", 21));
	
		// Sort list
		Collections.sort(persons,new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
			
		});
		// Print all
		System.out.println("All persons list:");
		printAll(persons);
		
		// First name start with specific word or letter
		System.out.println("Print list whose first name starts with:");
		printFirstNamebeg(persons);
		
		// Last name start with specific word or letter
		System.out.println("Print list whose last name starts with:");
		printConditionally(persons, new Condition() {
			
			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("K");
			}
		});
		
		// Last name start with specific word or letter
		System.out.println("Print list whose last name starts with:");
		printConditionally(persons, (Person p) -> {
			return p.getLastName().startsWith("D");
		});
		
		// Sort list
		Collections.sort(persons,(Person o1, Person o2) -> {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
		});
		
		// All list
		System.out.println("Print all list:");
		printConditionally(persons, (Person p) -> {
			return true;
		});
		
		// All list
		System.out.println("Print all list:");
		printConditionally(persons, p -> true);		
		
		// Sort list
		Collections.sort(persons,(Person o1, Person o2) -> {
			// TODO Auto-generated method stub
			return o1.getSrNo() - o2.getSrNo();
		});
	
		// All list
		System.out.println("Print all list:");
		printConditionally(persons, (Person p) -> {
			return true;
		});		
	}
	
	private static void printAll(List<Person> persons){
		for(Person p: persons){
			System.out.println(p);
		}
	}
	
	private static void printFirstNamebeg(List<Person> persons){
		for(Person p: persons){
			if(p.getFirstName().startsWith("R")){
				System.out.println(p);
			}
		}
	}
	
	private static void printConditionally(List<Person> persons,Condition condition){
		for(Person p: persons){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
	}

}

interface Condition{
	public boolean test(Person p);
}