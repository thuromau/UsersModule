package usersModule;

public class User {

	private int id_user;
	private String name;
	private String last_name;
	private String id;
	private String phone;
	private String username;
	private String password;
	private String email;
	private String emergencyphone;
	private char account_status;
	private int userType;
	
	public User() {
		name="";
		last_name="";
		id="";
		phone="";
		username="";
		password="";
		email="";
		emergencyphone="";
		account_status=' ';
		userType=0;
	}
	
	public User(int id_user, String name, String last_name, String id, String phone, String username,String password, String email,String emergencyphone, char account_status, int userType) {
		this.id_user=id_user;
		this.name=name;
		this.last_name=last_name;
		this.id=id;
		this.phone=phone;
		this.username=username;
		this.password=password;
		this.email=email;
		this.emergencyphone=emergencyphone;
		this.account_status=account_status;
		this.userType=userType;
		}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmergencyphone() {
		return emergencyphone;
	}

	public void setEmergencyphone(String emergencyphone) {
		this.emergencyphone = emergencyphone;
	}

	public char getAccount_status() {
		return account_status;
	}

	public void setAccount_status(char account_status) {
		this.account_status = account_status;
	}
	
	public int getUserType() {
		return this.userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}


	@Override
	public String toString() {
		return "User [id_user=" + id_user + ", name=" + name + ", last_name=" + last_name + ", id=" + id + ", phone="
				+ phone + ", username=" + username + ", password=" + password + ", email=" + email + ", emergencyphone="
				+ emergencyphone + ", account_status=" + account_status + ", userType=" + userType + "]";
	}
	
	
	
	
	
}
