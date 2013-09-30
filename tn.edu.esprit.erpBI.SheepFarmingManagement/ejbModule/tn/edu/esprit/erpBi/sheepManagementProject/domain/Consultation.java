package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Consultation
 * 
 */
@Entity
public class Consultation implements Serializable {

	private ConsultationPk consultationPk;
	private String locationConsultation;
	private String dateConsultation;
	private String descriptionConsultation;
	private static final long serialVersionUID = 1L;

	private User user;
	private Sheep sheep;

	public Consultation() {
		super();
	}

	@EmbeddedId
	public ConsultationPk getConsultationPk() {
		return this.consultationPk;
	}

	public void setConsultationPk(ConsultationPk consultationPk) {
		this.consultationPk = consultationPk;
	}

	public String getLocationConsultation() {
		return this.locationConsultation;
	}

	public void setLocationConsultation(String locationConsultation) {
		this.locationConsultation = locationConsultation;
	}

	public String getDateConsultation() {
		return this.dateConsultation;
	}

	public void setDateConsultation(String dateConsultation) {
		this.dateConsultation = dateConsultation;
	}

	public String getDescriptionConsultation() {
		return this.descriptionConsultation;
	}

	public void setDescriptionConsultation(String descriptionConsultation) {
		this.descriptionConsultation = descriptionConsultation;
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
	@JoinColumn(name = "idShee", referencedColumnName = "idSheep", insertable = false, updatable = false)
	public Sheep getSheep() {
		return sheep;
	}

	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}

}
