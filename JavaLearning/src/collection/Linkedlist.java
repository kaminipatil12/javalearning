package collection;

import java.util.LinkedList;
import java.util.Iterator;

public class Linkedlist {

		public static void main(String[] args) {
			LinkedList<String> list=new LinkedList<String>();
			list.add("Mango");
			list.add("Apple");

			list.add("Chikoo");

			list.add("Papaya");

			list.add("Mango");
			
			Iterator <String>loop=list.iterator();
			
			while(loop.hasNext()) {
				System.out.println(loop.next());
			}		
		}
	// linkedList maintain insertion order duplicate values and manipulation is fast

	}


