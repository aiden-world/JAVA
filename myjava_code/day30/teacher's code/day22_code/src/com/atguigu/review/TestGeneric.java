package com.atguigu.review;

/*
 * 一、泛型：泛化的类型
 * 1、类型的形参，泛型形参：只声明了一个泛型
 * 	（1）在声明类或声明接口时，声明泛型，这个泛型可以使用的范围是本类非静态成员。
 * 		【修饰符】  class/interface 类名/接口名<类型形参的列表>{
 * 		}
 * 	（2）在声明某个泛型方法时，声明泛型，这个泛型可以使用的范围是本方法。
 * 		【修饰符】 <类型形参列表>  返回值类型   方法名(数据形参列表){
 * 		}
 * 2、类型的实参，泛型实参：为泛型形参指定具体的类型
 * 	（1）在“使用”泛型类或泛型接口时，指定具体的类型
 * 		①创建它们的对象
 * 			ArrayList<String> list = new ArrayList<String>();
 * 		②继承/实现它们的时候
 * 			class Student implements Comparable<Student>{}
 * 		③用它们来声明变量/声明数据形参时
 * 			public void method(ArrayList<String> list){
 * 			}
 * 			public void method(ArrayList<?> list){
 * 			}
 * 			public void method(ArrayList<? extends Graphic> list){
 * 			}
 * 			public void method(ArrayList<? super Graphic> list){
 * 			}
 * 	（2）在“使用/调用”这个泛型方法时，由数据的实参的类型来确定泛型的具体类型。
 * 			例如：
 * 			Arrays类：public static <T> List<T> asList(T... a)
 * 			调用：
 * 			Arrays.asList("hello","world");  这个泛型形参T就由方法的数据实参"hello"的类型确定为String
 * 			Arrays.asList(1,2,3);  这个泛型形参T就由方法的数据实参1,2,3的类型确定为Integer
 * 
 * 二、其他的问题
 * 1、上限、下限
 * 上限：
 * （1）声明泛型形参时可以设定上限
 * 		【修饰符】  class/interface 类名/接口名<T extends 上限>{
 * 		}
 * 		【修饰符】 <T extends 上限>  返回值类型   方法名(数据形参列表){
 * 		}
 * （2）使用泛型类或泛型接口时，可以用?，并且指定上限
 * 		public void method(ArrayList<? extends Graphic> list){
 * 			}
 * 下限：
 * （1）使用泛型类或泛型接口时，可以用?，并且指定上限
 * 		public void method(ArrayList<? super Graphic> list){
 * 			}
 * 
 * 2、泛型的擦除
 * （1）如果该泛型形参声明时，没有设定上限，那么如果使用它时，没有指定泛型实参，那么按照Object处理
 * （2）如果该泛型形参声明时，设定了上限，那么如果使用它时，没有指定泛型实参，那么按照“第一个上限”处理
 * 
 * 三、目前重点掌握集合、比较器中的相关类型的泛型指定
 */
public class TestGeneric {

}
