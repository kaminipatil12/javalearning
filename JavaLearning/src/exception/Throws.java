package exception;

public class Throws {
	public void totalMarks(int marks) {
	if(marks<=40)
	throw new IllegalArgumentException("Failed");	
	else
		System.out.println("Passed");
	}	
   public static void main(String[]args)
   {
	   Throws ref=new Throws();
	   ref.totalMarks(39);
	   ref.totalMarks(50);
   }
   
	
//exception in  thread IllegalArgumentException("Failed");	
  }
