package myGenerics;

import java.util.ArrayList;
import java.util.List;

/*
 * Demo of generic list
 * Pay attention to the for loop also
 */

public class myGenericList {

	public myGenericList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> employees = new ArrayList<>();
		employees.add("Binayak");
		employees.add("Teja");
		employees.add("Manika");
		employees.add("Tai Tzu Yin");
		
		System.out.println(employees);
		
		// Demo for in List
		for (String name : employees) {
			System.out.println("My name is: " + name);
		}
	}

}
