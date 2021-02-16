package bheem;
import java.util.*;
public class Five {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String a = input.nextLine();
		int len = a.length();
		System.out.println("The characters in string are: "+len);
		int count = 0;
		for (int i=0;i<len;i++) {
			if (a.charAt(i)==' ') {
				count++;
			}
		}
		count++;
		System.out.println("number of words are"+count);
		input.close();

	}

}
