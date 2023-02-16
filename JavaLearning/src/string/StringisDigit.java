package string;

public class StringisDigit {

	public static void main(String[] args) {
		String s="Auto2to1";
		char ch=s.charAt(4);
		boolean var=Character.isDigit(ch);
		System.out.println(var);
	}

}
