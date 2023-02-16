package methods;

public class Nonstaticvariable1
{
	int a;
public static void main(String[]args)
{
	Nonstaticvariable1 obj1=new Nonstaticvariable1();
	Nonstaticvariable1 obj2=new Nonstaticvariable1();
	Nonstaticvariable1 obj3=new Nonstaticvariable1();

	obj1.a=10;
	obj2.a=20;
	obj3.a=30;
	System.out.println(obj1.a);
}

}
