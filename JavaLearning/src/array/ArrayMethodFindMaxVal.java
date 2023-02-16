package array;

public class ArrayMethodFindMaxVal {
	//find maximum value from array
	public static void m1(int[] a) {
		int g = a[0];
		for(int i=1;i<a.length;i++)
			if(g<a[i])
				g=a[i];
		System.out.println("minimum value present in array="+g);
	}
   public static void main(String[]args) {
	   int[]a= {60,45,50,30,20,10};
	   m1(a) ;
   }

}
