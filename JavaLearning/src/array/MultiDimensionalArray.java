package array;

public class MultiDimensionalArray {
	public static void main(String[]args) {
		//single dimension array
		int b[]= {11,22,33,10,20};
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
		
		System.out.println(" ");
		//multidimension array
		int a[][]= {{11,22,33},{10,20,30},{40,50,60}};
		//printing
		for(int i = 0; i < 3; i++) {
		for(int j=0;j<3;j++) {
		System.out.print(a[i][j]+" ");	
	}
      System.out.println();
}
	}
}
