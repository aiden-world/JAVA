package wydhcws.dao;

import java.util.List;
import wydhcws.beans.Employee;

public interface EmployeeDao {
	List<Employee> getEmployees();
}