package methods;

public class Nonstaticvariable
{
	 int a=10;
	 int b=12;
public static void main(String[]args)
{
    Nonstaticvariable obj= new Nonstaticvariable();//to call nonstaticvariable in static method obj creation is mandatory
	int c=obj.a+obj.b;
	System.out.println(c);
}
}
