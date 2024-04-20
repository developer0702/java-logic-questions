package ConcurrentModificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OnnlyIterator {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= 100; i++) {
			list.add(i);
		}
		
		
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			if (i % 2 == 0) {
				System.out.print(i+" ");
			} else {
				itr.remove();
			}
		}

	}

}
