
// �������в�ѯָ��������
// ���ʹ�ñ����ķ�ʽ�������в�ѯָ��������,���ַ�ʽ��Ϊ���Բ�ѯ,�ʺ���ҪС�͵�����
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
		    System.out.println("�ҵ���");
		}else{
		    System.out.println("û���ҵ���");
		}
		
	
	}
}

// ����Ӵ��͵������в�ѯ����,����ʹ�ö��ַ�,Ҳ��Ϊ�۰뷨
// ע��
// 1.ʹ�ö��ַ���ʱ��,ֻ���������õ�����
// 2.�����в������ظ�������.
class Test02_Array2{
	public static void main(String [] args){
	    int [] arr = {10,11,12,13,14,15,16,17,18,19};
		int key = 20; // ��Ҫ�������в�ѯ������

		int start = 0; // ����һ������ָ�������0������
		int end = arr.length -1; // ����һ������,ָ����������һ��Ԫ��

        boolean flag = false; 
		int middle = -1;
		while(start <= end){
		    middle = (start + end) / 2;
			if(arr[middle] == key){
			    flag = true;
				break;
			}
			// ����,������Ҫ��18,����arr[middle]��14
			else if(arr[middle] < key){
				start = middle +1;
			}
			// ������Ҫ��18,����arr[middle]��19
			else{
				end = middle -1;
			}
		}

        if(flag){
		    System.out.println("�ҵ�����,������:" + middle);
		}else{
			System.out.println("û���ҵ�����");
		}
	}
}

// ��ϰ:ʹ�ö��ַ���char[]���͵������в�ѯ����
// char [] arr = {'a','b','c','d','e','f','g','h','i'};


////////////////////////////////////////////////////////////////
// ʹ��ð�ݷ��������������д�С��������
// ����ĳ�����6
// ��һ��: i = 0 ,�Ƚ���5��
// ��һ��: i = 1 ,�Ƚ���4��
// ������: i = 2 ,�Ƚ���3��
// ������: i = 3 ,�Ƚ���2��
// ������: i = 4 ,�Ƚ���1��

class Test02_Array3{
    public static void main(String [] args){
	    int [] arr = {12,43,98,24,52,9,9,100,43};
        
		// N��Ԫ�ص�����,Ҫ�Ƚ�N-1��,����,6��Ԫ�ص�����Ҫ�Ƚ�5��
		// ���forѭ�����ǿ��ƵıȽϵ�����
		// ð�ݷ��Ŀھ�:
		// N��Ԫ�������� ;�������С��ǰ;����ѭ��N-1;����ѭ��N-1-i
		for(int i = 0;i< arr.length-1;i++){
			// �������ѭ��������ÿ�ֱȽϵĴ���
			for(int j = 0; j< arr.length-1-i ; j++){
				// ���ǰ��������������,��Ѵ��������
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
// ʹ��ð�ݷ��������������д�С��������
// ����ĳ�����4
// ��1��: i = 0 ,�Ƚ���3��
// ��2��: i = 1 ,�Ƚ���2��
// ��3��: i = 2 ,�Ƚ���1��

class Test02_Array4{
    public static void main(String [] args){
	    int [] arr = {12,43,98,24,52,9,9,100,43};
        
		// �����ѭ�������ǿ���ѭ��������
		for(int  i = 0;i < arr.length-1;i++){
		    for(int j=arr.length-1; j > i  ;j--){
				// ������������ǰ�������,��Ѵ������ǰ��
				if(arr[j] < arr[j-1]){
                    int num = arr[j];  // ȡ��arr[j]��ֵ��ֵ����ʱ����num
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


// ��ϰ:��һ��������ַ�����a��,��c��,��u��,��b��,��e��,��p��,��f��,��z�������򲢰���Ӣ����ĸ����������

// ʹ��ѡ�����򷨶�����������������
class Test02_Array5{
    public static void main(String [] args){
	    int [] arr = {12,43,98,24,52,9,9,100,43};
	
	     // �������forѭ�����Ƶ����ܵıȽϵ�����
		 for(int i = 0;i< arr.length-1;i++){
			 int min = i; // ������С������i���±����ڵ���
			 
			 // �������ѭ��֮��,�ҳ���������������С���ݵ��±�
			 for(int j=i+1; j<arr.length ;j++){
				 // arr[min] = 10 ,min= 0
				 // arr[j]   = 8 
				 if(arr[min] > arr[j]){
				     min = j;
				 }
			 }

			 if(min != i){
			     // ����min��i������ֵ
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

// �������ĩβ�����µ�����
// �������һ��������֮��,�䳤���ǲ��ɸı��!����������ֻ�ܴ洢һ�������̶�������
class Test02_Array6{
    public static void main(String [] args){
		// �������Ĭ�ϲ���7
	    int [] arr = {1,2,3,4,5,6};
        // �������ĳ����ǲ��ɸı��
		//arr.length = 7;

		// 1.����һ���µ��������,�µ��������ĳ�����ԭ������󳤶�+1
		int [] temp = new int[arr.length+1];

		// 2. ��ԭ�������е����ݸ��Ƶ��µ���ʱ������
		for(int i= 0;i< arr.length;i++){
		    temp[i] = arr[i];
		}

		// 3.������ָ���µ��������
		// �������͵ı����ڴ��ݵ�ʱ�򴫵ݵ������õĵ�ַ
		arr = temp;

		// 4.�������6�����������µ�����
		arr[6] = 7;

		// 5.������������
		for(int i = 0;i< arr.length;i++){
		   System.out.println("arr[" + i + "]=" + arr[i]);
		}	
	}
}

// �����������λ�ò�������,����:�������3����������100
// �����������ɾ�����ݵĲ���߯����.����Ĳ�ѯ�ٶȿ�.
class Test02_Array7{
    public static void main(String [] args){
	    // �������3����������100
	    int [] arr = {1,2,3,4,5,6};

		int inserIndex = 3; // Ҫ�������ݵ�����
		int key = 100 ; // Ҫ���������

		// 1.����һ���µ��������,�µ��������ĳ�����ԭ������󳤶�+1
		int [] temp = new int[arr.length+1];

		// 2. ��ԭ�������е����ݸ��Ƶ��µ���ʱ������
		for(int i= 0;i< arr.length;i++){
		    temp[i] = arr[i];
		}

		// 3.������ָ���µ��������
		// �������͵ı����ڴ��ݵ�ʱ�򴫵ݵ������õĵ�ַ
		arr = temp;

        // 4. �������д�inserIndexλ�ÿ�ʼ����������ƶ�
		for(int i = arr.length-1; i > inserIndex ;i--){
             arr[i] = arr[i-1];
		}

		// 5.��inserIndexλ�ò����µ�����
		arr[inserIndex] = key;

	    // 6.������������
		for(int i = 0;i< arr.length;i++){
		   System.out.println("arr[" + i + "]=" + arr[i]);
		}	
	}
}

// ��һ�����鸴�Ƶ���һ�����������������,���ҿ���ָ�����������ĳ���
class Test02_Array8{
     public static void main(String [] args){
	    // ԭ�������鳤����6, �Ѹ����鸴�Ƶ���һ��10�����ȵ�������
	    int [] arr = {1,2,3,4,5,6};

        // System�����ṩ��һ����̬�ķ���,���ǿ���ֱ��ͨ���������е���
		// public static void arraycopy(Object src,
        //                     int srcPos,
        //                     Object dest,
        //                     int destPos,
        //                     int length)
		// ������
        //src - Դ���顣
        //srcPos - Դ�����е���ʼλ�á�
        //dest - Ŀ�����顣
        //destPos - Ŀ�������е���ʼλ�á�
        //length - Ҫ���Ƶ�����Ԫ�ص�������

		// 1.����һ��10��Ԫ�ص��������
		int temp [] =new int[10];

		// 2.����System���е��ṩ��arraycopy()������������Ŀ���
		System.arraycopy(arr,0,temp,0,arr.length);

		// 3.����ʱ����ĵ�ַ��ֵ��arr
		arr = temp;

		// 4.����arr���������
        for(int i = 0;i< arr.length;i++){
		   System.out.println("arr[" + i + "]=" + arr[i]);
		}	
      }
}


// Java�и������ṩ��һ��������Arrays,����������������
class Test02_Array9{
     public static void main(String [] args){
           //int  [] arr = {1,2,3,4,5,6,7,8,9,10};
		   
		   // binarySearch()������Ҫ�ĵ�һ��������Ҫ��ѯ������,�ڶ���������Ҫ��ѯ������
		   // �÷������ص��Ǹ������������е�����.���������,�򷵻ظ���
		   //int index =  java.util.Arrays.binarySearch(arr,20);
		   // System.out.println("Ҫ��ѯ���ݵ�������:" + index);


		   // ����Arrays.copyOf()����,�������鿽��.���ص����µĳ��ȵ�����
		   //arr =  java.util.Arrays.copyOf(arr,20);
           
		   // Arrays.toString()�Ѳ��������е���������һ��String�в��ҷ���
		   //String str = java.util.Arrays.toString(arr);
		   //System.out.println(str);

		   // ����Arrays.sort()�������������
		   int [] arr = {12,5,34,89,14,76,90,43};
		   java.util.Arrays.sort(arr);
		   String str = java.util.Arrays.toString(arr);
		   System.out.println(str);
	 }
}