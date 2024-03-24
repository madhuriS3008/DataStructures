package sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<String>();
		set.add("India");
		set.add("Sount Africa");
		set.add("Japan");
		set.add("Australia");
		System.out.println(set);
		System.out.println(set.contains("India"));
		System.out.println(set.first());
		System.out.println(set.last());
		set.remove("India");
		System.out.println(set);
		set.removeAll(set);
		System.out.println(set);
		

	}

}
