package whiledowhile;

public class DoWhile {
	public static void main(String[]args)
	{
		System.out.println("0 t0 100 even no");
		int m=0;
		do {
			if(m%2==0)
			System.out.print(m +" ");
			m++;
		}
		while(m<=100);
		
		System.out.println("\n\n100 t0 0 even no");
		int n=100;
		do {
			if(n%2==0)
			System.out.print(n +" ");
			n--;
		}
		while(n>=0);;
		
		System.out.println("\n\n0 t0 100 odd no");
		int k=0;
		do {
			if(k%2!=0)
			System.out.print(k +" ");
			k++;
		}
		while(k<=100);
		
		System.out.println("\n\n100 t0 0 odd no");
		int l=100;
		do {
			if(l%2!=0)
			System.out.print(l +" ");
			l--;
		}
		while(l>=0);;
	}
}

