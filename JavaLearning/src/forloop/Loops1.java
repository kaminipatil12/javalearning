package forloop;

public class Loops1 {
	public static void main(String[]args)
	{
		System.out.println("0 t0 100 odd no using for loop");
		 for(int i=0;i<=100;i++)
		    {if(i%2!=0)
		    	System.out.print(i +" \t");
		    	
		    }
		 System.out.println("\n\n100 t0 0 odd no using for loop");
		 for(int i=100;i>=0;i--)
		    {if(i%2!=0)
		    	System.out.print(i +" \t");
		    	
		    }

		 
	}
}
