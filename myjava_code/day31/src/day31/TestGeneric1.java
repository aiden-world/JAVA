package day31;
import java.util.*;
public class TestGeneric1 {
	public static void main(String[] args) {
		List<?>[] arr = new List<?>[2];
		arr[0] = Arrays.asList("hello","java");
		arr[1] = Arrays.asList(1,2,3);
		for (List<?> list : arr) {
			for (Object object : list) {
				System.out.println(object);
			}
		}
		
		
		//ArrayList<String>[] array = new ArrayList<String>[5];
		//编译错误,不能声明带泛型数组
		//仅仅能声明带<?>的数组但是不能创建对应的对象,上面是由函数asList创建的arr数组对象
		
		
		
		
		
	}

}
