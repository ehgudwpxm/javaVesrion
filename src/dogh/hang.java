package dogh;

public class hang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = false;
		
		char a = 'a';
		
		b = (a == 'a')? true : false;
		
		System.out.println("b : " + b);
		
		
		String[] arr = {"��", "��", "��"};
		
		StringBuilder bd = new StringBuilder();
		
		for(int i=0; i<arr.length; ++i) {
			bd.append(arr[i]);
		}
		System.out.println(bd);
		
		
		String gasa = "���ѹα� �Ϻ� �̱� ��������";
		System.out.println("replace : " + gasa.replace("����", "����"));
		System.out.println("replace : " + gasa.replaceFirst("����", "����"));
		
	}

}
