/*
数组的算法：
1、找最值
2、找最值下标
3、查找
（1）顺序查找
（2）二分查找
4、数组求和与平均值
5、数组复制
6、数组的反转
7、数组的排序
（1）冒泡排序
（2）直接选择排序
其他排序...
*/
class SelectSort{
	public static void main(String[] args){
		int[] arr = {4,8,2,9,1};
		
		//选择排序
		for(int i=1; i<arr.length; i++){//轮数
			//每一轮定 
			/*
			第一轮：i=1，定arr[0]，定arr[i-1]，比较4次，arr[0]与arr[1]，arr[2]，arr[3]，arr[4]
			第二轮：i=2，定arr[1]，定arr[i-1]，比较3次，arr[1]与arr[2]，arr[3]，arr[4]
			第三轮：i=3，定arr[2]，定arr[i-1]，比较2次，arr[2]与arr[3]，arr[4]
			第四轮：i=4，定arr[3]，定arr[i-1]，比较1次，arr[3]与arr[4]
			*/
			for(int j=i; j<=arr.length-1; j++){
				if(arr[i-1] > arr[j]){
					int temp = arr[i-1];
					arr[i-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		//显示结果
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
