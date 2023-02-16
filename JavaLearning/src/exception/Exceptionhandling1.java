package exception;

public class Exceptionhandling1 {
	public static void main(String[]args)
	{
	System.out.println(1);
	System.out.println(2);
	try {
		System.out.println(100/2);
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
//exception occur nhi hua isliye catch block nh hua run direct finally run hua