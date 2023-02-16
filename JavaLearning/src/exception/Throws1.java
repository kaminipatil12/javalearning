package exception;

public class Throws1 {
	public void totalMarks(int marks) {
		if(marks<=40)
		throw new IllegalArgumentException("Failed");	
		else
			System.out.println("Passed");
		}
	public static void main(String[]args)
	{
		Throws1 ref=new Throws1();
		try {
			ref.totalMarks(39);
		}
		catch(IllegalArgumentException ref1)
		{
			System.out.println(ref1.getMessage());
		}
		ref.totalMarks(50);
	}

}
