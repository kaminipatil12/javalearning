package error;

public class Errors1 {
	public static void main(String[]args)
	{
		int input=39;
		assert input>=40 :"failed";
		System.out.println("mark is" +input);
	}

}
//for assert error occurong we have to manually disabling the configuration 
//that is right click run configuration and then arguments in that vm arguments type -ea and then run
