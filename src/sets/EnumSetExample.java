package sets;

import java.util.EnumSet;

public class EnumSetExample {
	enum Size{
		SMALL, MEDIUM, LARGE, XLARGE
	}

	public static void main(String[] args) {
		EnumSet<Size> sizes = EnumSet.allOf(Size.class);
		EnumSet<Size> sizes1 = EnumSet.noneOf(Size.class);
		//sizes1.add(Size.MEDIUM);
		//sizes1.addAll(sizes);
		EnumSet<Size> sizes2 = EnumSet.range(Size.MEDIUM, Size.XLARGE);
		EnumSet<Size> sizes3 = EnumSet.of(Size.SMALL, Size.LARGE);
		
		System.out.println(sizes);
		System.out.println(sizes1);
		System.out.println(sizes2);
		System.out.println(sizes3);
		
		sizes.remove(Size.MEDIUM);
		System.out.println(sizes);
		//sizes.add(Size.XXLARGE); => can not add as Size class does not have XXLARGE value
		sizes.removeAll(sizes2);
		System.out.println(sizes);
		
		System.out.println(sizes2.contains(Size.MEDIUM));
		System.out.println(sizes2.contains(sizes));

	}

}
