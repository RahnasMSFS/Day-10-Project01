package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Nurse {

	@Id
	private int NID;
	private String Name;
	private int Salary;
	@ManyToOne
	@JoinColumn(name = "hos_id",referencedColumnName = "HID")
	private Hospital hospital;
	
	public Nurse()
	{}

	public Nurse(int nID, String name, int salary, Hospital hospital) {
		super();
		NID = nID;
		Name = name;
		Salary = salary;
		this.hospital = hospital;
	}

	public int getNID() {
		return NID;
	}

	public void setNID(int nID) {
		NID = nID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
}
