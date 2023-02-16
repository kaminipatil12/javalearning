package constructor;

public class Constructorr {
	public Constructorr(int maths,int phy,int chem,String name)
	{   
		System.out.println("Student name=" +name);
		System.out.println("maths=" +maths);
		System.out.println("phy=" +phy);
		System.out.println("chem=" +chem);
		System.out.println(" ");
		
	}
	public static void main(String[]args)
	{
		new Constructorr(70,89,90,"Anaya");
		new Constructorr(78,85,95,"Saisha");
		new Constructorr(80,88,91,"Anay");
	}

}
