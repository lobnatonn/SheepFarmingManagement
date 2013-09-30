package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * Entity implementation class for Entity: VisibilityPK
 * 
 */
@Embeddable
public class VisibilityPK implements Serializable {

	private int idUse;
	private int idPubli;
	private static final long serialVersionUID = 1L;

	public VisibilityPK() {
		super();
	}
	
	public int getIdUse() {
		return idUse;
	}

	public void setIdUse(int idUse) {
		this.idUse = idUse;
	}

	public int getIdPubli() {
		return idPubli;
	}

	public void setIdPubli(int idPubli) {
		this.idPubli = idPubli;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idUse;
		result = prime * result + idPubli;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VisibilityPK other = (VisibilityPK) obj;
		if (idUse != other.idUse)
			return false;
		if (idPubli != other.idPubli)
			return false;
		return true;
	}

	public VisibilityPK(int idUser, int idPublication) {
		super();
		this.idUse = idUser;
		this.idPubli = idPublication;
	}

	

}
