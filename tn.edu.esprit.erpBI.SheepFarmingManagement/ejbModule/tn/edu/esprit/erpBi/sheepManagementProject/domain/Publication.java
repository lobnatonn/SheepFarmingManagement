package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Publication
 * 
 */
@Entity
public class Publication implements Serializable {

	private int idPublication;
	private String textPublication;
	private String datePublication;
	private static final long serialVersionUID = 1L;

	private List<Comment> comments;
	private List<Visibility> visibilities;

	public Publication() {
		super();
	}

	@Id
	public int getIdPublication() {
		return this.idPublication;
	}

	public void setIdPublication(int idPublication) {
		this.idPublication = idPublication;
	}

	public String getTextPublication() {
		return this.textPublication;
	}

	public void setTextPublication(String textPublication) {
		this.textPublication = textPublication;
	}

	public String getDatePublication() {
		return this.datePublication;
	}

	public void setDatePublication(String datePublication) {
		this.datePublication = datePublication;
	}

	@OneToMany(mappedBy = "publication")
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	@OneToMany(mappedBy = "publication")
	public List<Visibility> getVisibility() {
		return visibilities;
	}

	public void setVisibility(List<Visibility> visibility) {
		this.visibilities = visibility;
	}

}
