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
		System.out.println("D입니다.");
		
	}
}

interface C extends A,B { //인터페이스는 다중상속 가능
	int c = 20;
	int c2 = a - b;
	
	public static int testC() {
		System.out.println("c2를 리턴합니다.");
		return c2;
	}
	
}



public class E implements C,D{
	
	int res = c2 + 1 + a;
	
	@Override
	public void testA() {
		System.out.println("testA입니다.");
		
	}
	
	@Override 
	public void testD() {
		System.out.println("testD입니다.");
		
	}
	
	
	public static void main(String[] args) {
		
		E e = new E();
		e.testA();
		e.testB(); //default라서 구현하지 않고도 가능
		e.testD();
		D.testDD();
		
		C.testC();
		
		
		
		
	}

}
