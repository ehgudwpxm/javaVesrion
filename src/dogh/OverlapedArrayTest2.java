package dogh;

public class OverlapedArrayTest2 {

	public static void main(String[] args) {
		
		
		//int[] arr = {1, 2, 2, 4, 4, 4, 4, 4, 12, 12, 22, 24, 55, 55, 12, 12, 24};
		int[] arr = {1, 2, 2, 4, 4, 3, 3, 3, 4, 4, 10};
		int len = arr.length;
		
		String arr2 = "";
		int i = 0;
		
		while(true) {
			
			++i;
			
			if(arr[i-1] != arr[i]) {
				arr2 += String.valueOf(arr[i-1]) + ", ";
				
			}
			
			if(i == len - 1) {
				if(arr[i-1] == arr[i]) 
					arr2 += String.valueOf(arr[i-1]);
				else 
					arr2 += String.valueOf(arr[i]);
					
				break;
			}
			
			
			
		}
		
		System.out.println(arr2);
		
		
		

	}

}
