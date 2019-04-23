package code_day33;

import java.lang.reflect.Field;
import java.lang.reflect.Type;


public class TestGetSetField {
	
	@Test
	public void test1() throws Exception  {
		Class<?> clazz = Class.forName("code_day33.bean.Employee");
		//创建员工对象
		Object emp = clazz.newInstance();
		System.out.println(emp);
		//获取对象的某个属性,现在假设知道,实际可以通过配置文件等方式获取
		Field fieldSalary = clazz.getDeclaredField("salary");
		System.out.println(fieldSalary);
		
		//salary属性是私有的,无法直接操作
		
		fieldSalary.set(emp, 222);
	}
	
	HashMap
}		
