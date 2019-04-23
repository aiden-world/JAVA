/*
2、从键盘确定班级的组数，在从键盘输入每一组的人数，并输入每一个学员的成绩，并求出，
每一组的平均分，全部的平均分，每一组的最高分，全部的最高分，并显示结果
*/
class Homework2{
	public static void main(String[] args){
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		//从键盘确定班级的组数  --> 就是二维数组的行数
		System.out.print("请输入一共有几组：");
		int count = input.nextInt();
		
		//声明二维数组，用来存成绩
		int[][] scores = new int[count][];
		
		//确定每一组的人数--->确定每一行的列数
		for(int i=0; i<scores.length; i++){
			System.out.print("请输入第" + (i+1) +"组的人数：");
			int ren = input.nextInt();
			scores[i] = new int[ren];
		}
		
		//确定每一个人的成绩 -->为二维数组的元素赋值
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				System.out.print("请输入第" + (i+1) +"组的第" + (j+1) + "个学员的成绩：");
				scores[i][j] = input.nextInt();
			}
		}
		
		//显示
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		
		//先求全班的平均分，和最高分
		double sum = 0;
		int total = 0;
		int max = scores[0][0];//假设第一组的第一个学员的成绩最高
		//用max和所有人都比较一遍
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				
				sum += scores[i][j];
				total++;
				
				if(scores[i][j] > max){
					max = scores[i][j];
				}
			}
		}
		System.out.println("全班的平均分：" + sum/total);
		System.out.println("全班的最高分：" + max);
		
		//每一组的平均分和最高分
		//如果要存储每一组的平均分和最高分，有几组就有几个平均分和最高分
		double[] avgs = new double[scores.length];
		int[] maxs = new int[scores.length]; 
		for(int i=0; i<scores.length; i++){
			double groupSum = 0;//记录每一组的总分
			
			//假设每一组第一个学员成绩最高
			maxs[i] = scores[i][0];
			
			for(int j=0; j<scores[i].length; j++){
				groupSum += scores[i][j];
				
				if(scores[i][j] > maxs[i]){
					maxs[i] = scores[i][j];
				}
			}
			
			//计算该组的平均分 = 本组的总分/本组的人数
			avgs[i] = groupSum/scores[i].length;
		}
		
		//显示结果
		System.out.println("每一组的平均分和最高分：");
		for(int i=0; i<scores.length; i++){
			System.out.println("第"+(i+1)+"组的平均分是："+avgs[i]+"，最高分：" + maxs[i]);
		}
	}
}