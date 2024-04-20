package interviewinterview;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Cherry");

        Iterator<String> itr = myList.iterator();

        while (itr.hasNext()) {
            String fruit = itr.next();
            System.out.println(fruit);

            // Concurrent modification - modifying the list while iterating
            if (fruit.equals("Banana")) {
//                myList.remove(fruit);
            	myList.add("jadh");
            }
        }
    }
}
