/*
数组的查找：
（1）顺序查找
	数组的元素是可以有序，无序
（2）二分查找
    前提：数组的元素是有序的

*/
class ArrayBinarySearch{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("请输入整数：");
		int num = input.nextInt();
		
		/*
		//假设数组的元素是从小到大
		第一步：先用num与数组的中间的元素进行比较，看是否是要查找的数
		中间的元素：arr.length/2  例如：length是10  中间的元素  arr[5]  
										length是9   中间的元素  arr[4]
		如果num与中间的元素不相等
		if(num > 中间的元素){
			往右走
		}else if(num < 中间的元素){
			往左走
		}else{
			找到了
		}
		*/
		int index = -1;
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right + 1) /2;
		
		while(left < right){
			if(num == arr[mid]){
				index = mid;
				break;
			}else if(num < arr[mid]){
				//往左边找
				right = mid -1;//错误right = mid;
			}else{
				//往右边找
				left = mid + 1;//错误left = mid;
			}
			mid = (left + right + 1) /2;
		}	
		
		if(index == -1){
			System.out.println("没找到");
		}else{
			System.out.println("下标：" + index);
		}
	}
}