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
class SelectSort2{
	public static void main(String[] args){
		int[] arr = {4,8,2,9,1};
		
		//选择排序
		for(int i=1; i<arr.length; i++){//轮数
			/*
			找出本轮未排序元素中的最小值，放到它正确的位置
			第一轮：找出本轮未排序元素中的最小值，放到[0]
					未排序[0]-[4]
			第二轮：找出本轮未排序元素中的最小值，放到[1]
					未排序[1]-[4]
			第三轮：找出本轮未排序元素中的最小值，放到[2]
					未排序[2]-[4]
			第四轮：找出本轮未排序元素中的最小值，放到[3]
					未排序[3]-[4]
			*/
			//(1)先找出本轮未排序元素中的最小值
			int min = arr[i-1];//假设本轮未排序元素的第一个元素最小
			int index = i-1;
			//依次用min与剩下的元素一一比较
			for(int j=i; j<=arr.length-1; j++){
				if(min > arr[j]){
					min = arr[j];
					index = j;
				}
			}
			//（2）把最小值放到[i-1]的位置
			if(index != i-1){
				//交换[index]与[i-1]位置的元素
				int temp = arr[i-1];
				arr[i-1] = arr[index];
				arr[index] = temp;
			}
		}
		
		//显示结果
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}
