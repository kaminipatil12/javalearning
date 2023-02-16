package polymorphism;

public class Overridingdiffclass extends Class2{
   public void t1()
   {
	   System.out.println("overriding with default arg");
	   System.out.println("method of child class");
   }
   public static void main(String[]args)
   {
	   Class2 ov=new Class2();  //when we create object of parent class then parent class method call
	   ov.t1();
	   
	   Overridingdiffclass oc=new Overridingdiffclass();//when we create object of child class
	   oc.t1();                                         //then child class method call
   }
}
