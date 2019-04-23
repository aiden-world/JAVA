package wydhcws.dao.impl;

import wydhcws.beans.User;
import wydhcws.dao.BasicDao;
import wydhcws.dao.UserDao;

public class UserDaoImpl implements UserDao {
	BasicDao basicDao = new BasicDao();

	public User checkUsernameAndPassword(String username, String password) {
		String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
		User bean = (User) this.basicDao.getBean(User.class, sql, new Object[]{username, password});
		return bean;
	}

	public boolean checkUsername(String username) {
		String sql = "SELECT * FROM users WHERE username = ? ";
		User bean = (User) this.basicDao.getBean(User.class, sql, new Object[]{username});
		return bean != null;
	}

	public void saveUser(String username, String password, String email) {
		String sql = "insert into users(username,password,email) values(?,?,?)";
		this.basicDao.update(sql, new Object[]{username, password, email});
	}
}