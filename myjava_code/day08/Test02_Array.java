
// 从数组中查询指定的数据
// 如果使用遍历的方式从数组中查询指定的数据,这种方式成为线性查询,适合需要小型的数组
class Test02_Array1
{
	public static void main(String [] args){
	    char [] arr = {'a','b','c','d','e','f','g','h','i'};

		boolean flag = false;

		for(int i = 0;i< arr.length;i++){
		    if(arr[i] == 'x'){				
				flag = true;
				break;
			}						
		}

		if(flag){
		    System.out.println("找到了");
		}else{
		    System.out.println("没有找到了");
		}
		
	
	}
}

// 如果从大型的数组中查询数据,可以使用二分法,也称为折半法
// 注意
// 1.使用二分法的时候,只能针对排序好的数组
// 2.数组中不能用重复的数据.
class Test02_Array2{
	public static void main(String [] args){
	    int [] arr = {10,11,12,13,14,15,16,17,18,19};
		int key = 20; // 需要从数组中查询的数据

		int start = 0; // 定义一个变量指向数组的0号索引
		int end = arr.length -1; // 定义一个变量,指向数组的最后一个元素

        boolean flag = false; 
		int middle = -1;
		while(start <= end){
		    middle = (start + end) / 2;
			if(arr[middle] == key){
			    flag = true;
				break;
			}
			// 例如,我们需要中18,但是arr[middle]是14
			else if(arr[middle] < key){
				start = middle +1;
			}
			// 我们需要中18,但是arr[middle]是19
			else{
				end = middle -1;
			}
		}

        if(flag){
		    System.out.println("找到数据,索引是:" + middle);
		}else{
			System.out.println("没有找到数据");
		}
	}
}

// 练习:使用二分法从char[]类型的数组中查询数据
// char [] arr = {'a','b','c','d','e','f','g','h','i'};


////////////////////////////////////////////////////////////////
// 使用冒泡法对无序的数组进行从小到大排序
// 数组的长度是6
// 第一轮: i = 0 ,比较了5次
// 第一轮: i = 1 ,比较了4次
// 第三轮: i = 2 ,比较了3次
// 第四轮: i = 3 ,比较了2次
// 第五轮: i = 4 ,比较了1次

class Test02_Array3{
    public static void main(String [] args){
	    int [] arr = {12,43,98,24,52,9,9,100,43};
        
		// N个元素的数组,要比较N-1轮,例如,6个元素的数组要比较5轮
		// 这个for循环就是控制的比较的轮数
		// 冒泡法的口诀:
		// N个元素来排序 ;两两相比小放前;外面循环N-1;里面循环N-1-i
		for(int i = 0;i< arr.length-1;i++){
			// 里面这个循环控制是每轮比较的次数
			for(int j = 0; j< arr.length-1-i ; j++){
				// 如果前面的数后面的数大,则把大的数向后放
			    if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		for(int num : arr){
		    System.out.println(num);
		}	   	
	}
}


////////////////////////////////////////////////////////////////
// 使用冒泡法对无序的数组进行从小到大排序
// 数组的长度是4
// 第1轮: i = 0 ,比较了3次
// 第2轮: i = 1 ,比较了2次
// 第3轮: i = 2 ,比较了1次

class Test02_Array4{
    public static void main(String [] args){
	    int [] arr = {12,43,98,24,52,9,9,100,43};
        
		// 外面的循环依旧是控制循环的轮数
		for(int  i = 0;i < arr.length-1;i++){
		    for(int j=arr.length-1; j > i  ;j--){
				// 如果后面的数比前面的数大,则把大的数向前法
				if(arr[j] < arr[j-1]){
                    int num = arr[j];  // 取出arr[j]的值赋值给临时变量num
					arr[j] = arr[j-1];
					arr[j-1] = num;
				}
			}
		} 

		for(int num : arr){
		    System.out.println(num);
		}	   	
	}
}


// 练习:有一列乱序的字符，‘a’,‘c’,‘u’,‘b’,‘e’,‘p’,‘f’,‘z’，排序并按照英文字母表的逆序输出

// 使用选择排序法对无序的数组进行排序
class Test02_Array5{
    public static void main(String [] args){
	    int [] arr = {12,43,98,24,52,9,9,100,43};
	
	     // 外面这个for循环控制的是总的比较的轮数
		 for(int i = 0;i< arr.length-1;i++){
			 int min = i; // 假设最小的数是i号下标坐在的数
			 
			 // 经过多次循环之后,找出了整个数组中最小数据的下标
			 for(int j=i+1; j<arr.length ;j++){
				 // arr[min] = 10 ,min= 0
				 // arr[j]   = 8 
				 if(arr[min] > arr[j]){
				     min = j;
				 }
			 }

			 if(min != i){
			     // 交换min和i索引的值
				 int temp = arr[min];
				 arr[min] = arr[i];
				 arr[i] = temp;
			 }		 
		 }	

		 for(int num: arr){
		     System.out.println(num);
		 }
	}
}

// 向数组的末尾插入新的数据
// 数组对象一旦创建好之后,其长度是不可改变的!所以数组中只能存储一组数量固定的数据
class Test02_Array6{
    public static void main(String [] args){
		// 向数组的默认插入7
	    int [] arr = {1,2,3,4,5,6};
        // 数组对象的长度是不可改变的
		//arr.length = 7;

		// 1.创建一个新的数组对象,新的数组对象的长度是原数组对象长度+1
		int [] temp = new int[arr.length+1];

		// 2. 把原来数组中的内容复制到新的临时数组中
		for(int i= 0;i< arr.length;i++){
		    temp[i] = arr[i];
		}

		// 3.把引用指向新的数组对象
		// 引用类型的变量在传递的时候传递的是引用的地址
		arr = temp;

		// 4.向数组的6号索引插入新的数据
		arr[6] = 7;

		// 5.输出数组的内容
		for(int i = 0;i< arr.length;i++){
		   System.out.println("arr[" + i + "]=" + arr[i]);
		}	
	}
}

// 向数组的任意位置插入数据,例如:向数组的3号索引插入100
// 向数组中添加删除数据的操作忒慢了.数组的查询速度快.
class Test02_Array7{
    public static void main(String [] args){
	    // 向数组的3号索引插入100
	    int [] arr = {1,2,3,4,5,6};

		int inserIndex = 3; // 要插入数据的索引
		int key = 100 ; // 要插入的数据

		// 1.创建一个新的数组对象,新的数组对象的长度是原数组对象长度+1
		int [] temp = new int[arr.length+1];

		// 2. 把原来数组中的内容复制到新的临时数组中
		for(int i= 0;i< arr.length;i++){
		    temp[i] = arr[i];
		}

		// 3.把引用指向新的数组对象
		// 引用类型的变量在传递的时候传递的是引用的地址
		arr = temp;

        // 4. 把数组中从inserIndex位置开始的数据向后移动
		for(int i = arr.length-1; i > inserIndex ;i--){
             arr[i] = arr[i-1];
		}

		// 5.向inserIndex位置插入新的数据
		arr[inserIndex] = key;

	    // 6.输出数组的内容
		for(int i = 0;i< arr.length;i++){
		   System.out.println("arr[" + i + "]=" + arr[i]);
		}	
	}
}

// 把一个数组复制到另一个更长的数组对象中,并且可以指定新数组对象的长度
class Test02_Array8{
     public static void main(String [] args){
	    // 原来的数组长度是6, 把该数组复制到另一个10个长度的数组中
	    int [] arr = {1,2,3,4,5,6};

        // System类中提供了一个静态的方法,我们可以直接通过类名进行调用
		// public static void arraycopy(Object src,
        //                     int srcPos,
        //                     Object dest,
        //                     int destPos,
        //                     int length)
		// 参数：
        //src - 源数组。
        //srcPos - 源数组中的起始位置。
        //dest - 目标数组。
        //destPos - 目标数据中的起始位置。
        //length - 要复制的数组元素的数量。

		// 1.创建一个10个元素的数组对象
		int temp [] =new int[10];

		// 2.调用System类中的提供的arraycopy()方法进行数组的拷贝
		System.arraycopy(arr,0,temp,0,arr.length);

		// 3.把临时数组的地址赋值给arr
		arr = temp;

		// 4.遍历arr数组的内容
        for(int i = 0;i< arr.length;i++){
		   System.out.println("arr[" + i + "]=" + arr[i]);
		}	
      }
}


// Java中给我们提供了一个工具类Arrays,可以用来操作数组
class Test02_Array9{
     public static void main(String [] args){
           //int  [] arr = {1,2,3,4,5,6,7,8,9,10};
		   
		   // binarySearch()方法需要的第一个参数是要查询的数组,第二个参数是要查询的数据
		   // 该方法返回的是该数据在数组中的索引.如果不存在,则返回负数
		   //int index =  java.util.Arrays.binarySearch(arr,20);
		   // System.out.println("要查询数据的索引是:" + index);


		   // 调用Arrays.copyOf()方法,进行数组拷贝.返回的是新的长度的数组
		   //arr =  java.util.Arrays.copyOf(arr,20);
           
		   // Arrays.toString()把参数数组中的数据整到一个String中并且返回
		   //String str = java.util.Arrays.toString(arr);
		   //System.out.println(str);

		   // 调用Arrays.sort()对数组进行排序
		   int [] arr = {12,5,34,89,14,76,90,43};
		   java.util.Arrays.sort(arr);
		   String str = java.util.Arrays.toString(arr);
		   System.out.println(str);
	 }
}