package methodpractice;

public class Nonstatictostatic {
	public void m1()
	{
		System.out.println("m1 is nonstatic");
	}
	public static void m2()
	{
		Nonstatictostatic obj=new Nonstatictostatic();
		obj.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        m2();
	}

}
