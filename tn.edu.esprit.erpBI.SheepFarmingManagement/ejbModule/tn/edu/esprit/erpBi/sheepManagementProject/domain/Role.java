package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Role
 * 
 */
@Entity
public class Role implements Serializable {

	private int idRole;
	private int privilege;
	private String nameRole;
	private static final long serialVersionUID = 1L;

	private List<User> users;

	public Role() {
		super();
	}

	@Id
	public int getIdRole() {
		return this.idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public int getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}

	public String getNameRole() {
		return this.nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	@OneToMany(mappedBy = "role")
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
