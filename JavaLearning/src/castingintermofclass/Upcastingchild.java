package castingintermofclass;

public class Upcastingchild extends Upcastingparent{
	static void m3() {     //static ahe mnun directly main method mde call kru shklo 
		System.out.println("m3 child");
	}

	public static void main(String[] args) {
		Upcastingparent childobj=new Upcastingchild();
         childobj.m1();
         childobj.m2();    //compiler allow this
         m3();
         Upcastingparent pobj=(Upcastingparent)childobj;
         pobj.m1();       //programmer allow this
         pobj.m2();
	}

}
