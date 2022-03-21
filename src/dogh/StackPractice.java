package dogh;

import java.util.Stack;

public class StackPractice {
	
	
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
		stack.push(12);
		stack.push(52);
		stack.push(100);
		stack.push(200);
		
		
		
		System.out.println(stack.peek());
		if(!stack.contains(200)) {
			System.out.println("stack이 200을 포함하고 있지 않습니다.");
		} else System.out.println("stack은 200을 포함합니다.");
		
		
		
		
		
		
		
		
		
		
	}
}
