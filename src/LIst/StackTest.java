package LIst;

import java.util.*;

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		
		stack.push("둘리");
		stack.push("마이콜");
		stack.push("도우넛");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		//LIFO
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println(stack.pop());
		//Stack이 비어있는 경우 EmptyStackException발생
		//System.out.println(stack.pop());
		
		

	}

}
