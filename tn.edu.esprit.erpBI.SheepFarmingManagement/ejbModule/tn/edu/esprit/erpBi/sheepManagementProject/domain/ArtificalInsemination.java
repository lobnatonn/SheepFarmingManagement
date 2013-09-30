package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: ArtificalInsemination
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ArtificalInsemination extends Reproduction implements Serializable {

	private String dateOfInsemination;
	private static final long serialVersionUID = 1L;

	public ArtificalInsemination() {
		super();
	}

	public String getDateOfInsemination() {
		return this.dateOfInsemination;
	}

	public void setDateOfInsemination(String dateOfInsemination) {
		this.dateOfInsemination = dateOfInsemination;
	}

}
