/*
包：

1、包的作用
（1）避免类的重名    -->最核心的作用
（2）组织和管理众多的类
（3）控制一下类或成员的访问范围

2、如何声明包？
（1）位置：必须在一个源文件（.java）的首行
（2）格式：
package 包名;
（3）包名的规范：
①所有单词都小写，每一个单词之间使用.分割
②一般/习惯上使用公司域名倒置 + 模块名

www.atguigu.com

常见的包：
com.atguigu.bean;
com.atguigu.service;
com.atguigu.dao;
...

核心类库中常见的包：
java.lang：  例如：String,System，Math等
java.util：	 例如：Scanner，Random等
java.io：
java.sql：
java.text：
....

3、声明了包之后，类有什么不同？
类的全名称：包.类名

例如：
java.util.Scanner 

4、包在操作系统层面，如何体现呢？
通过目录结构来体现

编译时，可以让编译器帮我们自动创建包的目录结构：
javac 源文件名.java
javac -d class存放的目录 源文件名.java
例如：javac -d . 源文件名.java  其中的.表示当前文件

java 包.类名

5、如何使用其他包的类？
前提：这个类或成员必须是可访问的，例如public，如果是子类还可以是protected
形式：
（1）使用全名称
java.util.Scanner input = new java.util.Scanner(System.in);
com.atguigu.other.Other t = new com.atguigu.other.Other();
（2）使用导包语句，然后在代码中使用类的简名称

导包语句的位置必须在package和class声明之间。

导包语句的格式：
import 包.类名;

有的时候，可以这样写？
import 包.*;   //*只能省略类名，不能使用子包名

*/

package com.atguigu.pkg;

import com.atguigu.other.Other;

//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

class TestPackage{
	public static void main(String[] args){
		System.out.println("Hello 包");
		
		com.atguigu.other.Other t1 = new com.atguigu.other.Other();
		
		Other t2 = new Other();
		Other t3 = new Other();
		
		Scanner input = new Scanner(System.in);
	}
}