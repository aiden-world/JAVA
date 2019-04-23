/*
跳转：
（1）break
用于switch：表示中途结束switch
用于循环结构：表示结束当前循环，注意只能结束一层循环

（2）continue
只能用于循环结构：表示提前结束本次循环体，
	如果是for直接进入下一次的迭代表达式
	如果是while和do...while直接进入下一次的条件判断
	
（3）return 今天不讲  结束的是整个方法

了解：
break和continue加标签
*/
class TestBreakContinue{
	public static void main(String[] args){
		/*
		for(int i=1; i<=5; i++){
			System.out.println(i);
			
			if(i==3){
				break;
			}
		}
		*/
		
		/*
		//i=1,2,3,4,5
		for(int i=1; i<=5; i++){
			//本类每一轮  j=1,2,3,4,5
			for(int j=1; j<=5; j++){
				System.out.print("*");
				
				//当i=1,j=1，就结束内循环  
				//当i=2,j=2，也是结束内循环
				if(j==i){
					break;
				}
			}
			System.out.println();			
		}
		*/
		
		/*
		for(int i=1; i<=10; i++){			
			if(i%3==0){
				continue;
			}
			
			System.out.println(i);
		}
		*/
		/*
		for(int i=1; i<=10; i++){			
			if(i%3!=0){
				System.out.println(i);
			}		
		}
		*/
		
		out:for(int i=1; i<=5; i++){
			
			for(int j=1; j<=5; j++){
				System.out.print("*");
				//当i=1,j=1，结束out标记的循环
				if(j==i){
					break out;
				}
			}
			System.out.println();			
		}
	}
}