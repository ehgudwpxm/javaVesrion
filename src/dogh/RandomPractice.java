package dogh;

import java.util.Random;

public class RandomPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Random random = new Random();
		
		
		//System.out.println(rd);
		//System.out.println(rd);
		
		//System.out.println(random.nextDouble());
		
		int stn = 0;
		while(true) {
			int rd = random.nextInt(11);
			if(rd > stn) 
				System.out.println(stn + "보다 큽니다. 나온값 : " + rd);
			else {
				System.out.println(rd);
				break;
			}
			
		}
		
		System.out.println("-----------------------");
		String[] arr = new String[2];
		System.out.println(arr.length);
		
		
		
		
	}

}
