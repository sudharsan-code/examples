package collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedArr {
	public static void main(String[] args) {
		List<Integer> values = new LinkedList<Integer>();
		values.add(78);
		values.add(98);
		values.add(89);
		values.add(1, 99);
		values.forEach(System.out::println);
	}

}
