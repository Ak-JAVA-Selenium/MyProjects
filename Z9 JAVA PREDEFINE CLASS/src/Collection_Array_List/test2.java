package Collection_Array_List;

import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {

//		ArrayList<Integer> l1 = new ArrayList<Integer>();//Generic
//		l1.add(12);
//		ArrayList<Boolean> l2 = new ArrayList<Boolean>();//Generic
//		l2.add(true);
//		ArrayList<Character> l3 = new ArrayList<Character>();//Generic
//		l3.add('a');
		ArrayList<String> al = new ArrayList<String>();// Generic
		
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Anuj");
		al.add("Gaurav");
		
		System.out.println("An initial list of elements:\n" + al);
		System.out.println("======================================");
		
		// Removing specific element from arraylist
		System.out.println("remove Vijay from collection: " + al.remove("Vijay"));
		System.out.println("============");
		System.out.println("After invoking remove(object) method:\n" + al);
		System.out.println("======================================");
		
		// Removing element on the basis of specific position
		System.out.println("remove index 0 from collection: " + al.remove(0));
		System.out.println("============");
		System.out.println("After invoking remove(index) method:\n" + al);
		System.out.println("======================================");
		
		// Creating another arraylist
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Ravi");
		al2.add("Hanumat");
		
		// Adding new elements to arraylist
		al.addAll(al2);
		System.out.println("Updated list :\n" + al);
		System.out.println("======================================");
		
		// Removing all the new elements from arraylist
		al.removeAll(al2);
		System.out.println("After invoking removeAll() method:\n" + al);
		System.out.println("======================================");
		
		// Removing elements on the basis of specified condition
		al.removeIf(str -> str.contains("Ajay"));
		// Here, we are using Lambda expression
		System.out.println("After invoking removeIf() method:\n" + al);
		System.out.println("======================================");
		
		// Removing all the elements available in the list
		al.clear();
		System.out.println("After invoking clear() method:\n" + al);
	}
}
