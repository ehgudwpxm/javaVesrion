package dogh;

public class hang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		char a = 'a';
		
		b = (a == 'a')? true : false;
		
		System.out.println("b : " + b);
		
		
		String[] arr = {"이", "도", "형"};
		
		StringBuilder bd = new StringBuilder();
		
		for(int i=0; i<arr.length; ++i) {
			bd.append(arr[i]);
		}
		System.out.println(bd);
		
		
		String gasa = "대한민국 일본 미국 대한제국";
		System.out.println("replace : " + gasa.replace("대한", "조선"));
		System.out.println("replace : " + gasa.replaceFirst("대한", "조선"));
		
	}

}
