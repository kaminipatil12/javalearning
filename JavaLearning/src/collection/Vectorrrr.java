package collection;

import java.util.Iterator;
import java.util.Vector;

public class Vectorrrr {

	public static void main(String[] args) {
		Vector<String> vc=new Vector<String>();
		vc.add("Mango");
		vc.add("Apple");

		vc.add("Chikoo");

		vc.add("Papaya");

		vc.add("Mango");
		
		Iterator<String> loop=vc.iterator();
		
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}		

	}
 // uses synchronised method
}
