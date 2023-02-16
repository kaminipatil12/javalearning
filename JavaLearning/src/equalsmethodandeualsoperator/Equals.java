package equalsmethodandeualsoperator;

public class Equals {

	public static void main(String[] args) {
		String a="ginger";
		String b="ginger";
		String c=new String("ginger");
		System.out.println(a==c);//false address matching
		System.out.println(a.equals(c));//true content matching
		
		System.out.println(a==b);//true address matching
		System.out.println(a.equals(b));//true content matching
	}

}
