package sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(100);
		numbers.add(200);
		System.out.println(numbers);
		
		Iterator<Integer> iterate = numbers.iterator();
		while(iterate.hasNext())
			System.out.println(iterate.next());
		
		numbers.remove(300);
		System.out.println(numbers);
		
		numbers.removeAll(numbers);
		System.out.println(numbers);
		
		//mathematical set operations: union, intersection, difference, subset
		HashSet<Integer> set1 = new HashSet<Integer>();
		set1.add(100);
		set1.add(200);
		set1.add(300);
		
		HashSet<Integer> set2 = new HashSet<Integer>();
		set2.add(100);
		set2.add(200);
		set2.add(400);
		
		//union
		//set1.addAll(set2);
		//System.out.println(set1);
		
		//intersection
		//set1.retainAll(set2);
		//System.out.println(set1);
		
		//difference
		set1.removeAll(set2);
		System.out.println(set1+" , "+ set2);

	}

}
