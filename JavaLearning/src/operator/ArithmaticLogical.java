package operator;

public class ArithmaticLogical {
	static int a=10;
	static int b=30;
	static int c;
	public static void main(String[]args)
	{
		c=a+b;
		System.out.println(c);
		c++;                   //postincre
		System.out.println(c);
		c=b-a;
		System.out.println(c);
		++c;                    //preincre
		System.out.println(c);
		c=a*b;
		System.out.println(c);
		c--;                     //postdec
		System.out.println(c);
		c=b/a;
		System.out.println(c);
		--c;                     //predec
		System.out.println(c);
		
	 if(a>b)
	 System.out.println("a is greater");
	 else
	 System.out.println("b is greater");
	 
	 if(a<b)
	 System.out.println("a is greater");
	 else
	 System.out.println("b is greater");
	 
	 if(a==b)
	 System.out.println("Right");
     else
	 System.out.println("Wrong");
	 
	 if(!(a==b))
     System.out.println("Right");
	 else
	 System.out.println("Wrong");
	 
	 if((a==10)&&(b==30))
     System.out.println("true");
	 else
	 System.out.println("false");	 
	 
	 if((a==10)||(b==30))
	 System.out.println("true");
	 else
	 System.out.println("false");	 
		 
	 	
	 
	 
	
	}
}
