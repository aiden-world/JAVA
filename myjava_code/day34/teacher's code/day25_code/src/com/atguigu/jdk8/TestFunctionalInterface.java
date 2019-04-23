package com.atguigu.jdk8;

import java.io.File;
import java.util.Iterator;

/*
 * 函数式接口：SAM接口就是Single Abstract Method，即该接口中有且只有一个抽象方法需要实现，当然该接口可以包含其他非抽象方法。
 * 回忆之前学过的接口中，哪些符合这种“特征”
 * （1）java.io.Serializable接口（不是）：没有抽象方法
 * （2）java.lang.Comparable<T>接口（是）
 * 		int compareTo(T t)
 * （3）java.util.Comparator<T>接口（是）
 * 		int compare(T t1, T t2)
 * （4）java.lang.Runnable接口（是）
 * 		void run()
 * （5）java.io.FileFilter接口（是）
 * 		 boolean accept(File pathname)
 * （6）java.lang.Iterable<T>接口（是）
 * 		Iterator<T> iterator()
 * （7）java.util.Iterator<T>接口（不是）：有两个抽象方法
 * 		boolean hasNext()
 * 		T next()
 * （8）java.util.Collection<E>,List<E>,Set<E>,Map<K,V>。。。都不是
 * 		
 * 
 * JDK1.8建议如果某个接口，你想确认它是函数式接口，请在声明接口时，在它的上面加一个注解：@FunctionalInterface
 * 发现：
 * （1）java.lang.Comparable<T>接口：虽然目前满足SAM特征，但是Java8没有增加@FunctionalInterface
 * 		我们在使用这个接口时，目前可以使用Lambda表达式，但是不建议对它使用Lambda表达式，因为后期可能增加抽象方法
 * （2）java.util.Comparator<T>接口：增加了@FunctionalInterface
 * 		可以放心使用Lambda表达式
 * （3）java.lang.Runnable接口：增加了@FunctionalInterface
 * 		可以放心使用Lambda表达式
 * （4）java.io.FileFilter接口：增加了@FunctionalInterface
 * 		可以放心使用Lambda表达式
 * （5）java.lang.Iterable<T>接口：虽然目前满足SAM特征，但是Java8没有增加@FunctionalInterface
 * 
 * 
 * 以前学过的接口中，只有三个接口增加@FunctionalInterface：
 * 		java.util.Comparator<T>接口、java.lang.Runnable接口、java.io.FileFilter接口
 * 
 * 今天要新学习Java8增加的函数式接口。java.util.function
 * 
 * 新的函数式接口主要分为四大类：根据抽象方法的特征来分的
 * （1）消费（耗）型接口：例如：Consumer<T>
 * 		它的抽象方法：void accept(T t)   有参无返回值            因为对于调用者来说，你调用时需要给它“实参”，但是得不到“返回值”
 * 
 * （2）供给型接口：例如：Supplier<T>
		它的抽象方法：T get()			无参有返回值	因为对于调用者来说，你调用时不需要给它“实参”，但是可以得到“返回值”
		
 * （3）判断型接口：例如：Predicate<T>
 * 		它的抽象方法：boolean test(T t)  有参，并且返回值类型是固定boolean  因为对于调用者来说，你调用时需要给它“实参”，但是得到的结果只有true,false，这个实参就是用于条件判断。
 * 																这里也说明了这个接口的Lambda表达式是“条件判断”
 * （4）功能型接口：例如： Function<T,R>
		它的抽象方法：R apply(T t)  		有参有返回值	因为对于调用者来说，你调用时需要给它“实参”，并且也可以得到“返回值”
 * 
 * 
 */
public class TestFunctionalInterface {

}
