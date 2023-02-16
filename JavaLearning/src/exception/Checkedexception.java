package exception;

public class Checkedexception {
	public static void main(String[]args) throws ArithmeticException,InterruptedException
	{
		System.out.println(1);
		System.out.println(2);
		Thread.sleep(5000);
		System.out.println(3/0);
		System.out.println(4);
		System.out.println(5);

	}

}
// it is called as compile time exception