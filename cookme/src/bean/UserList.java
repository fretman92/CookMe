package bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserList {

	private List<User> users;
	private User selectedUser;

	public UserList() {
		users = new ArrayList<User>();
		User u;
		for (int i = 0; i < 20; i++) {
			u = new User();
			u.setName("joe" + i);
			u.setPwd("pwd" + i);
			u.setEmail("jDoe" + i + "@company.com");
			u.setAge(i);
			users.add(u);
		}
	}

	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public User getSelectedUser() {
		return selectedUser;
	}
	
	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}

}
