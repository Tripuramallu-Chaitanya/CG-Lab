package bheem;
import java.util.*;
public class Two {
	public static String getImage(String s) {
		StringBuffer as = new StringBuffer(s);
		as.reverse();
		String bing = as.toString();
		s = s+"|"+bing;
		return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		System.out.println(getImage(s));
	}

}
