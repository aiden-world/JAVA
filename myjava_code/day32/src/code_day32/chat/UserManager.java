package code_day32.chat;

import java.util.*;

public class UserManager {
	public static HashMap<String,String >allUsers = new HashMap<>();
	static {
		allUsers.put("gangge", "123");
		allUsers.put("xiaobai", "456");
		allUsers.put("gujie", "789");
	}

	public static boolean login(String username,String password) {
		if(allUsers.get(username)!=null && allUsers.get(username).equals(password)){
			return true;
		}else{
			return false;
	}
	}	


}
