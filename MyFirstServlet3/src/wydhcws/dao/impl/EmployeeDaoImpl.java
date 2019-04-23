package wydhcws.dao.impl;

import java.util.List;
import wydhcws.beans.Employee;
import wydhcws.dao.BasicDao;
import wydhcws.dao.EmployeeDao;

public class EmployeeDaoImpl extends BasicDao implements EmployeeDao {
	public List<Employee> getEmployees() {
		String sql = "select id,last_name lastName,email,salary,dept from employees";
		List<Employee> beanList = this.getBeanList(Employee.class, sql, new Object[0]);
		return beanList;
	}
}