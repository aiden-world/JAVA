package wydhcws.beans;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -1908418097222163847L;
	private Integer id;
	private String username;
	private String password;
	private String email;

	public User() {
	}

	public User(Integer id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "User [id=" + this.id + ", username=" + this.username + ", password=" + this.password + ", email="
				+ this.email + "]";
	}
}