package All_Topic_Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_List_ArrayList {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();// Creating arraylist

		System.out.println("default size of list: " + list.size());
		list.add("Mango");// auto-upcasting from String to Object class object
		list.add(1235);// first boxing to Integer class object---> upcasting to object class
		list.add("Banana");
		list.add(null);
		list.add('C');// first boxing to Character class object---> upcasting to object class
		list.add(15.26);// first boxing to Double class object---> upcasting to object class
		list.add(true);// first boxing to Boolean class object---> upcasting to object class
		list.add(new Collection_List_ArrayList());// test class object will be upcasted to Object class object

		list.forEach(hi -> { 
			System.out.println("8888888888888888"+hi);
		});
		
		System.out.println("================================");
		System.out.println("size of list: " + list.size());
		System.out.println("================================");
		System.out.println("Elements of list: " + list);
		System.out.println("================================");
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("================================");
		System.out.println("Traversing list through for-each loop:");
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		System.out.println("================================");
		// accessing the element
		System.out.println("Returning element: " + list.get(1));
		// it will return the 2nd element, because index starts from 0
		System.out.println("================================");
		// changing/update existing object at index 1
		list.set(1, "Dates");
		System.out.println("Elements of list: " + list);
		System.out.println("================================");
		System.out.println("size of list: " + list.size());
		System.out.println("================================");
		System.out.println("list of elements status: " + list.isEmpty());
		System.out.println("====================================");
		// Adding elements to the end of the list
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		System.out.println("After invoking add(E e) method: " + list);
		System.out.println("====================================");
		// Adding an element at the specific position/index
		list.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + list + "\nList Size : " + list.size());
		System.out.println("====================================");

		ArrayList al2 = new ArrayList();

		al2.add("Sonoo");
		al2.add("Hanumat");

		System.out.println("List al element before adding list al2: " + al2 + "\nList Size : " + al2.size());
		System.out.println("====================================");

		// Adding second list elements to the first list
		list.addAll(al2);
		System.out.println("List arraylist-list element after adding al2 : " + list + "\nList Size : " + list.size());
		System.out.println("====================================");

		// Adding second list elements to the first list at specific position
		al2.addAll(1, list);
		System.out.println("After adding list into al2: " + al2 + list + "\nList Size : " + al2.size());
		System.out.println("====================================");

		// Removing specific element from arraylist
		System.out.println("remove Vijay from collection: " + al2.remove("Vijay"));
		System.out.println("====================================");
		System.out.println("List al2 element after remove 'Vijay' : " + al2 + "\nList Size : " + al2.size());
		System.out.println("====================================");

		// Removing specific element from arraylist on basis of index
		System.out.println("remove index '9' from collection: " + al2.remove(9));
		System.out.println("====================================");
		System.out.println("List al2 element after remove 'Vijay' : " + al2 + "\nList Size : " + al2.size());
		System.out.println("====================================");

		list.removeAll(al2);
		System.out.println("al2 element after removeAll from list : " + list + "\nList Size : " + list.size());
		System.out.println("====================================");

		System.out.println("Array-list elements: " + list);
		System.out.println("al2 list elements: " + al2);
		System.out.println("=====================================");

		list.add("Sonoo");

		list.retainAll(al2);// Same elements filter and all other element remove
		System.out.println("al2 list after retailAll(): " + list);
		System.out.println("=====================================");

		list.clear();
		System.out.println("Element after clear() from list : " + list + "\nList Size : " + list.size());
		System.out.println("*************************************");
// Generic: with the help of generic we can force collection to store similar type of data.
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
		// Removing elements on the basis of specified condition
		al.removeIf(str -> str.contains("Ajay"));
		/** Here, we are using Lambda expression */

		System.out.println("After invoking removeIf() method:\n" + al);
		System.out.println("======================================");
		
		Iterator<String> ref = al.iterator();
		// Not recommended...in this program collections
		int i =0;
		while (ref.hasNext()) {
			i++;
			System.out.println(i+"."+ref.next());
		}
		System.out.println("=====================================");
		/** Here, we are using Lambda expression */
		al.forEach(str1 -> System.out.println(str1) );

		System.out.println("=====================================");
		
		Collections.sort(al);
		System.out.println("After sorting Elements of collection: " + al);
		System.out.println("---------------------------------");
		
		Collections.reverse(al);
		System.out.println("Reversing sorted Elements of collection: " + al);
		System.out.println("=====================================");
		
		ArrayList list0 = new ArrayList();
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new ArrayList<Integer>();

		LinkedList list3 = new LinkedList();
		List<String> list4 = new LinkedList<String>();
		List<Integer> list5 = new LinkedList<Integer>();
		
		Vector list6 = new Vector();
		List<String> list7 = new Vector<String>();
		List<Integer> list8 = new Vector<Integer>();
	}
}
