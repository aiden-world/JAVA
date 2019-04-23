
public class TestArray {
	public static void main(String[] args) {
		int[] arr = new int[] {12,4,76,0,-98,-54,4,100};
		
		ArrayUtil au = new ArrayUtil();
		int  max = au.getMax(arr);
		System.out.println("最大值为：" + max );
		
		int avg = au.getAverage(arr);
		System.out.println("平均值为：" + avg );
		
		au.printArray(arr);

		System.out.println("反转数组" );
		au.reverse(arr);
		
		au.printArray(arr);
		
		System.out.println("对数组降序排序：");
		au.sort(arr,"desc");
		au.printArray(arr);
		
		System.out.println("对数组升序排序：");
		au.sort(arr,"asc");
		au.printArray(arr);
		
		System.out.println("交换第一位和第三位：");
		au.swap(arr, 0, 2);
		au.printArray(arr);
		
	}

}
