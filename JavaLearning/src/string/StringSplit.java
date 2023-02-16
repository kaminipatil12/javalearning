package string;

public class StringSplit {

	public static void main(String[] args) {
		String s="Automation development selenium testing";
		String[]output=s.split("\\s");
		for(String outr:output)
			System.out.println(outr);
	}

}
