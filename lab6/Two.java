package lab6;
import java.util.*;
public class Two {
	public static Map<Character, Integer> countChars(char[] c) {
		Map<Character, Integer> m = new TreeMap<Character, Integer>();
		for(char i:c) {
			if(m.containsKey(i))
				m.put(i, m.get(i)+1);
			else
				m.put(i, 1);
		}
		
		return m;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		input.close();
		char c[] = str.toCharArray();
		System.out.println(countChars(c));
	}
}
