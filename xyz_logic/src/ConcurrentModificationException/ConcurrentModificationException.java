package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.List;

// create ConcurrentModificationException 
public class ConcurrentModificationException {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("apple");
		myList.add("banana");
		myList.add("orange");

		for (String fruit : myList) {
			// Concurrent modification below while iterating
			if (fruit.equals("banana")) {
//				myList.add(fruit); // This will throw ConcurrentModificationException
//				myList.remove("banana"); 
//				myList.set(2, "mango");
			}
		}
		System.out.println(myList);
	}
}
