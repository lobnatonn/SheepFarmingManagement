package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Visibility
 * 
 */
@Entity
@Table(name="T_VISIBILITY")
public class Visibility implements Serializable {

	private VisibilityPK visibilityPK;
	private boolean right;
	private static final long serialVersionUID = 1L;

	private User user;
	private Publication publication;

	public Visibility() {
		super();
	}

	public boolean getRight() {
		return this.right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	@EmbeddedId
	public VisibilityPK getVisibilityPK() {
		return visibilityPK;
	}

	public void setVisibilityPK(VisibilityPK visibilityPK) {
		this.visibilityPK = visibilityPK;
	}

	@ManyToOne
	@JoinColumn(name = "idUse", referencedColumnName = "idUser", insertable = false, updatable = false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne
	@JoinColumn(name = "idPubli", referencedColumnName = "idPublication", insertable = false, updatable = false)
	public Publication getPublication() {
		return publication;
	}

	public void setPublication(Publication publication) {
		this.publication = publication;
	}

}
