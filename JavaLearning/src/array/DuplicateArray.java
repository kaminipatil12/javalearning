package array;

public class DuplicateArray {
public static void main(String[]args) {
 int[]a= {11,44,30,40,40,30,50,23,11,58,98};
 
 for(int i=0;i<a.length;i++) {
	 for(int j=i+1;j<a.length;j++)	{
		if(a[i]==a[j])
			System.out.println(a[j]);
	 }
     }
		
	}

}
