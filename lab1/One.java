package won;
import java.util.Scanner;
public class One {
	
	static void calculateSum(int n) {
		int sum = 0;
		for (int i = n; i > 0; i--) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter the value of n");
		int n = input.nextInt();
		calculateSum(n);
		input.close();
	}

}