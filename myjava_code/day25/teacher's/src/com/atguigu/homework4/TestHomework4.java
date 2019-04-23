package com.atguigu.homework4;

/*
 * 4、获取两个字符串中最大相同子串。比如：
   str1 = "abcwerthelloyuiodef“;str2 = "cvhellobnm"
   提示：将短的那个串进行长度依次递减的子串与较长的串比较。
 */
public class TestHomework4 {
	public static void main(String[] args) {
		String str1 = "abcwerthelloyuiodef";
		String str2 = "cvhellobnm";
		
		String max = getMaxSub2(str1,str2);
		System.out.println("最大相同子串：" + max);
	}
	
	/*
	 * 思路：
	 * （1）可以依次减少短的字符串，与长的字符串必须
	 * 第一轮：左边不减，或者说左边减少0个字符，右边依次减少0,1,2,3,4...
	 * 		i=0, j=0,1,2,.....,min.length-i
	 * 		abcwerthelloyuiodef  与  cvhellobnm
	 * 		abcwerthelloyuiodef  与  cvhellobn
	 * 		abcwerthelloyuiodef  与  cvhellob
	 * 		abcwerthelloyuiodef  与  cvhellob
	 * 		。。。。
	 * 		abcwerthelloyuiodef  与  c
	 * 		
	 * 。。。	
	 * 第二轮：左边减少1个字符，右边依次减少0,1,2,3,4...
	 * 		abcwerthelloyuiodef  与  vhellobnm
	 * 		abcwerthelloyuiodef  与  vhellobn
	 * 		abcwerthelloyuiodef  与  vhellob
	 * 		abcwerthelloyuiodef  与  vhello
	 * 		abcwerthelloyuiodef  与  vhell
	 * 		。。。
	 * 		abcwerthelloyuiodef  与  v
	 * 
	 * 。。。	
	 * 第二轮：左边减少2个字符，右边依次减少0,1,2,3,4...
	 * 		abcwerthelloyuiodef  与  hellobnm
	 * 		abcwerthelloyuiodef  与  hellobn
	 * 		abcwerthelloyuiodef  与  hellob
	 * 		abcwerthelloyuiodef  与  hello
	 * 		abcwerthelloyuiodef  与  hell
	 * 		。。。
	 * 		abcwerthelloyuiodef  与  h
	 * 。。。。	
	 */
	public static String getMaxSub(String str1, String str2){
		long start  = System.currentTimeMillis();
		//第一步：先确定str1和str2的长短
		String max = str1.length() >= str2.length() ? str1 : str2;
		String min = str1.length() < str2.length() ? str1 : str2;
		
		String result = "";//初始化为""，如果它俩没有相同子串，那么我们说它俩的相同子串为空字符串
		
		//第二步：找出它俩的最大相同子串
		for (int i = 0; i < min.length(); i++) {//外循环控制轮数
			//每一轮从左边减去i个字符，
			for (int j = 0; j < min.length()-i; j++) {//每一轮比较的次数
				//每一轮的每一次，从右边依次减去j个字符
				String sub = min.substring(i, min.length()-j);
				if(max.contains(sub)){
					//sub是它俩的相同子串
					//这个子串是否要赋值给result，条件是它的长度比result中记录的子串还要长
					if(sub.length() > result.length()){
						result = sub;
					}
				}
			}
			
		}
	
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		return result;
	
	}

	/*
	 * 思路：
	 * 	依次减少短的字符串的字符的个数，与长的字符串比较
	 *  第一轮：把短的字符串，减少1个
	 *  第二轮：把短的字符串，减少2个
	 *  第三轮：把短的字符串，减少3个
	 *  ...
	 */
	public static String getMaxSub2(String str1, String str2){
		long start  = System.currentTimeMillis();
		//第一步：先确定str1和str2的长短
		String max = str1.length() >= str2.length() ? str1 : str2;
		String min = str1.length() < str2.length() ? str1 : str2;
		
		int k = min.length();//k表示短的字符串要留下的字符的个数
		
		for (int i = 0; i < min.length(); i++) {
			for (int j = 0; j <= i; j++) {
				String str = min.substring(j);//每一次去掉开头的j个字符
				str = str.substring(0, k);//再把刚才的字符串，结尾再截掉k个
				if(max.contains(str)){
					long end = System.currentTimeMillis();
					System.out.println(end-start);
					return str;
				}
			}
			k--;
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		return "";
	}
}
