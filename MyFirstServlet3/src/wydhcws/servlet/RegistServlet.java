package wydhcws.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import wydhcws.dao.UserDao;
import wydhcws.dao.impl.UserDaoImpl;

public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("password");
		UserDao userDao = new UserDaoImpl();
		if (userDao.checkUsername(username)) {
			request.setAttribute("msg", "用户已存在");
			request.getRequestDispatcher("/pages/regist.jsp").forward(request, response);
		} else {
			userDao.saveUser(username, password, email);
			response.sendRedirect(request.getContextPath() + "/pages/login.jsp");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		this.doGet(request, response);
	}
}