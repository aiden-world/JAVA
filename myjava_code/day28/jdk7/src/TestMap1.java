import java.util.HashMap;

import org.junit.Test;

/*
 * JDK1.7，HashMap的底层存储：数组+链表
 * 
 * 1、这个key的hashCode值与[index]有什么关系
 * 	hashCode ->hash(x) ->hash值
 * 			如果两个对象的hashCode相同，那么hash相同
 * 		          如果两个对象的hashCode不同，也可能hash相同
 *  hash值  ->index
 *  	hash & length-1
 *  
 *  2、从上面看，不同的对象，他们的hash值可能相同，他们就可能存到同一个[index]中
 *  如果没有链表，只有数组，那么[index]是无法存储多个对象的，只能借用链表的结构，使得[index]中可以存储多个元素
 *  
 *  3、HashMap的元素类型：Map.Entry
 *  发现HashMap中有一个内部类Entry实现了Map.Entry
 *  
 *  class Entry implements Map.Entry{
 *  	int hash;
 *  	K key;
 *  	V value;
 *  	Entry next;//使得数组的元素又可以作为链表使用
 *  }
 *  
 *  4、HashMap是否会扩容？会
 *  什么时候扩容？
 *  if(size >= threshold && (null != table[bucketIndex]))
 *  第一：table[i]不是空的
 *  第二：size达到临界值
 *  
 *  threshold：阈值
 *     = 数组的长度 * DEFAULT_LOAD_FACTOR（默认加载因子0.75）
 *     
 * 5、新的映射关系是作为链表的头
 * JDK1.7（上）
 * JDK1.8（下）
 * 
 * 七上八下
 * 
 * 6、load_factor的大小有什么关系？
 *   load_factor的大小影响扩容的频率
 *   load_factor：0.1  频率太高
 *   load_factor：1    导致table[i]下面的元素太多，查询的效率低
 */
public class TestMap1 {
	@SuppressWarnings("all")
	@Test
	public void test3(){
		HashMap map  = new HashMap();
		
		for (int i = 1; i <= 40; i++) {
			map.put("key"+i, "第"+i+"个value");
		}
	}
	
	@SuppressWarnings("all")
	@Test
	public void test2(){
		HashMap map  = new HashMap();
		
		for (int i = 1; i <= 40; i++) {
			map.put(i, "第"+i+"个value");
		}
	}
	
	@SuppressWarnings("all")
	@Test
	public void test1() {
		HashMap map  = new HashMap();
		
		map.put("Aa", "张三");
		map.put("BB", "李四");
		map.put("CC", "王五");
		
	}
}
