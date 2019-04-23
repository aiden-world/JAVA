

public class PrintGraph1 {
	public static void main(String[] args) {
		//int[][] arr = new int[][] {{1,1,1},{2,2,2},{3,3,3}};
		int[][] arr = new int[5][];
		// System.out.println(arr.length);
		for(int i=0;i<arr.length;i++) {
			arr[i] = new int[i+1];
			for(int j=0;j<arr[i].length;j++)
			arr[i][j] = i+1;
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
			System.out.print(arr[i][j]);
			System.out.println();
	}
}
}

	

//public class PrintGraph1 {
//	public static void main(String[] args) {
//		int[] arr = {1,2,3,4,5};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i];j++)
//			System.out.print(arr[i]);
//			System.out.println();
//	}
//	}
//}
//	