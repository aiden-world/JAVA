package wydhcws.test;

import org.junit.jupiter.api.Test;
import wydhcws.beans.User;
import wydhcws.dao.UserDao;
import wydhcws.dao.impl.UserDaoImpl;

class UserDaoImplTest {
	UserDao userDao = new UserDaoImpl();

	@Test
	void testCheckUsernameAndPassword() {
		User user = this.userDao.checkUsernameAndPassword("admin", "123456");
		System.out.println(user);
	}

	@Test
	void testCheckUsername() {
		boolean cu = this.userDao.checkUsername("admin");
		System.out.println(cu);
	}

	@Test
	void testSaveUser() {
		this.userDao.saveUser("wydhcws", "1234", "7777@my.com");
	}
}