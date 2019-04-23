package code_day28;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;



import org.junit.Test;

public class TestMap {
	@Test
	public void test1() {
		Map map1 = new HashMap();
		map1.put("白帝", "极光剑");
		map1.put("黄帝", "轩辕剑");
		map1.put("青帝", "虚空剑");
		map1.put("赤帝", "炎曜剑");
		map1.put("黑帝", "黑水剑");
		
		ArrayList s = new ArrayList();
	
		
		
		System.out.println(map1.containsKey("黑帝"));
		Collection map1Value = map1.values();
		for (Object value : map1Value) {
			System.out.println(value);
		}
		System.out.println("------------");
		Set map1KeySet = map1.keySet();
		for (Object key : map1KeySet) {
			System.out.println(key);
		}
		System.out.println("------------");
			Set map1EntrySet =map1.entrySet();
			for (Object entrySet : map1EntrySet) {
				System.out.println(entrySet);
			}
		map1.put("五帝", "帝剑开天");
		System.out.println("------------");
		Set map1EntrySet2 =map1.entrySet();
		for (Object entrySet : map1EntrySet2) {
			System.out.println(entrySet);
		}
		System.out.println(map1.get("黑帝"));
			
			
			
			
	}
	
	
	
	
}
