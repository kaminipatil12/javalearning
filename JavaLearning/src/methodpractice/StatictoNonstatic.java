package methodpractice;

public class StatictoNonstatic {
	public static void m1()
	{
	System.out.println("m1 is static");
	}
	public void m2()
	{
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatictoNonstatic obj=new StatictoNonstatic();
		obj.m2();
	}

}
