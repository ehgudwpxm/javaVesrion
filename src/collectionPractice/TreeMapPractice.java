package collectionPractice;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapPractice {
	
	public static void main(String[] args1212) {
		
		
		TreeMap<String, String> map = new TreeMap<>();
		
		String[] key = { "a", "c", "b", "d", "e" };
		String[] value = { "apple", "aanana", "candy", "dog", "enum" };
		
		for (int i = 0; i < key.length; i++)
			map.put(key[i], value[i]);
		
		// {a=apple, b=banana, c=candy, d=dog, e=enum}
		System.out.println(map);
		
		System.out.println(map.ceilingKey("a"));
		System.out.println(map.higherKey("a"));
		System.out.println(map.higherEntry("c"));
		
		//String some = map.higherEntry("e").toString();
		//System.out.println(some);
		String some = String.valueOf(map.higherEntry("e"));
		System.out.println(some);
		
		
		
		
		
		System.out.println(map.floorKey("c"));
		System.out.println(map.lowerKey("c"));
		
		
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		
		System.out.println(map.firstKey());
		System.out.println(map.firstEntry());
		
		System.out.println(map.lastKey());
		System.out.println(map.lastEntry());
		
		System.out.println(map.pollFirstEntry()); // a=apple을 반환하고 삭제함.
		System.out.println(map.entrySet());
		
		
		SortedMap<String, String> map2 = map.headMap("d", true); //true 안넣을수도 있다.
		SortedMap<String, String> map3 = map.tailMap("d");
		map3 = map.tailMap("d", false);
		System.out.println(map2.entrySet());
		System.out.println(map3.entrySet());
		
		
		
		
		
		
		
		
		
	}
}
