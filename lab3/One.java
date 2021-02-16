package bheem;
import java.util.*;
public class One {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s=in.nextLine();
		StringTokenizer p= new StringTokenizer(s," ");
		int sum=0;
		while(p.hasMoreTokens()) {
			String b= p.nextToken();
			int ght=Integer.parseInt(b);
			System.out.print(ght+" ");
			sum=sum+ght;
		}
		System.out.println("");
		System.out.println("Sum is "+sum);
		in.close();

	}

}
