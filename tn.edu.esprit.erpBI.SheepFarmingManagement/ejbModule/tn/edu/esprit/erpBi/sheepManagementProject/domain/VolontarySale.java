package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Entity implementation class for Entity: VolontarySale
 * 
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class VolontarySale extends ExitWithRecipe implements Serializable {

	private String typeSale;
	private static final long serialVersionUID = 1L;

	public VolontarySale() {
		super();
	}

	public String getTypeSale() {
		return this.typeSale;
	}

	public void setTypeSale(String typeSale) {
		this.typeSale = typeSale;
	}

}
