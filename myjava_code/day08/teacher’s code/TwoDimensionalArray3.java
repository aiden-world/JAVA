class TwoDimensionalArray3{
	public static void main(String[] args){
		//����һ����ά����
		//int[][] scores;
		
		//Ϊ��ά���龲̬��ʼ��
		//scores = new int[][]{{1,2,3,4,5},{1,2,3},{1,2,3,4}};
		
		//���Լ�
		int[][] scores = {{1,2,3,4,5},{1,2,3},{1,2,3,4}};
		
		//�������
		for(int i=0; i<scores.length; i++){
			for(int j=0; j<scores[i].length; j++){
				System.out.print(scores[i][j] +"\t");
			}
			System.out.println();
		}
	}
}