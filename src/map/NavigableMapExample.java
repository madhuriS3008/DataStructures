package map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {

	public static void main(String[] args) {
		NavigableMap<String, Integer> numbers = new TreeMap<String, Integer>();
		numbers.put("ONE", 1);
		numbers.put("THREE", 3);
		numbers.put("TWO", 2);
		numbers.put("FOUR", 4);
		
		System.out.println(numbers);
		System.out.println(numbers.firstEntry());
		System.out.println(numbers.lastEntry());
		System.out.println(numbers.pollFirstEntry());
		System.out.println(numbers);
		System.out.println(numbers.pollLastEntry());
		System.out.println(numbers);

	}

}
