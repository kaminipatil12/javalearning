package string;

public class StringtoCharArray {

	public static void main(String[] args) {
		String s="velocity";
		System.out.println(s);
        char[]var=s.toCharArray();
        for(int i=0;i<var.length;i++) {
        	System.out.println(var[i]);
        }
	}

}
