package usersModule;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class usersModule {
	
	String connectionURL = "jdbc:sqlserver://den1.mssql1.gear.host;databaseName=usersmodule";
	String user = "usersmodule";
	String pwd = "Ie12?OB?Cc8H";
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	
	
	public String loginUser(String username, String password) {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection(connectionURL,user, pwd);
		
			String SQL = "select id_user from users where username ='"+username +"'AND password='"+password+"';"; //hold on
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
			if (!rs.next()) {
				return "The username/password doesn't exist.";
			} else {
				int activeuser = Integer.parseInt(rs.getString(1));
				return "User "+ activeuser +"logged in successfully";
			}
						
				
			} catch (Exception e){
				
				e.printStackTrace();
				
			}
		return "The username/password doesn't exist.";
		
}
	
	public String registerUser(String name, String lastName, String id, String phone, String username, 
			String password, String email, String emergencyPhone, char account_status) {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection(connectionURL,user, pwd);
			
			String SQL = "insert into Users (name,last_name,id,phone,username,password,email,emergencyphone,account_status) values "
					+ "('" +name+"', '"+lastName+"', "+id+", "+phone+", '"+username+"', '"+password+"', '"+email+"', "+emergencyPhone+", '"+account_status+ "');"; //hold on
			
	
			
			stmt = con.createStatement();
			int count = stmt.executeUpdate(SQL);
			if (count>0) {
				return "User "+name+" registered!";
				
				
			} else {
				
				return "Error registering User";
				
			}
						
		}catch (Exception e){	
				e.printStackTrace();
		}
		
		
		
		
		return "Error registering User";
				
	}
	
	
	public String updateName(String newName, int userId) {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection(connectionURL, user, pwd);
			
			String SQL = "update users set name ='"+newName +"' where id_user = '"+userId +"';";
			
			stmt = con.createStatement();
			int count = stmt.executeUpdate(SQL);
			if (count>0) {
				return "USER's NAME UPDATED";
				
			} else {
				
				return "Error updating User's Name";
			}	
			} catch (Exception e){
				
				e.printStackTrace();
				
			}
		
		
		return "Error updating User's Name";
	}
	
public String updateLastName(String newLastName, int userId) {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection(connectionURL, user, pwd);
			
			String SQL = "update users set last_name ='"+newLastName +"' where id_user = '"+userId +"';";
			
			stmt = con.createStatement();
			int count = stmt.executeUpdate(SQL);
			if (count>0) {
				return "USER's LASTNAME UPDATED";
				
			} else {
				
				return "Error updating User's Last Name";
			}	
			} catch (Exception e){
				
				e.printStackTrace();
				
			}
		
		
		return "Error updating User's Last Name";
	}

public String updatePhone(String newPhone, int userId) {
	
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con= DriverManager.getConnection(connectionURL, user, pwd);
		
		String SQL = "update users set phone ='"+newPhone +"' where id_user = '"+userId +"';";
		
		stmt = con.createStatement();
		int count = stmt.executeUpdate(SQL);
		if (count>0) {
			return "USER's PHONE UPDATED";
			
		} else {
			
			return "Error updating User's PHONE";
		}	
		} catch (Exception e){
			
			e.printStackTrace();
			
		}
	
	
	return "Error updating User's Phone";
}

public String updatePassword(String newPassword, int userId) {
	
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con= DriverManager.getConnection(connectionURL, user, pwd);
		
		String SQL = "update users set password='"+newPassword +"' where id_user = '"+userId +"';";
		
		stmt = con.createStatement();
		int count = stmt.executeUpdate(SQL);
		if (count>0) {
			return "USER's PASSOWRD UPDATED";
			
		} else {
			
			return "Error updating User's Password";
		}	
		} catch (Exception e){
			
			e.printStackTrace();
			
		}
	
	
	return "Error updating User's Password";
}
public String updateEmail(String newEmail, int userId) {
	
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con= DriverManager.getConnection(connectionURL, user, pwd);
		
		String SQL = "update users set email ='"+newEmail +"' where id_user = '"+userId +"';";
		
		stmt = con.createStatement();
		int count = stmt.executeUpdate(SQL);
		if (count>0) {
			return "USER's EMAIL UPDATED";
			
		} else {
			
			return "Error updating User's EMAIL";
		}	
		} catch (Exception e){
			
			e.printStackTrace();
			
		}
	
	
	return "Error updating User's Email";
}

public String updateEPhone(String newEPhone, int userId) {
	
	try {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		con= DriverManager.getConnection(connectionURL, user, pwd);
		
		String SQL = "update users set emergencyphone ='"+newEPhone +"' where id_user = '"+userId +"';";
		
		stmt = con.createStatement();
		int count = stmt.executeUpdate(SQL);
		if (count>0) {
			return "USER's EMERGENCY PHONE UPDATED";
			
		} else {
			
			return "Error updating User's Emergency Phone";
		}	
		} catch (Exception e){
			
			e.printStackTrace();
			
		}
	
	
	return "Error updating User's Emergency Phone";
}

public String updateAccountStatus(char newAccountStatus, int userId) {
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection(connectionURL, user, pwd);
			
			String SQL = "update users set account_status ='"+newAccountStatus +"' where id_user = '"+userId +"';";
			
			stmt = con.createStatement();
			int count = stmt.executeUpdate(SQL);
			if (count>0) {
				return "USER's ACCOUNT STATUS UPDATED";
				
			} else {
				
				return "Error updating User's Account Status";
			}	
			} catch (Exception e){
				
				e.printStackTrace();
				
			}
		
		
		return "Error updating User's Account Status";
	}
	
	public String createAddress(int userId, String address) {
		char status = 'A';
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection(connectionURL, user, pwd);
			
			String SQL = "insert into AddressBook (id_user,address, status) values ('"+userId+"','"+address+"','"+status+"');";
			
			stmt = con.createStatement();
			int count = stmt.executeUpdate(SQL);
			if (count>0) {
				return "USER's ADDRESS CREATED";
				
			} else {
				
				return "Error creating User's Address";
			}	
			} catch (Exception e){
				
				e.printStackTrace();
				
			}
		
		
		return "Error updating User's Address";
	}
	
	public String deactiveAddress(int addressId) {
		char status = 'D';
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection(connectionURL, user, pwd);
			
			String SQL = "update AddressBook set status ='"+ status + "' where id_address = '"+ addressId +"';";
			
			stmt = con.createStatement();
			int count = stmt.executeUpdate(SQL);
			if (count>0) {
				return "USER's ADDRESS DEACTIVATED";
				
			} else {
				
				return "Error deactivating User's Address";
			}	
			} catch (Exception e){
				
				e.printStackTrace();
				
			}
		
		
		return "Error deactivating User's Address";
	}
	
	public String assignUserTypes(int idUser, int idUserType){
	try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con= DriverManager.getConnection(connectionURL, user, pwd);
			
			String SQL = "insert into UsersXUserTypes (id_user, id_user_type) values ('"+idUser+"','"+idUserType+"')";
			
			stmt = con.createStatement();
			int count = stmt.executeUpdate(SQL);
			if (count>0) {
				return "USER's TYPE ASSIGNED SUCCESSFULLY";
				
			} else {
				
				return "Error assigning User's Type";
			}	
			} catch (Exception e){
				
				e.printStackTrace();
				
			}
		
		
		return "Error assigning User's Type";
	
	
	}
	
	
}