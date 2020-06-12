package member;

public class Member {
	private String userid, password, name;

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "[아이디: " + userid + ", 비번: " + password + ", 이름: " + name +"]";
	}
	
	
}
