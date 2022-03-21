package collectionPractice;

import java.util.HashMap;

public class HashMapPractice {
	public static void main(String[] args) {
		/*
		 * put, get
		 * keySet() / values()
		 * containsKey() / containsValue();
		 * replace()
		 * remove()
		 * clear()
		 */
		
		HashMap<String, String> map = new HashMap<>();
		
		String[] arr = new String[] {"a", "b", "c", "d", "e"};
		String[] arr2 = new String[] {"���ø���", "����� �÷���", "��í", "�����÷���", "����ù�"};
		
		for(int i=0; i<arr.length; ++i) 
			map.put(arr[i], arr2[i]);
			
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsValue("����"));
		
		
		map.remove("a");
		System.out.println(map);
		map.clear();
		System.out.println(map.keySet());
		
		
		
		
	}
}
