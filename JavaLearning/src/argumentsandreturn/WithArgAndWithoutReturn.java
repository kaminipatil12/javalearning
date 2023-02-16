package argumentsandreturn;

public class WithArgAndWithoutReturn {
	public void m1(int a)
	{
		System.out.println(a);
	}
	public static void m2(boolean c)
	{
		System.out.println(c);
	}
		public static void main(String[]args)
		{
			WithArgAndWithoutReturn obj=new	WithArgAndWithoutReturn();
			obj.m1(100);
			m2(false);
			
		}
	}


