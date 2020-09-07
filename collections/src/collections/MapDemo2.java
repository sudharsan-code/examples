package collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		Map<String,String> map = new Hashtable<>() 
		{{
			put("myname", "sudharsan");
			put("edu", "B.E");
			put("hobbie","singing");
			
		}};
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println(key+" "+map.get(key));
		}

	}

		

	}


