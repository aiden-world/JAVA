package com.atguigu.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/*
 * 1、集合分为两大类：
 * （1）Collection系列：一组对象，单身party
 * （2）Map系列：一对一对的键值对（映射关系），情侣party
 * 
 * 2、映射关系（key,value）
 * （1）映射关系的key是不能重复的，是唯一的
 * （2）一个key对应一个value，这个value可以是一个对象，也可以是多个对象组成的数组或集合
 * （3）value可以重复
 * 
 * 3、Map的实现类们：
 * （1）HashMap：
 * 		底层实现：JDK1.8之前（数组+链表），JDK1.8之后（数组+链表/红黑树）
 * 		HashMap的存储位置和它的key的hashCode有关，是否重复和equals有关
 * （2）TreeMap
 * 		底层实现：二叉树
 * 		TreeMap的存储位置和是否重复和key的"大小"有关
 * （3）LinkedHashMap：是HashMap的子类
 * 		LinkedHashMap比较HashMap多维护了添加的顺序，添加和删除的效率比HashMap低
 * 
 * 4、Map接口的常用方法
 * （1）添加
 * put(K key, V value)：添加一对映射关系(key,value)
 * void putAll(Map m) ：把m中的所有映射关系都添加到当前的map中
 * 
 * （2）删除
 * V remove(Object key) ：根据key删除一对映射关系
 * void clear() 
 * 
 * （3）修改
 * 没有对应的方法，如果要修改value,就是重新put
 * 
 * （4）查询
 *  boolean containsKey(Object key) ：是否包含某个key
 *  boolean containsValue(Object value) ：是否包含某个value
 *  boolean isEmpty() 
 *  V get(Object key) ：根据key获取它的value
 *  
 *  （5）其他方法
 *  int size()：返回映射关系的对数
 *  
 *  （6）遍历
 *  ①Set<K> keySet() ：用来获取所有的key，然后遍历所有的key
 *  	返回值类型是Set，因为key不重复
 *  ②Collection<V> values() ：用来获取所有的value，然后遍历所有的value
 *  	返回值类型是Collection，因为value可能重复
 *  ③Set<Map.Entry<K,V>> entrySet() 
 *  	返回值类型是Set，因为key不重复，映射的组合关系也不会重复
 *  
 *  说明：因为Map并没有继承java.lang.Iterable接口，所以不能直接使用foreach。只能迂回使用
 */
public class TestMap {
	@SuppressWarnings("all")
	@Test
	public void test3(){
		Map map = new HashMap();
		
//		map.put("小强", "小红","小紫");//错误，因为put的方法的形参就两个（key,value）
//		map.put("小强", "小红");//前女朋友
//		map.put("小强", "小紫");//现女友
		
		ArrayList girls = new ArrayList();
		girls.add("小红");
		girls.add("小白");
		girls.add("小紫");
		
		map.put("小强", girls);
		
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}
		
	}
	
	@SuppressWarnings("all")
	@Test
	public void test2(){
		Map map = new HashMap();
		
		map.put("小高", "冰冰");
		map.put("小崔", "冰冰");
		
		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}
		
		System.out.println("----------------------");
		//遍历所有的value
		Collection values = map.values();
		for (Object value : values) {//这个foreach是遍历collection
			System.out.println(value);
		}
	}
	
	@SuppressWarnings("all")
	@Test
	public void test1(){
		Map map = new HashMap();
		
		map.put("小崔", null);
		map.put("小高", "如花");
		map.put("小强", new String[]{"小红","小紫"});
		map.put("小崔", "冰冰");
		
		System.out.println("映射关系的对数：" + map.size());
		
		Object girl = map.get("小崔");
		System.out.println(girl);
		
		System.out.println("----------------------");
		//遍历所有的key
		Set keySet = map.keySet();//取出了所有的key组成了一个set
		for (Object key : keySet) {//这个foreach是遍历set
			System.out.println(key);
		}
		
		System.out.println("----------------------");
		//遍历所有的value
		Collection values = map.values();
		for (Object value : values) {//这个foreach是遍历collection
			if(value instanceof String[]){
				String[] str = (String[]) value;
				System.out.println(Arrays.toString(str));
			}else{
				System.out.println(value);
			}
		}
		
		System.out.println("----------------------");
		//遍历成对的映射关系
		Set entrySet = map.entrySet();
		//这个set中的元素是Entry类型(key,value)
		for (Object object : entrySet) {//这个foreach是遍历set
			System.out.println(object);
		}
	}
}
