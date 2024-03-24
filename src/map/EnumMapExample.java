package map;

import java.util.EnumMap;

public class EnumMapExample {
	enum Size {
		SMALL, MEDIUM, LARGE, XLARGE
	}

	public static void main(String[] args) {
		EnumMap<Size, Integer> sizes = new EnumMap<Size, Integer>(Size.class);
		sizes.put(Size.SMALL, 20);
		sizes.put(Size.MEDIUM, 25);
		
		System.out.println(sizes);
		System.out.println(sizes.keySet());
		System.out.println(sizes.values());
		System.out.println(sizes.entrySet());

	}

}
