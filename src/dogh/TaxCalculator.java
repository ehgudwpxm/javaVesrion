package dogh;

import java.util.Scanner;

public class TaxCalculator {
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("월급(1) / 연봉(2) 입력 : ");
			int chk = scanner.nextInt();
			int mon = 0;
			
			switch(chk) {
				case 1:
					System.out.print("월급입력 : ");
					mon = scanner.nextInt();
					mon = mon * 12;
					
					break;
					
				case 2:
					System.out.print("연봉입력 : ");
					mon = scanner.nextInt();
					break;
				
				case 3:
					//System.exit(0);
					break;
					
				default : 
					//System.out.println("잘못 입력하셨습니다. 종료합니다.");
					continue;
					
			}
				 
			System.out.println("break누름");
			
			if(mon >= 1) {
				int a = 1200;
				int b = 4600;
				int c = 8800;
				int d = 15000;
				
				double tax = 0;
				double rate = 0;
				
				if(mon <= a) 
					tax = mon * 0.06;
					
				else if(mon <= b) 
					tax = (a * 0.06) + (mon - a) * 0.15;
				
				else if(mon <= c)
					tax = (a * 0.06) + (b - a) * 0.15 + (mon - b) * 0.24;
				
				else if(mon <= d) 
					tax = (a * 0.06) + (b - a) * 0.15 + (c - b) * 0.24 + (mon - c) * 0.35;
				
				else 
					tax = (a * 0.06) + (b - a) * 0.15 + (c - b) * 0.24 + (d - c) * 0.35 + (mon - d) * 0.38;
				
				
				int final_tax = (int)tax;
				
				rate = tax / mon;
				rate = rate * 100;
				
				System.out.println("예상 연간 세액 : " + final_tax + "만원");
				System.out.print("총 세율 : ");
				System.out.printf("%.2f", rate);
				System.out.print("%");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
