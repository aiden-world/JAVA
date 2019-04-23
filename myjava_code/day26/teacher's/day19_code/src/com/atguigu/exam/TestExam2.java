package com.atguigu.exam;

import java.util.Arrays;

/*
 * 2、已知字符串String str = "1.hello2.world3.java4.string";
要求拆分出每一个单词，并遍历显示
 */
public class TestExam2 {
	public static void main(String[] args) {
		String str = "tom1.hello2.world3.java4.string   irene";
/*		str = str.replaceFirst("^\\d\\.", "");
		String[] split = str.split("\\d\\.");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}*/
		
		String[] chai = chai(str);
		System.out.println(Arrays.toString(chai));
	}
	
	public static String[] chai(String str){
		//(1)把str中非单词字符去掉
		str = str.replaceAll("[^a-zA-Z]", "-");
		String[] split = str.split("-+");
		return split;
	}
}
