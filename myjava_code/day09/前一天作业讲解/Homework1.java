/*
1、使用二维数组打印一个 10 行杨辉三角.
1
1 1
1 2 1
1 3 3  1
1 4 6  4  1
1 5 10 10 5 1
 ....
  
【提示】
 1. 第一行有 1 个元素, 第 n 行有 n 个元素
 2. 每一行的第一个元素和最后一个元素都是 1
 3. 从第三行开始, 对于非第一个元素和最后一个元素的元素. 
     yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
     yanghui[2][1] = yanghui[1][0] + yanghui[1][1] = 1+1 =2
     yanghui[3][1] = yanghui[2][0] + yanghui[2][1] = 1+2 =3
     yanghui[3][2] = yanghui[2][1] + yanghui[2][2] = 2+1 =3
*/
class Homework1{
	public static void main(String[] args){
		//使用二维数组打印一个 10 行杨辉三角
		int[][] yanghui = new int[10][];
		
		//确定每一行的列数
		for(int i=0; i<yanghui.length; i++){
			//第一行有 1 个元素, 第 n 行有 n 个元素
			yanghui[i] = new int[i+1];
		}
		
		//给二维数组赋值
		for(int i=0; i<yanghui.length; i++){
			
			//每一行的第一个元素和最后一个元素都是 1
			yanghui[i][0] = 1;
			yanghui[i][yanghui[i].length-1] = 1;//yanghui[i][i] = 1;
			
			//为非第一个和最后一个元素赋值
			for(int j=1; j<yanghui[i].length-1; j++){
				//从第三行开始, 对于非第一个元素和最后一个元素的元素
				yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];
			}
		}
		
		//遍历显示
		for(int i=0; i<yanghui.length; i++){
			for(int j=0; j<yanghui[i].length; j++){
				System.out.print(yanghui[i][j]  + "\t");
			}
			System.out.println();
		}
	}
}	 