package string;

public class StringEquals {
	public static void main(String[]args) {
		String a="Power";
		String b= new String("Power");
		System.out.println(a==b);//==signs compare between memory adress thats why op is false
		System.out.println(a.equals(b));//equals compare betn content of two object
	}
}
