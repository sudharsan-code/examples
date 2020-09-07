package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompartArr {
	public static void main(String[] args) {
		List<Integer> values = new ArrayList<Integer>();
		values.add(333);
		values.add(899);
		values.add(585);
		values.add(955);
		Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare (Integer t1,Integer t2) {
				
				if(t1%100>t2%100)
					return 1;
				
				return-1;
			}
			
			
		};
		
		Collections.sort(values, com);;
		values.forEach(System.out::println);
	}

}


