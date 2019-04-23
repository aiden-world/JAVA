/*
二维数组：
	二维数组的总行数：二维数组名.length
	每一行：二维数组名[行下标]   行下标 [0, 二维数组名.length-1]
	每一行的列数： 二维数组名[行下标].length
	每一个元素：二维数组名[行下标][列下标]  列下标[0, 二维数组名[行下标].length-1]
*/
class TwoDimensionalArray2{
	public static void main(String[] args){
		//声明一个二维数组
		int[][] scores;
		
		//创建二维数组
		//第一步：先指定行数
		scores = new int[3][];
		
		System.out.println("二维数组名：" + scores);
		
		for(int i=0; i<scores.length; i++){
			System.out.println("第" +(i+1)+ "行：" + scores[i]); 
		}
		
		//（2）为每一行单独分配列数
		//如果没有这一步，下面的代码会报NullPointerException空指针异常
		scores[0] = new int[4];//给第一行分配4列
		scores[1] = new int[5];//给第二行分配5列
		scores[2] = new int[3];//给第三行分配3列
		
		//遍历二维数组
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				System.out.print(scores[i][j] +"\t");
			}
			System.out.println();
		}
	}
}