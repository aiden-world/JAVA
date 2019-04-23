package com.atguigu.review;

import java.util.Properties;
import java.util.Set;

public class TestProperties {
	public static void main(String[] args) {
		//但它也是一个map
		Properties pro = new Properties();
		
//		pro.put(1, "张三");//调用它父类Hashtable
		
		pro.setProperty("1", "张三");
		String value = pro.getProperty("1");
		System.out.println(value);
		
		/*Set keySet = pro.keySet();
		for (Object key : keySet) {
			System.out.println(key.getClass());
		}*/
	}
}
