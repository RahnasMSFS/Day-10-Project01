package lk.ac.vau.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Doctor;
import lk.ac.vau.Repo.DoctorRepo;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	DoctorRepo context;
	
	@GetMapping
	public List<Doctor> getAll()
	{
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Doctor get(@PathVariable("id") int DID)
	{
		return context.findById(DID).get();
	}
	
	@PostMapping
	public void add(@RequestBody Doctor doctor)
	{
		context.save(doctor);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer DId)
	{
		context.deleteById(DId);
	}
}
