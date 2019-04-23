package wydhcws.servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import wydhcws.beans.Employee;
import wydhcws.dao.EmployeeDao;
import wydhcws.dao.impl.EmployeeDaoImpl;

@WebServlet({"/GetEmployeesServlet"})
public class GetEmployeesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		EmployeeDao empDao = new EmployeeDaoImpl();
		List<Employee> emps = empDao.getEmployees();
		request.setAttribute("emps", emps);
		request.getRequestDispatcher("/pages/main.jsp").forward(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}