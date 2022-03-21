package collectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		//isEemty()
		// contains()
		// addAll()
		// containsAll()
		// retainAll()
		// removerAll()
		// size()
		
		
		List<Integer> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list.add(4);
		list.add(30);
		list.add(8);
		list.add(32);
		list.add(2);
		
		
				
		list2.add(58);
		list2.add(100);
		//list2.add(32);
		list2.add(41);
		list2.add(40);
	
		System.out.println(list.containsAll(list2));
	
		//list.removeAll(list2);
		//System.out.println(list);
		
		list.retainAll(list2);
		System.out.println(list);
		
		
		
		
		
	}
}
