package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Reproduction
 * 
 */
@Entity
public class Reproduction implements Serializable {

	private int idReproduction;
	private int batchOfFemales;
	private int batchOfRams;
	private int period;
	private String dateOfIsolation;
	private static final long serialVersionUID = 1L;

	private Sheep sheep;

	public Reproduction() {
		super();
	}

	@Id
	public int getIdReproduction() {
		return this.idReproduction;
	}

	public void setIdReproduction(int idReproduction) {
		this.idReproduction = idReproduction;
	}

	public int getBatchOfFemales() {
		return this.batchOfFemales;
	}

	public void setBatchOfFemales(int batchOfFemales) {
		this.batchOfFemales = batchOfFemales;
	}

	public int getBatchOfRams() {
		return this.batchOfRams;
	}

	public void setBatchOfRams(int batchOfRams) {
		this.batchOfRams = batchOfRams;
	}

	public int getPeriod() {
		return this.period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public String getDateOfIsolation() {
		return this.dateOfIsolation;
	}

	public void setDateOfIsolation(String dateOfIsolation) {
		this.dateOfIsolation = dateOfIsolation;
	}

	@ManyToOne
	public Sheep getSheep() {
		return sheep;
	}

	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}

}
