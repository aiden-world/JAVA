/*
��ת��
��1��break
����switch����ʾ��;����switch
����ѭ���ṹ����ʾ������ǰѭ����ע��ֻ�ܽ���һ��ѭ��

��2��continue
ֻ������ѭ���ṹ����ʾ��ǰ��������ѭ���壬
	�����forֱ�ӽ�����һ�εĵ������ʽ
	�����while��do...whileֱ�ӽ�����һ�ε������ж�
	
��3��return ���첻��  ����������������

�˽⣺
break��continue�ӱ�ǩ
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
			//����ÿһ��  j=1,2,3,4,5
			for(int j=1; j<=5; j++){
				System.out.print("*");
				
				//��i=1,j=1���ͽ�����ѭ��  
				//��i=2,j=2��Ҳ�ǽ�����ѭ��
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
				//��i=1,j=1������out��ǵ�ѭ��
				if(j==i){
					break out;
				}
			}
			System.out.println();			
		}
	}
}