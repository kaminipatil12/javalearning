package accessspecifier;

public class Test1 {      //for public class
	public static int a=30; //when we declare variable as public then we call directly 
	//witin inside or outside package
	static int b=20;   //for default within a package only
	private static int c=90; ///for private we can access throthout the class only
	protected static int d=60;// for protected 
	public final static int e=40; //for final 
public static void m1()
{
	System.out.println("this is method of test1");
}
public static void m2()
{
	System.out.println("method of test1");
}
public static void main(String[]args)
{
	m2();
System.out.println(a);
System.out.println(c);
System.out.println(e);

}
public static void m3()
{
	System.out.println("method of test1");
}
}
