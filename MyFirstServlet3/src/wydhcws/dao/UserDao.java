package wydhcws.dao;

import wydhcws.beans.User;

public interface UserDao {
	User checkUsernameAndPassword(String var1, String var2);

	boolean checkUsername(String var1);

	void saveUser(String var1, String var2, String var3);
}