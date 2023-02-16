package methodpractice;

public class Statictostatic {
	public static void m1()
	{
		System.out.println("m1 is static");
	}
	public static void m2()
	{
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     m2();
	}

}
