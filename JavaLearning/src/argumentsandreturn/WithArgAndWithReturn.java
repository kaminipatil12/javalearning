package argumentsandreturn;

public class WithArgAndWithReturn {
	public int m1(double a)
	{
		return 55;
	}
    public static boolean m2( char a)
    {
    	return true;
    }
    public static void main(String[]args)
    {
    	WithArgAndWithReturn obj=new WithArgAndWithReturn();
    	System.out.println(obj.m1(5.5));
    	
    	System.out.println(m2('a'));
    	
    }
}
