package abstraction;

public class Class2 extends Class1 {

	@Override
	void mutualfund() {
		// TODO Auto-generated method stub // abstraction means we know functionalty of project
		System.out.println("implemented"); //but not implementationright now
	}
	public static void main(String[]args)
	{
		Class2 ob=new Class2();
		ob.StockExchange();
		ob.mutualfund();
	}

}
