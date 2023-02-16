package array;

public class SingleDimension {
public static void main(String[]args) {
 int[]a= {10,50,44,11,22,59,67};  //aaray using literals
 int[]ar=new int[5];  //array using new keyword
 ar[0]=11;
 ar[1]=12;
 ar[2]=13;
 ar[3]=14;
 ar[4]=15;
 for(int i=0;i<ar.length;i++)
 System.out.println(ar[i]);
}
}