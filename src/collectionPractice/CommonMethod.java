package collectionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommonMethod {
	
//	1. max, min
//	2. sort() : ������������ �迭
//	3. shuffle() : ������ ����
//	4. binarySearch() : ù��° �ε������� ã�Ƴ�����
//	5. disjoint() : ���� ��
//	6. copy() : ����
//	7. reverse() : ��ҵ��� �Ųٷ� �ٽ� �迭

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
		
		Collections.copy(list1, list2);  // �ڷ����� ���� ���� list1�� ũ�Ⱑ ������ list2���� Ŀ���Ѵ�.
		
		System.out.println(list1);
		
		
		
		

	}

}
