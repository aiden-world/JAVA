package wydhcws.test;

import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Test;
import wydhcws.beans.Employee;
import wydhcws.dao.EmployeeDao;
import wydhcws.dao.impl.EmployeeDaoImpl;

class EmployeeDaoTest {
	EmployeeDao empDao = new EmployeeDaoImpl();

	@Test
	void testGetEmployees() {
		List<Employee> employees = this.empDao.getEmployees();
		Iterator var3 = employees.iterator();

		while (var3.hasNext()) {
			Employee employee = (Employee) var3.next();
			System.out.println(employee);
		}

	}
}