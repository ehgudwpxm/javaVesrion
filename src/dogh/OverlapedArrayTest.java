package dogh;

public class OverlapedArrayTest {
	//중복된 배열을 중복되지 않게 바꾸기.
	
	public static int[] arrayNumReturn(int[] arr, int length) {
		
		int[] tmp  = new int[length];
		int a = 0;
		
		for(int i=0; i<length-1; ++i) {
			if(arr[i] != arr[i+1]) 
				tmp[a++] = arr[i];
		
		}
		
		tmp[a++] = arr[length-1]; 
		
		for(int j=0 ; j<a; ++j) {
			
			arr[j] = tmp[j];
			
		}
		
		
		return tmp;
	}
	
	
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 4, 4, 4, 4, 4, 12, 12, 22, 24, 55, 55, 12};
		int len = arr.length;
		
		int[] res = arrayNumReturn(arr, len);
		
		for(int i : res) {
			if(i != 0) System.out.print(i + " ");
		}
		
		
		
		
	}
	
}
