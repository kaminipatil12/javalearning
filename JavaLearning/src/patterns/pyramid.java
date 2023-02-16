package patterns;

public class pyramid {
	public static void main(String[]args)
	   {
		int k=5;
		for(int i=1;i<=5;i++) {
		for(int p=1;p<=k;p++) {
			System.out.print("  ");
		}
		k--;
		
		for(int j=1;j<=i;j++) {
			System.out.print(" * ");
		}
		System.out.println("  ");
		}
			
	   }

}
