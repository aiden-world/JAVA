/*
数组的维度：一维数组、二维数组、三维数组....

一维数组存一组数据，可以看成一行数据
二维数组存n组数据，可以看成n行数据，每一行有m列，是一个“矩阵”

二维数组：
1、如何声明二维数组？
	元素的数据类型[][] 数组名;  推荐
	
	其他写法：
		元素的数据类型[] 数组名[];  不推荐
		元素的数据类型 数组名[][]; 	不推荐
		
		//int[] scores[];
		//int scores[][];
		//面试题
		//int[] arr1, arr2[];  //arr1是一维数组，arr2是二维数组
		
2、创建二维数组
（1）第一种写法
	数组名 = new 元素的数据类型[n][m];
	同时指定行数和每一行的列数，而且每一行的列数是一样的。
（2）第二种写法
	数组名 = new 元素的数据类型[n][];   -->指定总行数
	数组名[行下标] = new 元素的数据类型[该行的总列数];  -->为某一行指定列数
（3）第三种写法
	数组名 = new 元素的数据类型[][]{{第一行的元素列表}，{第二行的元素列表}。。。};
	
3、二维数组的遍历
for(int i=0; i<总行数; i++){
	for(int j=0; j<每一行的列数; j++){
		System.out.print(scores[i][j] +"\t");
	}
	System.out.println();
}
	
例如：
	保存一组学员的成绩 -->int[] score;
	保存一个班8个组的学员的成绩，后面要分别找每一组的平均分、最高分等-->int[][] scores;
*/
class TwoDimensionalArray{
	public static void main(String[] args){
		//声明一个二维数组
		int[][] scores;
		
		//创建二维数组
		scores = new int[3][4];	
		
		System.out.println("二维数组名：" + scores);
		
		//3行  scores[0],scores[1],scores[2]
		for(int i=0; i<3; i++){
			System.out.println("第" +(i+1)+ "行：" + scores[i]); 
		}
		
		//遍历二维数组
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				System.out.print(scores[i][j] +"\t");
			}
			System.out.println();
		}
		
		scores[0][2] = 34;
		
		//再次遍历二维数组
		System.out.println("------------------------------");
		for(int i=0; i<3; i++){
			for(int j=0; j<4; j++){
				System.out.print(scores[i][j] +"\t");
			}
			System.out.println();
		}
	}
}