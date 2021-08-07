package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> array = new ArrayList<String>();
		//2. Add five Strings to your list
		array.add("dogs");
		array.add("dogs2");
		array.add("dogs3");
		array.add("dogssdafhdao");
		array.add("edsafd");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i<5; i++) {
			System.out.println(array.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		//5. Print only the even numbered elements in the list.
		System.out.println("Evens: ");
		for (int i = 0; i < array.size(); i++) {
			if(i%2==0) {
			System.out.println(array.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
