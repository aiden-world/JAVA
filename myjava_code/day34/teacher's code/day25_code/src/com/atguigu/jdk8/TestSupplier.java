package com.atguigu.jdk8;

import java.util.stream.Stream;

import org.junit.Test;

/*
 * 二、供给型接口：
 * 
 * 1、核心接口：Supplier<T>
 * 
 * 它的抽象方法：T get()			无参有返回值	
 * 因为对于调用者来说，你调用时不需要给它“实参”，但是可以得到“返回值”
 * 
 * 2、变形接口
 * BooleanSupplier	boolean getAsBoolean()  	返回一个boolean值
 * DoubleSupplier	double getAsDouble()  	返回一个double值
 * IntSupplier		int getAsInt()  	返回一个int值
 * LongSupplier		long getAsLong()  	返回一个long值
 * 		
 */
public class TestSupplier {
	/*
	 * java.util.stream包下 有一个Stream<T>类型，
	 *    它有一个静态方法： static <T> Stream<T> generate(Supplier<T> s) 
	 *    它还有一个默认方法： void forEach(Consumer<? super T> action) 
	 */
	@Test
	public void test1(){
//		Math.random()：产生[0,1)范围的随机值
		/*
		 * generate方法的形参：Supplier类型
		 * 
		 * Supplier接口：
		 * 		抽象方法：T get()	
		 * 
		 * Lambda表达式是给Supplier接口的形参赋值。
		 * Lambda表达式的形参列表：()
		 * Lambda表达式的Lambda体：{产生一些数据，这些数据就是Stream流中的数据}
		 */
//		Stream<Double> stream = Stream.generate(() -> {return Math.random();});
		
		Stream<Double> stream = Stream.generate(() -> Math.random());
		
		/*
		 * 它还有一个默认方法： void forEach(Consumer<? super T> action) 
		 * Consumer<? super T>
		 * 它是消费型接口：void accept(T t)
		 */
//		stream.forEach((Double d) -> {System.out.println(d);});
		stream.forEach(d -> System.out.println(d));
	}
}
