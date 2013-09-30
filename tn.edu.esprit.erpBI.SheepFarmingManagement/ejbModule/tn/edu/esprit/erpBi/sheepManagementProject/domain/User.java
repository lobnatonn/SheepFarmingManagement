package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: User
 * 
 */
@Entity
public class User implements Serializable {

	private int idUser;
	private String nameUser;
	private String firstNameUser;
	private String adressUser;
	private int phoneNumberUser;
	private String mailUser;
	private static final long serialVersionUID = 1L;

	private Role role;
	private List<Comment> comments;
	private List<Sheep> sheeps;
	private List<Consultation> consultations;
	private List<Visibility> visibilities;

	public User() {
		super();
	}

	@Id
	public int getIdUser() {
		return this.idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNameUser() {
		return this.nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	public String getFirstNameUser() {
		return this.firstNameUser;
	}

	public void setFirstNameUser(String firstNameUser) {
		this.firstNameUser = firstNameUser;
	}

	public String getAdressUser() {
		return this.adressUser;
	}

	public void setAdressUser(String adressUser) {
		this.adressUser = adressUser;
	}

	public int getPhoneNumberUser() {
		return this.phoneNumberUser;
	}

	public void setPhoneNumberUser(int phoneNumberUser) {
		this.phoneNumberUser = phoneNumberUser;
	}

	public String getMailUser() {
		return this.mailUser;
	}

	public void setMailUser(String mailUser) {
		this.mailUser = mailUser;
	}

	@ManyToOne
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@OneToMany(mappedBy = "user")
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(mappedBy = "user")
	public List<Sheep> getSheeps() {
		return sheeps;
	}

	public void setSheeps(List<Sheep> sheeps) {
		this.sheeps = sheeps;
	}

	@OneToMany(mappedBy = "user")
	public List<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	@OneToMany(mappedBy = "user")
	public List<Visibility> getVisibilities() {
		return visibilities;
	}

	public void setVisibilities(List<Visibility> visibilities) {
		this.visibilities = visibilities;
	}

}
