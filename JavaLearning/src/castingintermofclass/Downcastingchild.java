package castingintermofclass;

public class Downcastingchild extends Downcastingparent{
	void m3() {
	 System.out.println("m3 child");	
	}
	

	public static void main(String[] args) {
		Downcastingparent pref=new Downcastingchild();
		Downcastingchild cref=(Downcastingchild)pref;
		cref.m1();
		cref.m2();
		cref.m3();
		

	} // downcasting

}
