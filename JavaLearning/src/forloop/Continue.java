package forloop;

public class Continue {
	public static void main(String[]args)
	{
		System.out.println("1 t0 100 even no using continue keyword");
		 for(int i=1;i<=100;i++)
		    {if(i%2!=0)
		    	continue;
		    	System.out.print(i +" \t");
		    	
		    }
		 System.out.println("\n\n 100 t0 1 odd no using continue keyword");
		 for(int i=100;i>=1;i--)
		    {if(i%2==0)
		    	continue;
		    	System.out.print(i +" \t");
		    	
		    }

		 
	}

}
