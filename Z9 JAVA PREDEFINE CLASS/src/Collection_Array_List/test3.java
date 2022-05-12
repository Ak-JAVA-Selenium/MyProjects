package Collection_Array_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test3 {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Hanumat");
		System.out.println("=====================================");
		
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Ravi");
		al2.add("Hanumat");
		al2.add("Pune");
		
		System.out.println("Is ArrayList Empty: " + al.isEmpty());
		System.out.println("=====================================");
		
		System.out.println("al list elements: " + al);
		System.out.println("al2 list elements: " + al2);
		System.out.println("=====================================");
		
		al.retainAll(al2);
		System.out.println("al list after retailAll(): " + al);
		System.out.println("=====================================");
		
		System.out.println("iterating the elements after retaining the elements of al2");
		
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=====================================");
		
		List l1 = new ArrayList();
		
		l1.add("Pune");
		l1.add("Pune");
		l1.add(123);
		l1.add("Pune");
		l1.add(null);
		
		System.out.println(l1);
		
		Iterator<Object> ref = l1.iterator();
		while (ref.hasNext()) {
			System.out.println(ref.next());
		}
		System.out.println("=====================================");
	}
}
