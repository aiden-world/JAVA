/*
一、概念
数组：简单的说就是一组数
目的：方便管理一组数

数组是指相同数据类型的数据，按照一定的顺序排列的集合/容器。
即把有限个相同类型的变量使用统一的命名进行管理，
这个统一的名称就是“数组名”。
然后每一个数据使用一个编号进行区别，那么这个编号称为“索引，下标 index”，
数组中的每一个数据就是数组的“元素 element”。
一个数组中元素的总个数，我们称为“数组的长度 length”。

下标的范围：[0, length-1]

解释：为什么数组的下标从[0]开始？
因为这一组数在内存中要占据一大块位置。这个时候数组名仅仅记录数组的首地址。
那么想要访问数组的元素，就通过数组名和下标结合的方式访问，
表示这个元素的位置距离“首地址”多远。
第一个元素：数组名[0]，表示距离“首地址”[0]个间隔
第二个元素：数组名[1]，表示距离“首地址”[1]个间隔
....

之前，变量代表一个内存区域。

变量：一个数据

例如：存储一个同学的成绩，用一个变量
      存储一组同学的成绩，用一个数组
	  
	  
*/
class TestArray{
	public static void main(String[] args){
		/*
		int score1 = 89;
		int score2 = 80;
		int score3 = 67;
		int score4 = 87;
		int score5 = 90;
		//....
		//管理：找最高分，排序等
		*/
		
		int[] scores = new int[5];
		scores[0] = 89;
		scores[1] = 80;
		scores[2] = 67;
		scores[3] = 87;
		scores[4] = 90;
		
		//显示所有成绩
		System.out.println("成绩如下：");
		for(int i=0; i<scores.length; i++){
			System.out.println(scores[i]);
		}
		
		int max = 0;
		for(int i=0; i<scores.length; i++){
			if(max < scores[i]){
				max = scores[i];
			}
		}
		System.out.println("最高分：" +max);
	}
	
}