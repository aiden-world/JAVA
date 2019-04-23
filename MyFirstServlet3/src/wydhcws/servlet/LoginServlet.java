package wydhcws.servlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import wydhcws.beans.User;
import wydhcws.dao.UserDao;
import wydhcws.dao.impl.UserDaoImpl;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserDao userDao = new UserDaoImpl();
		User user = userDao.checkUsernameAndPassword(username, password);
		if (user != null) {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect(request.getContextPath() + "/GetEmployeesServlet");
		} else {
			request.setAttribute("msg", "用户名或密码不正确");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/pages/login.jsp");
			requestDispatcher.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		this.doGet(request, response);
	}
}