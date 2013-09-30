package tn.edu.esprit.erpBi.sheepManagementProject.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Sheep
 * 
 */
@Entity
public class Sheep implements Serializable {

	private int idSheep;
	private String raceSheep;
	private char genderSheep;
	private String sourceSheep;
	private String dentitionSheep;
	private String obervationSheep;
	private static final long serialVersionUID = 1L;

	private User user;
	private List<InputConditions> inputConditions;
	private List<OutputConditions> outputConditions;
	private List<Loop> loops;
	private List<Reproduction> reproductions;
	private List<Consultation> consultations;

	public Sheep() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdSheep() {
		return this.idSheep;
	}

	public void setIdSheep(int idSheep) {
		this.idSheep = idSheep;
	}

	public String getRaceSheep() {
		return this.raceSheep;
	}

	public void setRaceSheep(String raceSheep) {
		this.raceSheep = raceSheep;
	}

	public char getGenderSheep() {
		return this.genderSheep;
	}

	public void setGenderSheep(char genderSheep) {
		this.genderSheep = genderSheep;
	}

	public String getSourceSheep() {
		return this.sourceSheep;
	}

	public void setSourceSheep(String sourceSheep) {
		this.sourceSheep = sourceSheep;
	}

	public String getDentitionSheep() {
		return this.dentitionSheep;
	}

	public void setDentitionSheep(String dentitionSheep) {
		this.dentitionSheep = dentitionSheep;
	}

	public String getObervationSheep() {
		return this.obervationSheep;
	}

	public void setObervationSheep(String obervationSheep) {
		this.obervationSheep = obervationSheep;
	}

	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(mappedBy = "sheep")
	public List<InputConditions> getInputConditions() {
		return inputConditions;
	}

	public void setInputConditions(List<InputConditions> inputConditions) {
		this.inputConditions = inputConditions;
	}

	@OneToMany(mappedBy = "sheep")
	public List<OutputConditions> getOutputConditions() {
		return outputConditions;
	}

	public void setOutputConditions(List<OutputConditions> outputConditions) {
		this.outputConditions = outputConditions;
	}

	@OneToMany(mappedBy = "sheep")
	public List<Loop> getLoops() {
		return loops;
	}

	public void setLoops(List<Loop> loops) {
		this.loops = loops;
	}

	@OneToMany(mappedBy = "sheep")
	public List<Reproduction> getReproductions() {
		return reproductions;
	}

	public void setReproductions(List<Reproduction> reproductions) {
		this.reproductions = reproductions;
	}

	@OneToMany(mappedBy = "sheep")
	public List<Consultation> getConsultations() {
		return consultations;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

}
