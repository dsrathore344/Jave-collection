package collection.list.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterationDemo {

	public static void main(String[] args) {
		/*
		 * *****can be done using******
		 * 1) For loop
		   2) Advanced For loop
		   3) Iterator
		   4) While Loop
		 */
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Devendra");
		linkedList.add("Pushpa");
		linkedList.add("Rajendra");
		linkedList.add("Priyanka");
		linkedList.add("Alekhya");
		
		/*for loop*/
		System.out.println("**For loop**");
		for(int i = 0; i<linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		
		System.out.println();
		
		/*Advanced For loop*/
		System.out.println("**For loop**");
		for (String string : linkedList) {
			System.out.println(string);
		}
		
		System.out.println();
		
		/*using Iterator*/
		System.out.println("**Iterator**");
		Iterator<String> iterator = linkedList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		
		/*using while loop*/
		System.out.println("**While loop**");
		int num = 0;
		while(linkedList.size()>num) {
			System.out.println(linkedList.get(num));
			num++;
		}
	}
}
