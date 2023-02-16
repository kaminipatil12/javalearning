package collection;

import java.util.Iterator;
import java.util.Stack;

public class Stackkkk {

	public static void main(String[] args) {
		Stack<String> stack=new Stack<String>();
		stack.push("Mango");
		stack.push("Apple");
		stack.push("Chikoo");
		stack.push("Papaya");
		stack.push("Mango");
		stack.push("Papaya");
		
		stack.pop();
		
		Iterator<String> loop=stack.iterator();
		
		while(loop.hasNext()) {
			System.out.println(loop.next());

	}
}
}//in stack last in first out
