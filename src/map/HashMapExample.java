package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "King Rana");
		map.put(102, "Madhuri");
		map.put(103, "Avinash");
		map.put(101, "Suresh");
		System.out.println(map);
		
		for(Map.Entry<Integer, String> m: map.entrySet())
			System.out.println(m.getKey()+" : "+m.getValue());
		
		System.out.println(map.get(101));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		System.out.println(map.remove(101));
		System.out.println(map);
		map.clear();
		System.out.println(map);

	}

}
