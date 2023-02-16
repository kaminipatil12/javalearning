package Practiceprogram;

public class ShivajiCollege
{
int maths;
int physics;
int chemistry;
public static void main(String[]args)
{
	ShivajiCollege obj1=new ShivajiCollege();
	obj1.maths=95;
	obj1.physics=85;
	obj1.chemistry=80;
	ShivajiCollege obj2=new ShivajiCollege();
	obj2.maths=85;
	obj2.physics=95;
	obj2.chemistry=80;
	ShivajiCollege obj3=new ShivajiCollege();
	obj3.maths=75;
	obj3.physics=85;
	obj3.chemistry=70;
	
	System.out.println("Total marks of Kirti=" + (obj1.maths+obj1.physics+obj1.chemistry));
	System.out.println("maths "+obj1.maths);
	System.out.println("physics "+obj1.physics);
	System.out.println("chemistry "+obj1.chemistry);

	System.out.println("Total marks of Saisha=" + (obj2.maths+obj2.physics+obj2.chemistry));
	System.out.println("maths "+obj2.maths);
	System.out.println("physics "+obj2.physics);
	System.out.println("chemistry "+obj2.chemistry);


	
	System.out.println("Total marks of Anaya=" + (obj3.maths+obj3.physics+obj3.chemistry));
	System.out.println("maths "+obj3.maths);
	System.out.println("physics "+obj3.physics);
	System.out.println("chemistry "+obj3.chemistry);
}
}
