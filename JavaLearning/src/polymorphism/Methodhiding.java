package polymorphism;

public class Methodhiding extends Class3{
   public static void m1()
   {
	   System.out.println("static method of child class");
   }
   public static void main(String[]args)
   {
	   Methodhiding mc=new Methodhiding();
	   mc.m1();   //method hiding depend on reference
	   
	   Class3 nc=new Methodhiding();
	   nc.m1();
   }
}
