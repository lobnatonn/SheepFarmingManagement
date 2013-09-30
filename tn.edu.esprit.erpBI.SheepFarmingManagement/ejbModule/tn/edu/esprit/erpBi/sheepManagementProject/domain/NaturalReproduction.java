package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: NaturalReproduction
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class NaturalReproduction extends Reproduction implements Serializable {

	private String dateOfWithdrawalRams;
	private static final long serialVersionUID = 1L;

	public NaturalReproduction() {
		super();
	}

	public String getDateOfWithdrawalRams() {
		return this.dateOfWithdrawalRams;
	}

	public void setDateOfWithdrawalRams(String dateOfWithdrawalRams) {
		this.dateOfWithdrawalRams = dateOfWithdrawalRams;
	}

}
