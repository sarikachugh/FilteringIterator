package sf.crom.filteringapp;

import java.util.List;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			mylist.add(i);
		}
		//MyObject myobj = new MyObject();
		OddObject myobj = new OddObject();
		FilteringIterator itr = new FilteringIterator(mylist.iterator(), myobj);
		while (itr.hasNext()) {
			Integer number = itr.next();
			if (number != null) {
				System.out.println(number);
			}
		}
	}
}
