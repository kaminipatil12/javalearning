package inheritance;

public class Parent {

	public void m1()
	{
	System.out.println("it is nonstatic method");
}
	public static void main(String[]args)
	{
		Parent ob=new Parent();
		ob.m1();
	}
}