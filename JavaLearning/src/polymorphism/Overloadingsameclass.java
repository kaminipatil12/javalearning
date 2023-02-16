package polymorphism;

public class Overloadingsameclass {
	public void m1()
	{
		System.out.println("overloading method without arg");
	}
	public void m2(int a)
	{
		System.out.println("overloading method with arg");
	}
	public static void main(String[]args)
	{
		Overloadingsameclass ab=new Overloadingsameclass();
		ab.m1();
		ab.m2(10);
		System.out.println("this is overloading in same class");
	}

}
