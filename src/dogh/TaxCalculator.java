package dogh;

import java.util.Scanner;

public class TaxCalculator {
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("����(1) / ����(2) �Է� : ");
			int chk = scanner.nextInt();
			int mon = 0;
			
			switch(chk) {
				case 1:
					System.out.print("�����Է� : ");
					mon = scanner.nextInt();
					mon = mon * 12;
					
					break;
					
				case 2:
					System.out.print("�����Է� : ");
					mon = scanner.nextInt();
					break;
				
				case 3:
					//System.exit(0);
					break;
					
				default : 
					//System.out.println("�߸� �Է��ϼ̽��ϴ�. �����մϴ�.");
					continue;
					
			}
				 
			System.out.println("break����");
			
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
				
				System.out.println("���� ���� ���� : " + final_tax + "����");
				System.out.print("�� ���� : ");
				System.out.printf("%.2f", rate);
				System.out.print("%");
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
