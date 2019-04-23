package com.atguigu.reflect;

import org.junit.Test;

/*
 * 类的加载必须由类加载器完成。
 * java.lang.ClassLoader类型。
 * 
 * 类加载器分为四种：
 * 	（1）引导类加载器（Bootstrap Classloader）：又称为根类加载器
 * 		负责加载Java的核心库（JAVA_HOME/jre/lib/rt.jar等或sun.boot.class.path路径下的内容）
 * 		它的代码不是由Java语言实现的，由C/C++实现的。
 * 		代码中无法获取引导类加载器的对象。
 * 		例如：String类由引导类加载器加载的
 * （2）扩展类加载器（Extension ClassLoader）
 * 		负责加载Java的扩展库（JAVA_HOME/jre/ext/*.jar或java.ext.dirs路径下的内容）
 * （3）应用程序类加载器（Application Classloader）
 * 		负责加载Java应用程序类路径（classpath、java.class.path）下的内容
 * （4）自定义类加载
 * 		当以上三种无法满足你的加载需求时，就可以自定义类加载器。
 * 		要求：必须继承java.lang.ClassLoader类型	
 * 		例如：加密和解码字节码，加载特定目录下的字节码...
 * 
 * 4种类加载器的关系：
 *  双亲委托模式
 *  (一）通过组合的方式，依次把上级的加载器称为父加载器
 *  （3）应用程序类加载器   把  （2）扩展类加载器  称为父加载器，但不是继承。通过组合的方式。
 *  sun.misc.Launcher$AppClassLoader和sun.misc.Launcher$ExtClassLoader没有继承关系。
 * 	（2）扩展类加载器  把 （1）引导类加载器  称为父加载器
 * （二）为什么？
 * 目的：为了安全
 * 
 * 过程：当下级的类加载器接到某个加载任务时，而是先把这个任务往上反映，一直往上直到根加载器
 * 		例如：AppClassLoader接到加载"java.lang.String"任务时，它不会立刻去它“负责加载目录”下去加载，
 * 		交给ExtClassLoader，它也会交给Bootstrap Classloader，然后由根加载器先在它“负责加载目录”下去加载，
 * 		Bootstrap Classloader发现是加载"java.lang.String"，它就在rt.jar中找到了，就返回结果，这样可以
 *		避免我们的用户编写“欺骗”的类型来替代系统的核心类。
 *
 *		例如：AppClassLoader接到加载"com.atguigug.bean.Student"任务时，它也会先往上反映，上面不能解决，
 *		往回传。先到达Bootstrap Classloader，它找不到，回传给ExtClassLoader，它也尝试加载，也不行，
 *		再回传给AppClassLoader，然后加载。
 *
 *		例如：AppClassLoader接到加载"com.atguigug.bean.Xxx"任务时，不管往上还是回传都找不到，
 *		就报错：ClassNotFoundeException
 * 
 * 
 * Class对象：
 * （1）获取它的类加载器对象
 */
public class TestClassLoader {
	@Test
	public void test3()throws Exception{
		Class c = TestClassLoader.class;
		ClassLoader classLoader = c.getClassLoader();
		System.out.println(classLoader);
	}
	
	@Test
	public void test2()throws Exception{
		Class c = Class.forName("com.atguigu.loader.bean.Student");
		ClassLoader classLoader = c.getClassLoader();
		System.out.println(classLoader);
	}
	
	@Test
	public void test1(){
		Class c = String.class;
		ClassLoader classLoader = c.getClassLoader();
		System.out.println(classLoader);//null，因为String由引导类加载器加载，无法得到它的对象
	}
}

class MyClassLoader{
	private ClassLoader parent;//可以指定AppClassLoader的对象为我的parent

	public MyClassLoader(ClassLoader parent) {
		super();
		this.parent = parent;
	}
	
}
