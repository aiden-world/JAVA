package com.atguigu.jdk8;

import java.util.HashMap;

import org.junit.Test;

/*
 * 四、功能型接口
 * 
 * 1、核心接口：Function<T,R>
 * 它的抽象方法：R apply(T t)  		有参有返回值	
 * 因为对于调用者来说，你调用时需要给它“实参”，并且也可以得到“返回值”
 * 
 * 2、变形接口
UnaryOperator<T>		T apply(T t)	接收一个T类型对象，返回一个T类型对象结果

DoubleFunction<R>		R apply(double value)  	接收一个double值，返回一个R类型对象
IntFunction<R>			R apply(int value)		接收一个int值，返回一个R类型对象
LongFunction<R>			R apply(long value)		接收一个long值，返回一个R类型对象


ToDoubleFunction<T>		double applyAsDouble(T value) 	接收一个T类型对象，返回一个double
ToIntFunction<T>		int applyAsInt(T value)  		接收一个T类型对象，返回一个int
ToLongFunction<T>		long applyAsLong(T value) 		接收一个T类型对象，返回一个long

DoubleToIntFunction		int applyAsInt(double value)  	接收一个double值，返回一个int结果
DoubleToLongFunction	long applyAsLong(double value) 	接收一个double值，返回一个long结果
IntToDoubleFunction		double applyAsDouble(int value) 接收一个int值，返回一个double结果
IntToLongFunction		long applyAsLong(int value)  	接收一个int值，返回一个long结果
LongToDoubleFunction	double applyAsDouble(long value)接收一个long值，返回一个double结果
LongToIntFunction		int applyAsInt(long value) 		接收一个long值，返回一个int结果


DoubleUnaryOperator		double applyAsDouble(double operand)  	接收一个double值，返回一个double
IntUnaryOperator		int applyAsInt(int operand)  			接收一个int值，返回一个int结果
LongUnaryOperator		long applyAsLong(long operand)  		接收一个long值，返回一个long结果
		
BiFunction<T,U,R>		R apply(T t, U u) 				接收一个T类型和一个U类型对象，返回一个R类型对象结果
BinaryOperator<T>		T apply(T t, T u) 				接收两个T类型对象，返回一个T类型对象结果


ToDoubleBiFunction<T,U>	double applyAsDouble(T t, U u) 	接收一个T类型和一个U类型对象，返回一个double
ToIntBiFunction<T,U>	int applyAsInt(T t, U u) 		接收一个T类型和一个U类型对象，返回一个int
ToLongBiFunction<T,U>	long applyAsLong(T t, U u) 		接收一个T类型和一个U类型对象，返回一个long


DoubleBinaryOperator	double applyAsDouble(double left, double right)  	接收两个double值，返回一个double结果
IntBinaryOperator		int applyAsInt(int left, int right) 	接收两个int值，返回一个int结果
LongBinaryOperator		long applyAsLong(long left, long right)  	接收两个long值，返回一个long结果

结论：Operator结尾接口，形参的类型与返回值类型一样
 */
public class TestFunction {
	/*
	 * 示例一：
	 *   Map系列的集合在Java8版本增加了一个方法
	 *   	default void replaceAll(BiFunction<? super K,? super V,? extends V> function) 
	 *   这个方法的作用，对Map中每一个Entry(key,value)，用BiFunction接口的抽象方法返回的value值替换原来的value
	 */
	@Test
	public void test1(){
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "xiaocui");
		map.put(2, "xiaogao");
		map.put(3, "xiaoqiang");
		
		/*
		 * 形参类型是：BiFunction接口
		 * BiFunction<T,U,R>	 抽象方法：	R apply(T t, U u) 
		 *  抽象方法的形参列表就是Lambda表达式的形参列表：(Integer key,String value)
		 *  Lambda体：{把value的字母变成大写}
		 */
//		map.replaceAll((Integer key,String value) -> {return value.toUpperCase();});
		map.replaceAll((key,value) -> value.toUpperCase());
		
		
		//遍历map
		map.forEach((key,value) -> System.out.println(key+ ":" + value)); 
	}
}
