package bheem;
import java.util.*;
public class Four {
	public static int modifyNumber(int a) {
		String str= ""+a;
		int len=str.length();
		int j = len - 1;
		StringBuffer sb=new StringBuffer();
		for(int i=0; i<j;i++) {
			int m = str.charAt(i);
			int n = str.charAt(i+1);
			int boom = Math.abs(m-n);
			
			sb.insert(i,boom);
		}
		sb.insert(j, str.charAt(len-1));
		str = sb.toString();
		j = Integer.parseInt(str);
		return j;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		System.out.println(modifyNumber(a));
		in.close();
	}

}
