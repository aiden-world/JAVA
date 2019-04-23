public class ArrayUtil {
	//求数组最大值
	public int getMax(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			
		}
		return max;
	}
	//求数组最小值
	public int getMin(int[] arr) {
		int min = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min<arr[i]) {
				min = arr[i];
			}
			
		}
		return min;
	}
	//遍历数组元素
	public void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("]");
	}
	//求数组的平均数
	public int getAverage(int[] arr) {
		int sum = getSum(arr);
		return  sum/arr.length;
	} 
	//求数组的总和
	public int getSum (int[] arr) {
		int sum = 0;
		for(int i=0;i<arr.length;i++) 
			sum += arr[i] ;	
		return sum;
	}
	//数组的反转
	public int[] reverse(int[] arr) {
		for(int x=0,y=arr.length-1;x<y;x++,y--) {
			int temp = arr[y];
			arr[y] = arr[x];
			arr[x] = temp;
			}
		return arr;	
	}
 	//实现数组的复制
	public int[] copy(int[] arr){
		//int[] arr1 =arr; 错误，堆空间内数组还是只有一份
		int[] arr1 =new int[arr.length];
		for(int i = 0;i < arr.length];i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}
	//对数组进行排序
	public void sort(int[] arr,String type) {
		if(type == "asc") {
		for (int i = 0; i < arr.length - 1; i++) 
			for (int j = 0; j < arr.length - 1 - i; j++) 
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		}
		else if(type == "desc") {
			for (int i = 0; i < arr.length - 1; i++) 
				for (int j = 0; j < arr.length - 1 - i; j++) 
					if (arr[j] < arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
		}
		else System.out.println("您的排序方式输入有误");
	}
	//对数组指定元素进行交换：交换索引为i和j的两个元素
	public void swap(int[] arr ,int i,int j) {
		int temp =arr[j];
		arr[j] = arr[i];
		arr[i] = temp ;
	}
	
	
	
	
}
