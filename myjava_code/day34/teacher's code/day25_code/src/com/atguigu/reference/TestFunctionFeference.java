package com.atguigu.reference;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;

import org.junit.Test;

/*
 * Lambda表达式仅能够用于SAM接口的实现。
 * 方法引用和构造器引用是对Lambda表达式的再一次简化。但是仅能够用于部分Lambda表达式的简化。
 * 
 *  当Lambda体的实现{}是通过调用一个现有的方法/构造器来完成功能时，可以考虑使用方法引用和构造器引用进行简化。
 * 
 * Lambda表达式：
 * 		(形参列表) -> {Lambda体}
 * 
 * 方法引用的语法格式：
 * 		类或对象  :: 方法名
 * 构造器引用的语法格式：
 * 		类或数组类型 :: new
 * 
 * 方法引用的三种形式：
 * （1）对象::实例方法名
 * （2） 类名::静态方法
 * （3）类名::实例方法
 * 
 * 构造器引用：
 * 	必须是Lambda体正好是在new一个对象，这个抽象方法的形参列表要与构造器的形参列表对应。
 * 形式：
 * （1）类名::new
 * （2）数组类型名::new
 */
public class TestFunctionFeference {
	/*
	 * 这个方法功能：可以创建一个数组，但是保证这个数组的长度一定是2的n次方
	 * 例如：当你调用createArray(xx,  9)，会给你返回一个长度接近9的2的n次方的数组
	 * 
	 * HashMap：当你创建HashMap对象时，如果没有指定初始化容量，默认初始化容量  16
	 *         当你创建HashMap对象时，如果指定了初始化容量  HashMap(int initialCapacity) ，
	 *         			并且你指定的initialCapacity不是2的n次方，会把这个容量纠正为最近的2的n次方的值
	 * 为什么？因为   table[index]
	 * 		index = hash & table.length-1   得到[0,table.length-1]范围的整数值
	 * 只有table.length是2的n次方时，才能保证这个结果是对的，因为2的n次方的值-1后的二进制是“前面是0，后面都是1”
	 * 例如：2的1次-1是1
	 * 例如：2的2次-1是11
	 * 例如：2的3次-1是111
	 * 例如：2的4次-1是1111
	 */
	public <R> R[] createArray(Function<Integer,R[]> fun,int length){
		int n = length - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        length = n < 0 ? 1 : n + 1;
		return fun.apply(length);
	}
	
	@Test
	public void test6(){
		//调用createArray方法，得到一个长度为2的n次方的数组
		
		/*
		 * 第一个形参：Function功能型接口
		 * 	  抽象方法	R apply(T t)
		 */
//		String[] array = createArray((Integer len) -> {return new String[len];}, 19);
		
		String[] array = createArray(String[]::new, 19);
		System.out.println(array.length);
	}
	
	@Test
	public void test5(){
		/*
		 * java.util.Optional<T>：是一个容器，只能装一个对象的容器。
		 * 		T orElseGet(Supplier<? extends T> other)  
		 * 这个方法的形参：Supplier供给型接口
		 * 		抽象方法 ：  T get()
		 */
		Optional<String> opt = Optional.ofNullable(null);//opt容器中包装了一个字符串对象"beijing"
		
		//如果它里面包装的对象是非空的，可以取出这个对象，如果是空的，我们可以用orElseGet方法的Supplier的Lambda表达式提供的另一个对象来代替
//		String value = opt.orElseGet(() -> new String());
		
		String value = opt.orElseGet(String::new);//如果opt容器中的对象是空的，就new一个String的对象代替
		System.out.println("[" + value +"]");
	}
	
	@Test
	public void test4(){
		String[] arr = {"hello","java","Hello","Chailinyan"};
		/*
		 * public static <T> void sort(T[] a, Comparator<? super T> c)
		 * 
		 * Comparator：也是一个函数式接口   int compare(T t1, T t2)
		 */
//		Arrays.sort(arr, (s1,s2) -> s1.compareToIgnoreCase(s2));
		
		/*
		 * 按理说:  compareToIgnoreCase形参列表(String s)
		 * 		  而我们的抽象方法  int compare(T t1, T t2)
		 * 		本来形参列表没有对应
		 * 但是：抽象方法  int compare(T t1, T t2)  的第一个形参，正好是调用compareToIgnoreCase的对象，而第二个形参正好是给compareToIgnoreCase的实参
		 *		t1和t2都是String类型		
		 *它俩的返回值类型一样，都是int
		 */
		Arrays.sort(arr, String::compareToIgnoreCase);//意思就是用String类的compareToIgnoreCase来比较两个元素t1,t2
		
		System.out.println(Arrays.toString(arr));
	}
	@Test
	public void test3(){
		String[] arr = {"hello","java","Hello","Chailinyan"};
		Arrays.sort(arr);//用String的自然排序java.lang.Comparable
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void test2(){
		/*
		 * Stream类的静态方法generate方法的形参：Supplier类型
		 * 
		 * Supplier接口：
		 * 		抽象方法：T get()	
		 */
//		Stream<Double> stream = Stream.generate(() -> Math.random());
		
		/*
		 * double Math.random()方法的形参列表与返回值类型   与  Lambda表达式要实现的抽象方法   T get()的形参列表与返回值类型对应
		 */
		Stream<Double> stream = Stream.generate(Math::random);
	}
	
	@Test
	public void test(){
		List<String> list = Arrays.asList("hello","world","java");
		
		/*
		 * Consumer接口： void accept(T t)
		 */
		//list.forEach((String s) -> {System.out.println(s);});
		
		
		/*
		 * 发现：这个Lambda表达式的形参列表： (String s)
		 * 我们实现Lambda体，通过调用先有的方法：System.out.println(s)来完成，
		 * 而且这个println方法：public void println(String x)
		 * 形参列表对应：与调用的println方法的形参列表与Lambda表达式实现的accept抽象方法的形参列表
		 * 返回值类型：与调用的println方法的返回值与Lambda表达式实现的accept抽象方法的返回值类型
		 * 
		 */
		list.forEach(System.out::println);
	}
}
