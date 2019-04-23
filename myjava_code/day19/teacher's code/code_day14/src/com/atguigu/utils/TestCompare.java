package com.atguigu.utils;

import java.util.Arrays;
import java.util.Comparator;


/*
 * java.util.Arrays：
 * （1）sort(Object[] arr)
 * （2）sort(Object[] arr, Comparator c)
 * 
 * 接口：
 * java.lang.Comparable：
 * 			int compareTo(Object obj)
 * java.util.Comparator：
 * 			int compare(Object o1, Object o2)
 * 
 * 结论：
 * 首先考虑java.lang.Comparable
 * 当这个无法做到时，再用备胎  java.util.Comparator
 */
public class TestCompare {
	public static void main(String[] args) {
		String[] arr = {"Hello","hello","world","Java"};
		//String实现java.lang.Comparable接口，按照字符的Unicode值大小排序
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		//新需求，不区分大小写，按照字母顺序排列
		Arrays.sort(arr, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				String s1 = (String) o1;
				String s2 = (String) o2;
				return s1.compareToIgnoreCase(s2);
			}
			
		});
		System.out.println(Arrays.toString(arr));
	}
	
	
}

