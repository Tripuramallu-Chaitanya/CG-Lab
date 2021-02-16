package bheem;
import java.util.*;
public class Six {
	public static boolean postr(String str1) {
		String str2 = str1;
		char temp[] = str2.toCharArray();
		Arrays.sort(temp);
		str2 = new String(temp);
		return (str1.equals(str2));
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		System.out.println(postr(str));
		input.close();
	}

}
