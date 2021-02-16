package bheem;
import java.util.*;
import java.time.*;
public class Seven {
	public static void calculateDuration(int a, int b,int c) {
		LocalDate d1 = LocalDate.of(a, b, c);
		LocalDate d2 = LocalDate.now();
		Period dur = Period.between(d1, d2);
		System.out.println("Duration interms of days, months and years is: "+Math.abs(dur.getDays())+" days "+Math.abs(dur.getMonths())+" months "+Math.abs(dur.getYears())+" years");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year");
		int year = input.nextInt();
		System.out.println("Enter month");
		int month = input.nextInt();
		System.out.println("Enter date");
		int date = input.nextInt();
		calculateDuration(year,month,date);
		input.close();
	}

}
