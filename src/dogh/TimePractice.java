package dogh;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class TimePractice {
	
	public static void main(String[] args) throws ParseException {
		
		String d1 = "2022/03/13";
		String d2 = "2022/03/15";
		
		Date f1 = new SimpleDateFormat("yyyy/MM/dd").parse(d1);
		Date f2 = new SimpleDateFormat("yyyy/MM/dd").parse(d2);
		
		//getTime() 은 1초 = 1000밀리초
		
		long diff = f2.getTime() - f1.getTime();
		long secDiff = diff / 1000;
		long minDiff = diff / 60000;
		long hourDiff = diff / 3600000;
		long dayDiff = diff / (3600000 * 24);
		
		System.out.println(hourDiff);
		
		
		long en = 350 * 10000;
		double kawase = 1061 / (double)100;
		System.out.println(kawase);
		double won = en * kawase;
		
		System.out.println(won);
		DecimalFormat df = new DecimalFormat("금액 : ,###원");
		
		String a = df.format(won);
		System.out.println(a);
		
		System.out.println("00------------------------");
		
		double number = 120000;
		
		String new_num = String.valueOf(number);
		String new_num2 = Double.toString(number);
		
		
		
		System.out.println("금액".concat(new_num2));
		System.out.println("------------------------");
		
		
		Random random = new Random();
		//int rnum = random.nextInt(44) + 1;
		
		int[] lotto = new int[6];
		int rnum = 0;
		int i = -1;
		while(true) {
			rnum = random.nextInt(44) + 1;
			++i;
			lotto[i] = rnum;
			for(int s=0 ; s < i; ++s) {
				
				if(lotto[s] == lotto[i]) {
					System.out.println("중복발생!");
					--i;
				}
				
			}
			
			if(i > 4) break;
			
		}
		
		for(int n : lotto) {
			System.out.print(n + " ");
		}
	}
}
