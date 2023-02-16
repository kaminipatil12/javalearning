package forloop;

public class Break {
	public static void main(String[]args)
	{
		System.out.println("break the loop for 5 using  break keyword");
		 for(int i=1;i<=5;i++)
		    {if(i>4)
		    	continue;
		    	System.out.print(i +"\t");
		    	
		    }
		 System.out.println("5 is break");
}
}
