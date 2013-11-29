package bean;

import java.io.Serializable;
import java.sql.*;

import javax.faces.bean.ManagedBean;

import database.ConnectionDb;

@ManagedBean
public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String username;
	private String lastName;
	private String firstName;
	private String pwd;
	private String email;
	private int age;

	public UserBean() {


		
	}

	public void setUsername(String u) throws ClassNotFoundException, SQLException {
		ConnectionDb a = new ConnectionDb();
		a.openBb();
		this.username = u;
	}
	public String getUsername() {
		return this.username;
	}
	public void setFirstName(String u) {
		this.firstName = u;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setLastName(String u) {
		this.lastName = u;
	}
	public String getLastName() {
		return this.lastName;
	}

	public void setPwd(String p) {
		this.pwd = p;
	}
	public String getPwd() {
		return this.pwd;
	}
	
	public void setEmail(String p) {
		this.email = p;
	}
	public String getEmail() {
		return this.email;
	}
	
	public void setAge(int p) {
		this.age = p;
	}
	public int getAge() {
		return this.age;
	}
}
