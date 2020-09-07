package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListArr {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(33);
		values.add(44);
		values.add(55);
		values.add(8);
		Collections.sort(values);
		values.forEach(System.out::println);
	}

}
