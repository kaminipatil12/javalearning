package accessspecifier;

 class Test3 extends Test5{   //for default class cannot use in diff package use in same package
	 public static void m3()
	 {
		 System.out.println("method of test3");
	 }
public static void main(String[]args)
{
    m5();
	m3();
	
}
}
