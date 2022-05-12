package All_Topic_Practice;

import java.util.LinkedList;

public class Collection_List_LinkedList {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		System.out.println("Elements : " + list);

		list.add("Akshay");
		list.add("Dhanno");
		list.add("Vishal");
		list.add("Rohit");

		System.out.println("After invoking add(Elements) method: " + list);
		System.out.println("===============================");

		list.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element) method: " + list);
		System.out.println("===============================");

		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("Sonoo");
		ll2.add("Hanumat");

		list.addAll(ll2);
		System.out.println("After invoking addAll(Collection<? extends E> c) method: " + list);
		System.out.println("===============================");

		LinkedList<String> ll3 = new LinkedList<String>();
		ll3.add("John");
		ll3.add("Rahul");

		list.addAll(1, ll3);
		System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: " + list);
		System.out.println("===============================");

		list.addFirst("Lokesh");
		System.out.println("After invoking addFirst(E e) method: " + list);
		System.out.println("===============================");

		list.addLast("Harsh");
		System.out.println("After invoking addLast(E e) method: " + list);
		System.out.println("===============================");
	}
}
