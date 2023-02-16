package collection;

import java.util.ArrayList;

public class ArrayLI {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Apple");

		list.add("Chikoo");
		list.add(null);
		list.add("Papaya");

		list.add("Mango");
		
		for(String li:list)
			System.out.println(li);

	}

}
// allow duplicate value maintain insertion order accept null value