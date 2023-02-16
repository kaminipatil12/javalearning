package interfacee11;

public class Child1 implements L3,L4 {

	@Override
	public void t1(boolean c) {
		// TODO Auto-generated method stub
		
	}// if method name are same but argument different then child implement both the methods

	@Override
	public void t1(int a) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[]args)
	{
		System.out.println("both method are implemented");
	}

}
