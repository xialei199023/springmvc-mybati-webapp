package demo.model;

/**
 * 数据模型，与数据库表里面的字段对应。
 * @author xialei
 *
 */
public class User {

	private String username;
	
	private String password;
	
	private Integer role;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
}
