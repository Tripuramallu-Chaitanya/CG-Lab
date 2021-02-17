package lab6;
import java.util.*;
public class Four {
	public static Map<String, String> getStudents(Map<String, Integer> m){
		Map<String, String> a = new HashMap<String, String>();
		Set<String> li = m.keySet();
		for(String s:li) {
			Integer marks = m.get(s);
			if(marks>=90) 
				a.put(s, "Gold");
			else if(marks>=80)
				a.put(s, "Silver");
			else if(marks>=70)
				a.put(s, "Bronze");
			else
				a.put(s, "No-Medal");
		}
		return a;
	}
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("VTU9700", 82);
		m.put("VTU9701", 72);
		m.put("VTU9702", 62);
		m.put("VTU9703", 86);
		m.put("VTU9704", 99);
		System.out.println(getStudents(m));
	}

}
