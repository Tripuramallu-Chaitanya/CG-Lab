package lab6;
import java.util.*;
public class Six {
	public static List<Integer> votersList(Map<Integer, Integer> a){
		List <Integer> b = new ArrayList<Integer>();
		Set <Integer> set = a.keySet();
		for(int i:set) {
			int age = a.get(i);
			if (age>18)
				b.add(i);
		}
		return b;
	}
	public static void main(String[] args) {
		Map <Integer, Integer> a = new TreeMap<Integer,Integer>();
		a.put(9700, 18);
		a.put(9701, 16);
		a.put(9702, 25);
		a.put(9703, 14);
		a.put(9704, 22);
		System.out.println(votersList(a));
	}

}
