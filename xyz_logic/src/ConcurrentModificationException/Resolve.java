package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Resolve {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");

        System.out.println("Original list: " + myList);

        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            if (fruit.equals("banana")) {
                iterator.remove(); // Use iterator's remove method
            }
        }

        System.out.println("Modified list: " + myList);
    }
}
