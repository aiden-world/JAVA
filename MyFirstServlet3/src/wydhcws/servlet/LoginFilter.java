package wydhcws.servlet;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import wydhcws.beans.User;

@WebFilter({"/pages/login_success.jsp"})
public class LoginFilter implements Filter {
	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		if (user != null) {
			chain.doFilter(request, response);
		} else {
			req.setAttribute("msg", "需要登陆");
			req.getRequestDispatcher("/pages/login.jsp").forward(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}
}