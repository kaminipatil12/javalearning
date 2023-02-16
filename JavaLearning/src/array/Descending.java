package array;

public class Descending {
	public static void main(String[] args) {
		int[]a= {50,60,10,23,90,40,100,3,9,30,100,120,170,200};
	
		for(int i = 0; i < a.length; i++ ) {
		
			for(int j = i + 1; j < a.length; j++) {
			
				if (a [i] < a [j] ) {
				
					int temp = a[i];
					
					a[i] = a[j];
					
					a[j] = temp;
					
				}
			}
			System.out.print(a[i]+ " ");
		}
	}


}
