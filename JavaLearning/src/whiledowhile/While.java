package whiledowhile;

public class While {
	public static void main(String[]args)
	{ 
		System.out.println("0 to 100 even no ");
		int a=0;
		while(a<=100)
		{ if(a%2==0)
		{
			System.out.print(a + " ");
		}
		a++;	
		}
		
		System.out.println("\n\n100 to 0 even no ");
		int b=100;
		while(b>=0)
		{ if(b%2==0)
		{
			System.out.print(b + " ");
		}
		b--;	
		}
		
		System.out.println("\n\n0 to 100 odd no ");
		int c=0;
		while(c<=100)
		{ if(c%2!=0)
		{
			System.out.print(c + " ");
		}
		c++;	
		}
		
		System.out.println("\n\n100 to 0 odd no ");
		int d=100;
		while(d>=0)
		{ if(d%2!=0)
		{
			System.out.print(d + " ");
		}
		d--;
	}

}
}
