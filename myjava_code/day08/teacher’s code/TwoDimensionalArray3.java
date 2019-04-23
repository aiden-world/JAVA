class TwoDimensionalArray3{
	public static void main(String[] args){
		//声明一个二维数组
		//int[][] scores;
		
		//为二维数组静态初始化
		//scores = new int[][]{{1,2,3,4,5},{1,2,3},{1,2,3,4}};
		
		//可以简化
		int[][] scores = {{1,2,3,4,5},{1,2,3},{1,2,3,4}};
		
		//遍历结果
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				System.out.print(scores[i][j] +"\t");
			}
			System.out.println();
		}
	}
}