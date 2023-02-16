package methodpractice;

public class Nonstatictonpnstatic {
	public void m1()
	{
	System.out.println("m1 is nonstatic");
	}
	public void m2()
	{
		m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nonstatictonpnstatic obj=new Nonstatictonpnstatic(); 
		obj.m2();
	}

}
