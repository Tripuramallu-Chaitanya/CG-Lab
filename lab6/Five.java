package lab6;
import java.util.*;
public class Five {
	public static int getSecondSmallest(int[] a) {
		List <Integer> b = new ArrayList<Integer>();
		for (int i:a) {
			b.add(i);
		}
		Collections.sort(b);
		return b.get(1);
	}
	public static void main(String[] args) {
		int[] a = {21,43,63,13,12,16};
		System.out.println(getSecondSmallest(a));

	}

}
