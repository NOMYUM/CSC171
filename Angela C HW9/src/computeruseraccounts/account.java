package computeruseraccounts;

public class account {
	private String name;
	private String password;

	public account(String name, String password) {
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		return "Name of the account is" + this.name + ". " + "The password is" + this.password;
	}
}