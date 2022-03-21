package collectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("¿Ã");
		list.set(0, "±Ë");
		System.out.println(list);
		list.add(0, "πÆ");
		System.out.println(list);
		
		
		
		List<String> list1 = new LinkedList<>();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");

		//System.out.println(list1.getClass());
		System.out.println(list1.size());
		int index = list1.size() - 1;
		
		System.out.println(list1.get(index));
		
		
		
		
		
	}
}
