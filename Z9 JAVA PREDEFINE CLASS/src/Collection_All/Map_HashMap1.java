package Collection_All;

import java.util.HashMap;

public class Map_HashMap1 {

	public static void main(String[] args) {

		HashMap m1 = new HashMap();
		m1.put("key1", "admin");
		m1.put("key2", "admin");
		m1.put(null, "admin123");
		System.out.println("Map elements are: " + m1);
		System.out.println("Map element count: " + m1.size());
		m1.put("key2", "manager");
		m1.put(null, 1234);
		System.out.println("Map elements are: " + m1);
		System.out.println("Map element count: " + m1.size());

		System.out.println("key set of map: " + m1.keySet());
		System.out.println("values of map: " + m1.values());
	}
}
