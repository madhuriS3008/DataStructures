package sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		NavigableSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("B");
		set.add("D");
		set.add("C");
		
		System.out.println(set);
		System.out.println(set.contains("D"));
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.higher("C"));
		System.out.println(set.lower("C"));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());

	}

}
