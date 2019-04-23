package day31;
import java.util.*;
import java.util.Map.Entry;

public class TestNestedGeneric {
	public static void main(String[] args) {
		Province p1 = new Province(1,"北京市(直辖)");
		Province p2 = new Province(2,"海南省");
	
		
		City c1 = new City(1,"北京市",1);
		City c2 = new City(2,"海口市",2);
		City c3 = new City(3,"三亚市",2);
		
		TreeMap<Province,TreeSet<City>> fMap = new TreeMap<Province,TreeSet<City>>();
		TreeSet<City> set1 = new TreeSet<>();
		TreeSet<City> set2 = new TreeSet<>();

		set1.add(c1);
		set2.add(c2);
		set2.add(c3);
		
		
		fMap.put(p1, set1);
		fMap.put(p2, set2);
	

//TreeMap map 的put方法会在根root=null时
//	 public V put(K key, V value) {
//		Entry<K,V> t = root;
//      if (t == null) {
//          compare(key, key); // type (and possibly null) check
//
//          root = new Entry<>(key, value, null);
//          size = 1;
//          modCount++;
//          return null;
//      }
//    .....  
//	   .....
//(第一次调用put时候如果root=null)调用TreeMap自定义的compare方法,该方法如下
//final int compare(Object k1, Object k2) {
//      return comparator==null ? ((Comparable<? super K>)k1).compareTo((K)k2)
//          : comparator.compare((K)k1, (K)k2);
//  }
//
//其中compartor为TreeMap声明的一个Comparator接口对象(声明 并没有实例化)
//private final Comparator<? super K> comparator;
//
//即判断如果Compartor ==null,则调用lang包下Comparable接口的自然排序方法compareTo
//如果Compartor不为空,调用Util包下Comparator接口的定制排序compare
//
//又有
//public TreeMap() {
//      comparator = null;
//  }
//可知TreeMap空参构造时comparator为null,此时add调用的为自然排序compareTo
//public TreeMap(Map<? extends K, ? extends V> m) {
//      comparator = null;
//      putAll(m);
//  }

		//因为
		Collection<TreeSet<City>> s = fMap.values();
		for (TreeSet<City> treeSet : s) {
			System.out.println(treeSet);
		}
		
		Set<Province> hs = fMap.keySet();
		for (Province pro : hs) {
			System.out.println(pro);
		}

		Set<Entry<Province, TreeSet<City>>> hsm  = fMap.entrySet();
		for (Entry<Province, TreeSet<City>> entry : hsm) {
			System.out.println(entry);
		}
		
		//接口可以声明但是不能被实例化,可以被实现类实例化,如下
		Comparable<?> cm ;
		cm = new Integer(1);
		System.out.println(cm);

	}

}

//下面两个类可以注释接口Comparator,而上面不报错,注释Comparable报错
class Province implements Comparator<Province>,Comparable<Province>{
	int pid ;
	String name;
	public Province(int pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}
	@Override
	public int compare(Province o1, Province o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(Province o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "Province [pid=" + pid + ", name=" + name + "]";
	}
	
	
} 


class City implements Comparator<City>,Comparable<City>{
	int cid ;
	String name;
	int pid ;
	public City(int cid, String name, int pid) {
		super();
		this.cid = cid;
		this.name = name;
		this.pid = pid;
	}
	@Override
	public int compare(City o1, City o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int compareTo(City o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public String toString() {
		return "City [cid=" + cid + ", name=" + name + ", pid=" + pid + "]";
	}
	
	
	
}

