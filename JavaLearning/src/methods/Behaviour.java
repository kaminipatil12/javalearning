package methods;

public class Behaviour {
	public void m1()
	{
	System.out.println("jvm read 1");	
	}
public static void m2()
{
	
}
{
System.out.println("jvm read 2");
}

public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("jvm read 3");
m2();
Behaviour babu= new Behaviour(); 
babu.m1();
	}

}
