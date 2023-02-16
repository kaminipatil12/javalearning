package exception;

public class Test1 {
public static void main(String[]args) throws ArithmeticException
{
	System.out.println(1);
	
	System.out.println(2);
	System.out.println(3);
	try {
		System.out.println(100/0);//exception
	}
	catch(ArithmeticException ref) {
		System.out.println(ref.getMessage());
	}
	System.out.println(4);
	System.out.println(5);
	System.out.println(6);
}
}
//we can have multiple catch under one try
//