package won;
import java.util.Scanner;
public class Three {
	static boolean checkNumber(int n) {
		while(n>0) {
			int m=n%10;
			n/=10;
			int p=n%10;
			if(m<p) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");
		int number=input.nextInt();
		if (checkNumber(number)==true) {
			System.out.println("increasing");
		}
		else
			System.out.println("not");
		input.close();
	}

}
