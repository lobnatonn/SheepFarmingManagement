package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * Entity implementation class for Entity: ConsultationPk
 * 
 */
@Embeddable
public class ConsultationPk implements Serializable {

	private int idShee;
	private int idUse;
	private static final long serialVersionUID = 1L;

	public ConsultationPk() {
		super();
	}

	public int getIdShee() {
		return this.idShee;
	}

	public void setIdShee(int idSheep) {
		this.idShee = idSheep;
	}

	public int getIdUse() {
		return this.idUse;
	}

	public void setIdUse(int idUser) {
		this.idUse = idUser;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idShee;
		result = prime * result + idUse;
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
		ConsultationPk other = (ConsultationPk) obj;
		if (idShee != other.idShee)
			return false;
		if (idUse != other.idUse)
			return false;
		return true;
	}

	public ConsultationPk(int idShee, int idUse) {
		super();
		this.idShee = idShee;
		this.idUse = idUse;
	}

}
