package constructorchaining;

public class Sameclass {
	public Sameclass()
	{
		this(true);
		System.out.println("this is cons for same class");
	}
	public Sameclass(boolean m)
	{
		System.out.println("this is cons for boolean value");
	}
  public static void main(String[]args)
  {
	  new Sameclass();
  }
}
