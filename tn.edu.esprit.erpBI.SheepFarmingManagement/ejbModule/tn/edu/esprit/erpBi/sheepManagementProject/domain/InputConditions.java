package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: InputConditions
 * 
 */
@Entity
public class InputConditions implements Serializable {

	private int idInputCondition;
	private String dateOfEntry;
	private float priceAtTheEntrance;
	private int ageAtTheEntrance;
	private float weightAtTheEntrance;
	private float costAtTheEntrance;
	private static final long serialVersionUID = 1L;

	private Sheep sheep;

	public InputConditions() {
		super();
	}

	@Id
	public int getIdInputCondition() {
		return this.idInputCondition;
	}

	public void setIdInputCondition(int idInputCondition) {
		this.idInputCondition = idInputCondition;
	}

	public String getDateOfEntry() {
		return this.dateOfEntry;
	}

	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry = dateOfEntry;
	}

	public float getPriceAtTheEntrance() {
		return this.priceAtTheEntrance;
	}

	public void setPriceAtTheEntrance(float priceAtTheEntrance) {
		this.priceAtTheEntrance = priceAtTheEntrance;
	}

	public int getAgeAtTheEntrance() {
		return this.ageAtTheEntrance;
	}

	public void setAgeAtTheEntrance(int ageAtTheEntrance) {
		this.ageAtTheEntrance = ageAtTheEntrance;
	}

	public float getWeightAtTheEntrance() {
		return this.weightAtTheEntrance;
	}

	public void setWeightAtTheEntrance(float weightAtTheEntrance) {
		this.weightAtTheEntrance = weightAtTheEntrance;
	}

	public float getCostAtTheEntrance() {
		return this.costAtTheEntrance;
	}

	public void setCostAtTheEntrance(float costAtTheEntrance) {
		this.costAtTheEntrance = costAtTheEntrance;
	}

	@ManyToOne
	public Sheep getSheep() {
		return sheep;
	}

	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}

}
