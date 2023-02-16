package collection;

import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueee {
 public static void main(String[]args) {
	 PriorityQueue<String> q=new PriorityQueue<String>();
	 q.add("Mango");
	 q.add("Apple");
	 q.add("Papaya");
	 q.add("grapes");
	 
	 System.out.println("Head" +q.element());
	 System.out.println("Head" +q.peek());
	 
	 q.remove();
	 
	 System.out.println("Head" +q.element());
	 q.poll();
	 Iterator i2=q.iterator();
	 while(i2.hasNext()) {
			System.out.println(i2.next());
 }
}
}