package variable;

public class Variabletypes2 {
	int a=20;//nonstatic var
	public  void m1()
	{
		int a=10;//local var

		System.out.println(this.a);

	
	
	System.out.println(a);//only in case of nonstatic method
		
	}
	public static void main(String[]args)
	{
		Variabletypes2 obj=new Variabletypes2();
		     obj.m1();
	}

}
