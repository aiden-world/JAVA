/*
����

1����������
��1�������������    -->����ĵ�����
��2����֯�͹����ڶ����
��3������һ������Ա�ķ��ʷ�Χ

2�������������
��1��λ�ã�������һ��Դ�ļ���.java��������
��2����ʽ��
package ����;
��3�������Ĺ淶��
�����е��ʶ�Сд��ÿһ������֮��ʹ��.�ָ�
��һ��/ϰ����ʹ�ù�˾�������� + ģ����

www.atguigu.com

�����İ���
com.atguigu.bean;
com.atguigu.service;
com.atguigu.dao;
...

��������г����İ���
java.lang��  ���磺String,System��Math��
java.util��	 ���磺Scanner��Random��
java.io��
java.sql��
java.text��
....

3�������˰�֮������ʲô��ͬ��
���ȫ���ƣ���.����

���磺
java.util.Scanner 

4�����ڲ���ϵͳ���棬��������أ�
ͨ��Ŀ¼�ṹ������

����ʱ�������ñ������������Զ���������Ŀ¼�ṹ��
javac Դ�ļ���.java
javac -d class��ŵ�Ŀ¼ Դ�ļ���.java
���磺javac -d . Դ�ļ���.java  ���е�.��ʾ��ǰ�ļ�

java ��.����

5�����ʹ�����������ࣿ
ǰ�᣺�������Ա�����ǿɷ��ʵģ�����public����������໹������protected
��ʽ��
��1��ʹ��ȫ����
java.util.Scanner input = new java.util.Scanner(System.in);
com.atguigu.other.Other t = new com.atguigu.other.Other();
��2��ʹ�õ�����䣬Ȼ���ڴ�����ʹ����ļ�����

��������λ�ñ�����package��class����֮�䡣

�������ĸ�ʽ��
import ��.����;

�е�ʱ�򣬿�������д��
import ��.*;   //*ֻ��ʡ������������ʹ���Ӱ���

*/

package com.atguigu.pkg;

import com.atguigu.other.Other;

//import java.util.Scanner;
//import java.util.Random;
import java.util.*;

class TestPackage{
	public static void main(String[] args){
		System.out.println("Hello ��");
		
		com.atguigu.other.Other t1 = new com.atguigu.other.Other();
		
		Other t2 = new Other();
		Other t3 = new Other();
		
		Scanner input = new Scanner(System.in);
	}
}