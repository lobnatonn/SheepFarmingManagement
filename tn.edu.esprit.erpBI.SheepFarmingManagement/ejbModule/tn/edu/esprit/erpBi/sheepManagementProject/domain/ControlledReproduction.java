package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: ControlledReproduction
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ControlledReproduction extends Reproduction implements
		Serializable {

	private static final long serialVersionUID = 1L;

	public ControlledReproduction() {
		super();
	}

}
