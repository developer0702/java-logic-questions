package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		for (int i = 0; i <= 50; i++) {
			list.add(i);
		}

		ListIterator<Integer> itr = list.listIterator();
		while (itr.hasNext()) {
			Integer value = itr.next();

			if (value % 2 == 0) {

				System.out.print(value + " ");
			} else {
				itr.remove();
			}

			// You can also use itr.remove() to remove the last element returned by next()
			// itr.remove();
		}
	}
}
