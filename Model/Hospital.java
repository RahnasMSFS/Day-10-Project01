package lk.ac.vau.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {

	@Id
	private int HID;
	private String Name;
	private String Location;
	private String Type;
	private int NoofEmp;
	@OneToMany(mappedBy = "hospital")
	public List<Doctor> doctors;
	@OneToMany(mappedBy = "hospital")
	public List<Nurse> nurses;
	
	public Hospital()
	{}

	public Hospital(int hID, String name, String location, String type, int noofEmp, List<Doctor> doctors,
			List<Nurse> nurses) {
		super();
		HID = hID;
		Name = name;
		Location = location;
		Type = type;
		NoofEmp = noofEmp;
		this.doctors = doctors;
		this.nurses = nurses;
	}

	public int getHID() {
		return HID;
	}

	public void setHID(int hID) {
		HID = hID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public int getNoofEmp() {
		return NoofEmp;
	}

	public void setNoofEmp(int noofEmp) {
		NoofEmp = noofEmp;
	}

	public List<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}

	public List<Nurse> getNurses() {
		return nurses;
	}

	public void setNurses(List<Nurse> nurses) {
		this.nurses = nurses;
	}
}
