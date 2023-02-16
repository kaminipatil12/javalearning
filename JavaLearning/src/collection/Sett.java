package collection;


import java.util.HashSet;

public class Sett {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
        set.add("Mango");
		set.add("Apple");
		set.add("");
		set.add(null);
		set.add(null);
		set.add("Papaya");
		 set.add("grapes");
		 set.add("Papaya");
		 set.add("grapes");
		 
		 for(String s:set)
			 System.out.println(s);
	}

}// does not maintain insertion order and not allows duplicate values accept null values
