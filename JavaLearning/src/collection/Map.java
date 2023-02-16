package collection;

import java.util.HashMap;
import java.util.Set;


public class Map {

	public static void main(String[] args) {
		HashMap< Integer,String> mapping=new HashMap<Integer,String>();
		mapping.put(12,"avdhut");
		mapping.put(15,"nilay");
		mapping.put(60," ginger");
		mapping.put(18,null );
		mapping.put(10,"ginger");
  // key cannot b duplicate
		Set< Integer>keys=mapping.keySet();
		for(int key:keys)
			System.out.println(key+"  " +mapping.get(key));
	}

}// allow duplicate values
