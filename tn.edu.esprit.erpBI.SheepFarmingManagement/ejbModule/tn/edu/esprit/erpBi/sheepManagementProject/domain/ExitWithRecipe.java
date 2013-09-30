package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: ExitWithRecipe
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ExitWithRecipe extends OutputConditions implements Serializable {

	private static final long serialVersionUID = 1L;

	public ExitWithRecipe() {
		super();
	}

}
