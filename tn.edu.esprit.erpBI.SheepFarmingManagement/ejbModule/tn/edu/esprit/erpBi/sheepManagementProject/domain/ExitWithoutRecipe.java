package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: ExitWithoutRecipe
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ExitWithoutRecipe extends OutputConditions implements Serializable {

	private String natureExit;
	private static final long serialVersionUID = 1L;

	public ExitWithoutRecipe() {
		super();
	}

	public String getNatureExit() {
		return this.natureExit;
	}

	public void setNatureExit(String natureExit) {
		this.natureExit = natureExit;
	}

}
