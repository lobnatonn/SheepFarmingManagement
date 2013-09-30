package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: saleForReform
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class saleForReform extends ExitWithRecipe implements Serializable {

	private int ageSheepReform;
	private static final long serialVersionUID = 1L;

	public saleForReform() {
		super();
	}

	public int getAgeSheepReform() {
		return this.ageSheepReform;
	}

	public void setAgeSheepReform(int ageSheepReform) {
		this.ageSheepReform = ageSheepReform;
	}

}
