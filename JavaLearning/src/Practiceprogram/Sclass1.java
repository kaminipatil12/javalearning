package Practiceprogram;

public class Sclass1 {

	public Sclass1()
	{

	 this(true);
			System.out.println("this is cons for same class");
	}
	public Sclass1(boolean m)
		{
			System.out.println("this is cons for boolean value");
		}
	 public static void main(String[]args)
	  {
		  new Sclass1();
	  }
	}

