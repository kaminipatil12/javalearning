package interfacee11;

public class Child implements L1,L2{

	@Override
	public void t1() {
		// TODO Auto-generated method stub
		
	}//if same method name and same arg methods are present in L1 and L2 then only 2 method
     //among4 is implemented
	@Override
	public void t2() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[]args)
	{
		System.out.println("only 2 method among 4 method are implemented");
	}


}
