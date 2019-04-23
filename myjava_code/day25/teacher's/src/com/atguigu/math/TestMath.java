package com.atguigu.math;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/*
 * 了解：数学相关的类
 * 一、java.lang.Math类
 * 	Math 类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数。 
 * （1）max/min
 * （2）求算术平方根:sqrt
 * pow：和幂次方
 * （3）求近似值
 * ceil()：往正无穷靠近取整
 * floor()：往负无穷靠近取整
 * round()：四舍五入	(num + 0.5)取整
 * (4)random():返回[0,1)的随机数
 * 
 * 二、java.math包
 * BigInteger ：大整数
 * BigDecimal ：定点数
 * 
 * float和double是浮点数
 * 
 */
public class TestMath {
	@Test
	public void test5(){
		BigDecimal big1 = new BigDecimal("1.12345678901234567890123456");
		BigDecimal big2 = new BigDecimal("98.12345678901234567890123456");
		
		System.out.println("求和：" + big1.add(big2));
		System.out.println("求差：" + big2.subtract(big1));
		System.out.println("求积：" + big1.multiply(big2));
//		System.out.println("求商：" + big2.divide(big1));//如果除不尽，会报异常
		
		//divide(BigDecimal divisor, int scale, int roundingMode)
		//scale保留小数点后几位，roundingMode表示舍入模式，它有常量表示
		System.out.println("求商：" + big2.divide(big1,30,BigDecimal.ROUND_CEILING));
		
		System.out.println("求余：" + big2.remainder(big1));
	}
	
	@Test
	public void test4(){
		//例如：想要表示一个大整数12345678901234567890123456
		BigInteger big1 = new BigInteger("12345678901234567890123456");
		BigInteger big2 = new BigInteger("92345678901234567890123456");
		
		System.out.println("求和：" + big1.add(big2));
		System.out.println("求差：" + big2.subtract(big1));
		System.out.println("求积：" + big1.multiply(big2));
		System.out.println("求商：" + big2.divide(big1));//整数/整数结果只保留整数
		System.out.println("求余：" + big2.remainder(big1));
	}
	
	@Test
	public void test3(){
		System.out.println(Math.ceil(2.1));
		System.out.println(Math.ceil(2.7));
		System.out.println(Math.ceil(-2.1));
		System.out.println(Math.ceil(-2.7));
		System.out.println("---------------------------");
		
		System.out.println(Math.floor(2.1));
		System.out.println(Math.floor(2.7));
		System.out.println(Math.floor(-2.1));
		System.out.println(Math.floor(-2.7));
		System.out.println("---------------------------");
		
		System.out.println(Math.round(2.1));
		System.out.println(Math.round(2.7));
		System.out.println(Math.round(2.5));
		System.out.println(Math.round(-2.1));
		System.out.println(Math.round(-2.7));
		System.out.println(Math.round(-2.5));//-2.5特殊   往大的入
	}
	
	@Test
	public void test2(){
		System.out.println(Math.sqrt(9));
		System.out.println(Math.pow(2, 5));//2的5次
	}
	
	@Test
	public void test1(){
		System.out.println(Math.max(3, 8));
	}
}
