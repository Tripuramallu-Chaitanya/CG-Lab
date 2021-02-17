package lab6;
import java.util.*;
public class One {
	public static List<Integer> getValues(HashMap<String, Integer> hm){
		List <Integer> li = new ArrayList<Integer>(hm.values());
		Collections.sort(li);
		return li;
		
	}
	public static void main(String[] args) {
		HashMap<String, Integer>hm = new HashMap<String, Integer>();
		hm.put("Chaitanya", 50000);
		hm.put("Vinay", 25000);
		hm.put("Vamshi", 15000);
		hm.put("Pavan", 5000);
		System.out.println(getValues(hm));
	}

}
