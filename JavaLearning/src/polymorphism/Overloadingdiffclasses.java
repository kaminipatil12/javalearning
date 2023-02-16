package polymorphism;

public class Overloadingdiffclasses extends Class1 {
	public void arg1()
	{
		System.out.println("method of child class");
	}
	public static void main(String[]args)
	{
		Overloadingdiffclasses mn=new Overloadingdiffclasses();
		mn.arg1();        //overloading is possible only on reference what we have give not 
		mn.arg1(false);                //    on object basis
		mn.arg1(0);
		mn.arg1();

       Class1 nk=new  Class1();  // suppose we are calling through objectof parent class
                                 //child method cannot be access it is not possible
        nk.arg1(false); 
        nk.arg1(10);
           
        
        Class1 kl=new Overloadingdiffclasses();
        
        kl.arg1(false);
        kl.arg1(0);
        System.out.println("jyacha refernce dila tyachach method call hotil object nusar nhi");
        
}
	
}