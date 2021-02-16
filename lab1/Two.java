package won;
import java.util.Scanner;
public class Two {

	static int calculateDifference(int n) {
		int sum=0;
		int sum1=0;
		for(int i=1;i<=n;i++) {
			sum+=Math.pow(i,2);
		}
		for(int i=1;i<=n;i++) {
			sum1+=i;
		}
		sum1=sum1*sum1;
		sum=sum1-sum;
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter n");
		Scanner input=new Scanner(System.in);
		int n= input.nextInt();
		System.out.println(calculateDifference(n));
		input.close();
	}

}
