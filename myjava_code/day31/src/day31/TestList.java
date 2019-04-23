package day31;
import java.util.*;
import java.util.Map.Entry;
public class TestList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(22);
		al.add(12);
		al.add(42);
		al.add(1, 33);
		for (Integer i : al) {
			System.out.println(i);
		}
		
		String dir = System.getProperty("user.dir");
		System.out.println(dir);
		Properties ps = System.getProperties();
		Set<Entry<Object, Object>> hs = ps.entrySet();
		for (Entry<Object, Object> entry : hs) {
		System.out.println(entry);
		}
	}
}
