package error;

public class Errors {
	public void m1()
	{
		System.out.println("m1 running");
		m2();
	}
    public void m2()
    {
    	System.out.println("m2 running");
    	m1();
    }
    public static void main(String[]args)
    {
    	Errors ob=new Errors();
    	ob.m1();
    }
}
