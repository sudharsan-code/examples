package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put("myname", "sudharsan");
		map.put("edu", "B.E");
		map.put("hobbie","singing");
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key+" "+map.get(key));
		}

	}

}


