package bheem;
import java.util.*;
public class Three {
	public static String alterString(String s) {
		char[] mama = s.toCharArray();
		int len = mama.length;
		for(int i=0; i<len; i++) {
			if (mama[i]!='a' && mama[i]!= 'e' && mama[i]!= 'i' && mama[i]!= 'o' && mama[i]!='u' && mama[i]!='A' && mama[i]!= 'E' && mama[i]!= 'I' && mama[i]!= 'O' && mama[i]!= 'U') {
				char cn = mama[i];
				mama[i] = (char) (cn+1);
			}
		}
		s = String.valueOf(mama);
		return s;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		System.out.println(alterString(s)); 
		in.close();

	}

}
