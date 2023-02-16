package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");

		list.add("Chikoo");

		list.add("Papaya");

		list.add("Mango");
		
		Iterator<String> loop=list.iterator();
		
		while(loop.hasNext()) {
			System.out.println(loop.next());
		}		
	}
}// ArrayList maintain insertion order duplicate values
