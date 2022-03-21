package dogh;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class StarTest {

	public static void main(String[] args) {
		
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("ют╥б : ");
//		int num = scanner.nextInt();
//		
//		int mid = num / 2;
//		int j = 0;
//		int k = 0;
//		for(int i=0; i<num; ++i) {
//			if(i < mid) {
//				++j;
//				for(int a=0; a<j; ++a) {
//					System.out.print("*");
//				} System.out.println();
//			} 
//			
//			else {
//				
//				++k;
//				for(int a=0; a<k; ++a) {
//					System.out.print("*");
//				} System.out.println();
//				
//			}
//			
//			
//		}
		
		
		
		
		int num = 5;
		int k = 5;
		
		for(int i=0; i<num; ++i) {
			--k;
			for(int j=0; j<k; ++j) {
				System.out.print(" ");
			}
			for(int z=0; z<5-k; ++z) {
				System.out.print("0");
			}
			System.out.println();
		}
		
		
		for(int i=9; i>=2; --i) {
			
			for(int j=9; j>=1; --j) {
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		
		
		
		List<String> elements = Arrays.asList("a", "a1", "b", "b1", "c", "c1", "b");

		Optional<String> firstElement = elements.stream()
		        .filter(s -> s.startsWith("bz")).findFirst();
		
		System.out.println("findFirst: " + firstElement.get());
		
		Optional<String> firstElement2 = elements.stream().parallel()
				.filter(s -> s.startsWith("b")).findAny();
		
		System.out.println("findAny : " + firstElement2.get());
		
		
		

	}

}
