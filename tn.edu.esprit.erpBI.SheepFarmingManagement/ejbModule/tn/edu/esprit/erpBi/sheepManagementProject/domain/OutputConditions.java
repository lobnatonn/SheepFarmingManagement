package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: OutputConditions
 * 
 */
@Entity
public class OutputConditions implements Serializable {

	private int idOutputCondition;
	private String dateOfTheRelease;
	private float weightOutput;
	private int ageOutput;
	private float costOutput;
	private static final long serialVersionUID = 1L;

	private Sheep sheep;

	public OutputConditions() {
		super();
	}

	@Id
	public int getIdOutputCondition() {
		return this.idOutputCondition;
	}

	public void setIdOutputCondition(int idOutputCondition) {
		this.idOutputCondition = idOutputCondition;
	}

	public String getDateOfTheRelease() {
		return this.dateOfTheRelease;
	}

	public void setDateOfTheRelease(String dateOfTheRelease) {
		this.dateOfTheRelease = dateOfTheRelease;
	}

	public float getWeightOutput() {
		return this.weightOutput;
	}

	public void setWeightOutput(float weightOutput) {
		this.weightOutput = weightOutput;
	}

	public int getAgeOutput() {
		return this.ageOutput;
	}

	public void setAgeOutput(int ageOutput) {
		this.ageOutput = ageOutput;
	}

	public float getCostOutput() {
		return this.costOutput;
	}

	public void setCostOutput(float costOutput) {
		this.costOutput = costOutput;
	}

	@ManyToOne
	public Sheep getSheep() {
		return sheep;
	}

	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}

}
