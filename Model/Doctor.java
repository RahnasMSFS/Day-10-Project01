package lk.ac.vau.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Doctor {

	@Id
	private int DID;
	private String Name;
	private String Grade;
	private int Salary;
	private int PhoneNo;
	@ManyToOne
	@JoinColumn(name = "hos_id",referencedColumnName = "HID")
	private Hospital hospital;
	
	public Doctor()
	{}

	public Doctor(int dID, String name, String grade, int salary, int phoneNo, Hospital hospital) {
		super();
		DID = dID;
		Name = name;
		Grade = grade;
		Salary = salary;
		PhoneNo = phoneNo;
		this.hospital = hospital;
	}

	public int getDID() {
		return DID;
	}

	public void setDID(int dID) {
		DID = dID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}
}
