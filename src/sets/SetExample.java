package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(100);
		set1.add(200);
		set1.add(50);
		set1.add(150);
		set1.add(10);
		set1.add(200);
		set1.add(60);
		set1.add(150);
		
		System.out.println(set1);
		
		Iterator<Integer> iterate=set1.iterator();
		while(iterate.hasNext())
			System.out.println(iterate.next());
	}

}
