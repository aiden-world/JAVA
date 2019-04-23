package com.atguigu.modifier;

/*
 * native（本地的，原生的）：修饰方法，
 * 如果你看到一个方法的前面有native，那么表示该方法的方法体不是用Java语言实现的，是有其他语言，例如：C/C++等实现的。
 * 
 * 比如：java.lang.Object
 * （1）int hashCode()
 * （2）Class getClass()
 * 比如：java.lang.System
 * （1）arraycopy(...)
 * 
 * 由其他语言实现后，编译为.dll文件，然后由JVM调用。
 * JVM内存中，为这种native方法的执行开辟单独的空间，本地方法栈
 * 
 * native方法：
 * （1）对于程序员调用来说，和Java方法一样。
 * （2）对于程序员来说，子类也可以选择进行重写。
 */
public class TestNative {

}
