package exception;

public class Exceptionhandling {
	public static void main(String[]args)
	{
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(100/0);
	}
	catch(ArithmeticException refvar)
	{
		System.out.println("cannot divide by zero");
	}
	finally {
		System.out.println("exception occur or not finally will always run");
	}
	System.out.println(3);
	System.out.println(4);
	System.out.println(5);
				
	}

}
