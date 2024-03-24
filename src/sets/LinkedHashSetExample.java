package sets;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		evenNumbers.add(400);
		evenNumbers.add(100);
		evenNumbers.add(300);
		evenNumbers.add(200);
		evenNumbers.add(100);
		evenNumbers.add(300);
		evenNumbers.add(200);
		evenNumbers.add(400);
		System.out.println(evenNumbers);
		
		//LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>(evenNumbers);
		//System.out.println(numbers);
		
		LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
		numbers.addAll(evenNumbers);
		numbers.add(500);
		System.out.println(numbers);

	}

}
