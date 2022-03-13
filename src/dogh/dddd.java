package dogh;

public class dddd {
	public static void main(String args[]) {
		
		String locale = "국어_대한민국";
		
		String[] arg = locale.split("_");
		
		//System.out.println(arg[0] + " " + arg[1]);
		
		if(arg == null || arg.length < 2) System.out.println("zzzz");
		else System.out.println("dddd");	
		
		
		for(int i=0; i<arg.length; ++i) {
			System.out.println(arg[i]);
		}
		
		String num = "1231424142";
		int newnum = Integer.parseInt(num);
		System.out.println(newnum);
	
		if(num.equals("1231424142")) {
			System.out.println("야호");
		}
		
		String str = "김맹꽁서울대구부산";  //세미크론
		
		try {
		System.out.println(str.substring(20));
		} catch(Exception e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
		} finally {
			System.out.println("예외처리 완료");
		}
		
		
		System.out.println(str.substring(2,5));
		
		
		
		
		
		
		
		
		
	}
}
