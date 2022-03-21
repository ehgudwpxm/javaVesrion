package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonMethod {
	
//	1. max, min
//	2. sort() : 오름차순으로 배열
//	3. shuffle() : 무작위 섞기
//	4. binarySearch() : 첫번째 인덱스부터 찾아나가기
//	5. disjoint() : 서로 비교
//	6. copy() : 복사
//	7. reverse() : 요소들을 거꾸로 다시 배열

	public static void main(String[] args) {
		
		Integer[] list = {1, 2000, 500, 2500, 52};
		
		List<Integer> arraylist = new ArrayList<>(Arrays.asList(list));
		
		//for(int i : arraylist) System.out.print(i+ " ");		
		
		System.out.println(Collections.max(arraylist));
		System.out.println(Collections.min(arraylist));
		
		Collections.sort(arraylist);
		System.out.println(arraylist);
		
		Collections.sort(arraylist, Collections.reverseOrder());
		System.out.println(arraylist);
		
		Collections.shuffle(arraylist);
		System.out.println(arraylist);
	
		System.out.println(Collections.binarySearch(arraylist, 500));
		
		Collections.reverse(arraylist);
		System.out.println(arraylist);
		
		
		
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		
		
		list1.add(1);
		list1.add(2);
		list1.add(-1);
		list2.add(3);
		list2.add(5);
		
		Collections.copy(list1, list2);  // 자료형이 서로 같고 list1의 크기가 무조건 list2보다 커야한다.
		
		System.out.println(list1);
		
		
		
		

	}

}
