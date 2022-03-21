package dogh;


interface A {
	int a = 10;
	
	public void testA();

}

interface B {
	int b = 12;
	
	public default void testB() {
		System.out.println("TEST B !!");
	}
}

interface D {
	int d = 555;
	public abstract void testD();
	
	public static void testDD() {
		System.out.println("D�Դϴ�.");
		
	}
}

interface C extends A,B { //�������̽��� ���߻�� ����
	int c = 20;
	int c2 = a - b;
	
	public static int testC() {
		System.out.println("c2�� �����մϴ�.");
		return c2;
	}
	
}



public class E implements C,D{
	
	int res = c2 + 1 + a;
	
	@Override
	public void testA() {
		System.out.println("testA�Դϴ�.");
		
	}
	
	@Override 
	public void testD() {
		System.out.println("testD�Դϴ�.");
		
	}
	
	
	public static void main(String[] args) {
		
		E e = new E();
		e.testA();
		e.testB(); //default�� �������� �ʰ� ����
		e.testD();
		D.testDD();
		
		C.testC();
		
		
		
		
	}

}
