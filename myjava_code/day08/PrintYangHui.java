
public class PrintYangHui {
	public static void main(String[] args) {
		int l =10;
		int[][] yangHui = new int[l][];
		//yangHui[0][0] =1; //未完全创建子级数组.赋值报错空指针(未创建二级数组)
		for(int i=0;i<yangHui.length;i++) {
			yangHui[i] = new int[i+1]; 
			for(int j=0;j<=i;j++) {
			if(i==j||j==0) yangHui[i][j]=1;
			 //if (i==1) yangHui[1][1]=1;
			else yangHui[i][j] = yangHui[i-1][j-1] + yangHui[i-1][j];	 
			}
		}
		//System.out.println(yangHui[1][1]);
		for(int i=0;i<yangHui.length;i++) {
			for(int j=0;j<=i;j++) 
				System.out.print(yangHui[i][j]+"\t");
		System.out.println();
		}
	}
}

