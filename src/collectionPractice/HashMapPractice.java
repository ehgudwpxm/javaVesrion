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
		String[] arr2 = new String[] {"≥›«√∏ÆΩ∫", "µ¡Ó¥œ «√∑ØΩ∫", "ø”√≠", "ƒÌ∆Œ«√∑π¿Ã", "∏Ù∂ÛΩ√πÊ"};
		
		for(int i=0; i<arr.length; ++i) 
			map.put(arr[i], arr2[i]);
			
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		System.out.println(map.containsKey("a"));
		System.out.println(map.containsValue("ø”¬˜"));
		
		
		map.remove("a");
		System.out.println(map);
		map.clear();
		System.out.println(map.keySet());
		
		
		
		
	}
}
