package sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		NavigableSet<Integer> reversed = set.descendingSet();
		
		System.out.println(set);
		System.out.println(reversed);
		
		NavigableSet<Integer> threeOrMore = set.tailSet(30, false);
		
		System.out.println(threeOrMore);
		
		System.out.println(set.lower(50));
		System.out.println(set.contains(set.first()));
		System.out.println(set.pollFirst());
		System.out.println(set);
		System.out.println(set.pollLast());
		System.out.println(set);

	}

}
