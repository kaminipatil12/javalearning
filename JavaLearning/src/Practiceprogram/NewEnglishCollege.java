package Practiceprogram;

public class NewEnglishCollege {
int maths;
int physics;
int chemistry;
public void Sayli()
{
 maths=80;
 physics =70;
 chemistry=65;
 System.out.println("Marks of Sayli=");
 System.out.println("maths " + maths);
 System.out.println("physics " + physics);
 System.out.println("chemistry " + chemistry);
 System.out.println(" ");

}
public void Avanti()
{
 maths=90;
 physics =80;
 chemistry=75;
 System.out.println("Marks of Avanti=");
 System.out.println("maths " + maths);
 System.out.println("physics " + physics);
 System.out.println("chemistry " + chemistry);
 System.out.println(" ");

}
public void Kirti()
{
 maths=85;
 physics =70;
 chemistry=80;
 System.out.println("Marks of Kirti=");
 System.out.println("maths " + maths);
 System.out.println("physics " + physics);
 System.out.println("chemistry " + chemistry);
}

public static void main(String[]args)
{ 
NewEnglishCollege obj=new NewEnglishCollege();
obj.Sayli();
obj.Avanti();
obj.Kirti();
	
}
}
