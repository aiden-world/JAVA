/*
二、数组的使用
1、数组的四要素：
（1）数据类型
第一个意思：数组的数据类型   因为它属于引用数据类型
第二个意思：数组的元素的数据类型   它可以是基本数据类型，也可以是引用数据类型
（2）数组名  
（3）数组的长度
（4）数组的元素的值
   数组的元素如果没有赋值，那么会有一个默认值：
   元素是基本数据类型：
   byte,short,int,long：0
   float,double：0.0
   char： \u0000表示ASCII值/Unicode编码值为0的字符，一个空字符
   boolean：false
   元素是引用数据类型：null
   

2、数组的使用
（1）数组的声明
	数组的元素的类型[]  数组名;
	例如：int[] scores;
		  char[] letters;
		  String[] names;
		  double[] weights;
		  ...
（2）确定数组的长度  -->在内存中申请一整块空间
	数组名 = new 数组的元素类型[长度];

（3）数组的元素赋值
	数组名[下标] = 值;
	
（4）访问数组的元素的值	
		  
回忆：
变量的三要素：数据类型、变量名、变量值
变量的声明：
	数据类型 变量名;
	例如：int age;
		  int score;
		  char c;
		  String str;
		  ...
*/
class TestArrayUse{
	public static void main(String[] args){
		//用一个数组存储5个同学的成绩
		//(1)声明一个数组
		int[] scores;
		//(2)确定数组的长度
		scores = new int[5];
		//（3）为元素赋值，一个一个来
		scores[0] = 89;
		scores[1] = 80;
		scores[2] = 67;
		scores[3] = 87;
		scores[4] = 90;
		
		System.out.println("第一个同学的成绩：" + scores[0]);
		//所有同学的成绩
		System.out.println("所有学生的成绩：");
		for(int i=0; i<5; i++){
			System.out.print(scores[i] + "\t");
		}
		System.out.println();
		
		//用一个数组存储26个英文小写字母
		//（1）声明数组
		char[] letters;
		//（2）确定数组的长度
		letters = new char[26];
		//（3）为元素赋值，可以通过for循环
		for(int i=0; i<26; i++){
			letters[i] = (char)('a' + i);
		}
		System.out.println("所有的小写字母：");
		for(int i=0; i<26; i++){
			System.out.print(letters[i] + " ");
		}
		
		//数组存储伟人姓名；
		String[] famouspeople = new String[4];
		famouspeople[0] = "毛泽东";
		famouspeople[1] = "邓小平";
		famouspeople[2] = "周恩来";
		famouspeople[3] = "习近平";
		for(int i =0;i<famouspeople.length;i++) {
			System.out.println(famouspeople[i]);
		}		
						
		}
	}





