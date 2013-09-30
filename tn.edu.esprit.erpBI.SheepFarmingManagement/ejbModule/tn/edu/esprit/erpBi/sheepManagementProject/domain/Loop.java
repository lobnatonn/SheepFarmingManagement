package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Loop
 * 
 */
@Entity
@Table(name="T_LOOP")
public class Loop implements Serializable {

	private int numLoop;
	private int NoOfLoopRightEar;
	private String dateOfTheRightEarring;
	private int NumberOfEarringsRight;
	private int NoOfLoopLeftEar;
	private String dateOfTheLeftEarring;
	private int NumberOfEarringsLeft;
	private static final long serialVersionUID = 1L;

	private Sheep sheep;

	public Loop() {
		super();
	}

	@Id
	public int getNumLoop() {
		return this.numLoop;
	}

	public void setNumLoop(int numLoop) {
		this.numLoop = numLoop;
	}

	public int getNoOfLoopRightEar() {
		return this.NoOfLoopRightEar;
	}

	public void setNoOfLoopRightEar(int NoOfLoopRightEar) {
		this.NoOfLoopRightEar = NoOfLoopRightEar;
	}

	public String getDateOfTheRightEarring() {
		return this.dateOfTheRightEarring;
	}

	public void setDateOfTheRightEarring(String dateOfTheRightEarring) {
		this.dateOfTheRightEarring = dateOfTheRightEarring;
	}

	public int getNumberOfEarringsRight() {
		return this.NumberOfEarringsRight;
	}

	public void setNumberOfEarringsRight(int NumberOfEarringsRight) {
		this.NumberOfEarringsRight = NumberOfEarringsRight;
	}

	public int getNoOfLoopLeftEar() {
		return this.NoOfLoopLeftEar;
	}

	public void setNoOfLoopLeftEar(int NoOfLoopLeftEar) {
		this.NoOfLoopLeftEar = NoOfLoopLeftEar;
	}

	public String getDateOfTheLeftEarring() {
		return this.dateOfTheLeftEarring;
	}

	public void setDateOfTheLeftEarring(String dateOfTheLeftEarring) {
		this.dateOfTheLeftEarring = dateOfTheLeftEarring;
	}

	public int getNumberOfEarringsLeft() {
		return this.NumberOfEarringsLeft;
	}

	public void setNumberOfEarringsLeft(int NumberOfEarringsLeft) {
		this.NumberOfEarringsLeft = NumberOfEarringsLeft;
	}

	@ManyToOne
	public Sheep getSheep() {
		return sheep;
	}

	public void setSheep(Sheep sheep) {
		this.sheep = sheep;
	}

}
