package lab6;

import java.util.*;

public class Three {
	public static Map<Integer, Integer> getSquares(int[] a){
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for(int i:a) {
			m.put(i, i*i);
		}
		return m;
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(getSquares(a));
	}

}
