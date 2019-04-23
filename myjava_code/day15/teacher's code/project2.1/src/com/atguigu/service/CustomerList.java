package com.atguigu.service;

import java.util.Arrays;

import com.atguigu.bean.Customer;

public class CustomerList {
	private Customer[] all;//用来存储客户对象的数组
	private int total;//好比是停车场管理员，时刻记录停车场中的车的数量
	
	public CustomerList(){
		all = new Customer[5];
	}
	public CustomerList(int length){
		all = new Customer[length];
	}
	
	//添加一个客户对象到数组all的方法
	public boolean addCustomer(Customer customer){
		if(total >= all.length){
			System.out.println("数组已满");
			return false;
		}
		all[total] = customer;
		total++;
		return true;
	}
	
	//根据下标删除一个客户对象的方法
	public boolean removeCustomer(int index){
		if(index<0 || index>total-1){
			System.out.println(index + "不存在");
			return false;
		}
		
		//(1)把index后面的元素往前移动
		/*
		 * System.arraycopy方法：当源数组与目标数组是同一个数组时，可以实现移动元素的效果，如果是不同的数组，实现的就是复制数组的效果
		 * 第一个参数：传源数组名
		 * 第二个参数：源数组从什么位置开始移动，起始下标
		 * 第三个参数：传目标数组名
		 * 第四个参数：目标数组的起始下标，即原数组的第一个元素要放到目标数组的位置
		 * 第五个参数：一共要移动几个元素
		 * 
		 * total=3,index=0，移动[1],[2]两个     		total-index-1
		 * total=5,index=1，移动[2],[3],[4]三个  	total-index-1
		 */
		System.arraycopy(all, index+1, all, index, total-index-1);
		
		/*
		 * 当前假设，total=3,index=0，移动[1],[2],i=0,1
		 * 当前假设，total=5,index=1，移动[2],[3],[4], i=1,2,3
		 */
		//for (int i = index; i < total-1; i++) {//移动几个
			/*
			 * 当前假设，total=3,index=0，移动[1],[2],i=0,1
			 * 当i=index，循环了2次
			 * all[0] = all[1]
			 * all[1] = all[2]
			 */
		//	all[i] = all[i+1];
		//}
		
		/*
		 * 当前假设，total=3,index=0，移动[1],[2],i=1,2
		 * 当前假设，total=5,index=1，移动[2],[3],[4], i=2,3,4
		 */
		//for (int i = index+1; i < total; i++) {//移动几个
			/*
			 * 当前假设，total=3,index=0，移动[1],[2],i=1,2
			 * all[0] = all[1]
			 * all[1] = all[2]
			 */
			//all[i-1] = all[i];
		//}	
		
		//(2)把all[total-1]=null
		//(3)total--
		all[--total] = null;
		
		return true;
	}
	
	
	//根据下标查询（获取）一个客户对象的方法
	public Customer getByIndex(int index){
		if(index<0 || index>total-1){
			return null;
		}
		return all[index];
	}
	
	//根据下标替换一个客户对象的方法
	public boolean replace(int index,Customer newCustomer){
		if(index<0 || index>total-1){
			return false;
		}
		
		all[index] = newCustomer;
		return true;
	}
	
	//返回/获取所有客户对象的方法
	public Customer[] getAll(){
		//return all;
		//有total个就给total个
		/*Customer[] result = new Customer[total];
		for (int i = 0; i < result.length; i++) {
			result[i] = all[i];
		}
		return result;*/
		
		/*
		 * java.util.Arrays工具类
		 * public static <T> T[] copyOf(T[] original, int newLength)
		 * 目前用意念看成
		 * public static  Object[] copyOf(Object[] original, int newLength)
		 * 作用：复制出一个新数组
		 * 第一个参数：源数组
		 * 第二个参数：新数组的长度
		 */
		return Arrays.copyOf(all, total);
	}
}
