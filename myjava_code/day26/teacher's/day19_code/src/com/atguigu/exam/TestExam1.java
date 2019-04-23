package com.atguigu.exam;

/*
 * 1、编写方法，该方法可以统计出某个字符串（该字符串中可能包含各种字符，包括标点、空格等），
出现次数最多的英文字母（暂不考虑出现两个相同最多的字母）。不考虑大小写。
提示：可以查API

例如：String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";
 */
public class TestExam1 {
	public static void main(String[] args) {
		String str = "1、 hello 2. world 3. java 4.String 5. haha 6、HELLO";
	/*	char c = getManyTime(str);
		System.out.println(str+"中出现次数最多的字母是：" + c);*/
		
		char c = getManyTime2(str);
		System.out.println(str+"中出现次数最多的字母是：" + c);
	}
	
	public static char getManyTime(String str){
		//(1)第一步：把字符串转成小写
		str = str.toLowerCase();
		
		char result = '\u0000';
		int count = 0;
		
		//(2)统计每一个字母出现的次数
		//思路：用26个小写的英文字母，与str中的每一个字符比较，如果相同，那么就统计次数
		for (char letter = 'a'; letter <= 'z'; letter++) {
			int num = 0;//每一个字母的次数
			for (int i = 0; i < str.length(); i++) {
				if(letter == str.charAt(i)){
					num++;
				}
			}
			
			//如果num》count，说明找到了更多次数的字母
			if(num > count){
				count = num;
				result = letter;
			}
		}
		
		if(result == '\u0000'){
			throw new RuntimeException(str + "中没有字母");
		}
		
		return result;
	}

	public static char getManyTime2(String str){
		//(1)把str转成小写
		str = str.toLowerCase();
		
		//(2)去掉str中非小写字母
		str = str.replaceAll("[^a-z]", "");
		
		//(3)声明一个数组，来存储26个字母出现的次数
		int[] counts = new int[26];
		/*
		 * counts[0]记录a的次数     a-97=0
		 * counts[1]记录b的次数     b-97=1
		 * counts[2]记录b的次数     c-97=2
		 */
		for (int i = 0; i < str.length(); i++) {
			counts[str.charAt(i)-97] ++;
		}
		
		//(4)找出数组中的最大值的下标
		int index = 0;
		for (int i = 0; i < counts.length; i++) {
			if(counts[index] < counts[i]){
				index = i;
			}
		}
		
		return (char)(index+97);
	}
}
