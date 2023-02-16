package argumentsandreturn;

public class FurgusenCollege {
	public void m1(int maths, int physics, int chemistry, String name)
	{
		System.out.println("Marks of student=" +name);
		 System.out.println("maths " + maths);
		 System.out.println("physics " + physics);
		 System.out.println("chemistry " + chemistry);
		 System.out.println(" ");

	}
	public void m2()
	{
		m1(90,80,80, "Sayli");
		m1(95,80,75, "Kirti");
		m1(87,97,78, "Saisha");
	}
		public static void main(String[]args)
		{
			FurgusenCollege obj=new	FurgusenCollege();
			obj.m2();
		}
	

}
