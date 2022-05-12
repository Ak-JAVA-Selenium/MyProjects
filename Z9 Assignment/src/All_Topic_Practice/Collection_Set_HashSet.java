package All_Topic_Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collection_Set_HashSet {

	public static void main(String[] args) {

		// Creating HashSet and adding elements
		Set<String> set = new HashSet<String>();
		// in set if you try to add duplicate element dn it will neglect that element
		// instead of throwing an error
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");// it don't get added in set
		set.add("Ajay");
		System.out.println("Set : " + set);
		// Traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("removing Ravi from set: " + set.remove("Ravi"));
		System.out.println("After invoking remove(object) method: " + set);
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		System.out.println("set1 elements: " + set1);
		set.addAll(set1);
		System.out.println("Updated List: " + set);
		// Removing all the new elements from HashSet
		set.removeAll(set1);
		System.out.println("After invoking removeAll() method: " + set);
		set.add("Vijay");
		// Removing elements on the basis of specified condition
		set.removeIf(str -> str.contains("Vijay"));
		System.out.println("After invoking removeIf() method: " + set);
		// Removing all the elements available in the set
		set.clear();
		System.out.println("After invoking clear() method: " + set);

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println("List elements: " + list);

		HashSet<String> set2 = new HashSet(list);
		set2.add("Gaurav");
		System.out.println("set elements: " + set2);
		Iterator<String> i = set2.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("******************");
		set2.forEach(s1 -> {
			System.out.println(s1);
		});
		System.out.println("***************");
		set2.removeIf(s1 -> s1.contains("Ravi"));
		System.out.println("set elements: " + set2);
	}
}
