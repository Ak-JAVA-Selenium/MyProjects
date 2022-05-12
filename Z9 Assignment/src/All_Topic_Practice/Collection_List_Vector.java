package All_Topic_Practice;

import java.util.*;

public class Collection_List_Vector {

	public static void main(String[] args) {

		Vector<Integer> list = new Vector<Integer>();

		System.out.println("Elements :" + list);
		System.out.println("Capacity : " + list.capacity());
		System.out.println("Size : " + list.size());
		list.setSize(6);
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(500);
		list.add(600);
		System.out.println("Elements :" + list);
		System.out.println("Size : " + list.size());
		System.out.println("Capacity : " + list.capacity());
		list.addElement(1000);
		list.addElement(900);
		list.addElement(800);
		list.addElement(700);
		System.out.println("Elements :" + list);
		for (Integer ref : list) {
			System.out.println(ref);
		}
		list.add(0);
		System.out.println("Elements :" + list);
		System.out.println("Capacity : " + list.capacity());
	}
}
