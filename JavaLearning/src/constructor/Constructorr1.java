package constructor;

public class Constructorr1 {

	static int maths;
	static int phy;
	static int chem;
	static String s;
	public  Constructorr1(int maths,int phy,int chem,String s)
	{
		this.maths=maths;
		this.phy=phy;
		this.chem=chem;
		this.s= s;
	}
	public static void main(String[]args)
	{
		new Constructorr1(90,40,70,"Saisha");
		System.out.println("maths=" +maths);
	}
}
