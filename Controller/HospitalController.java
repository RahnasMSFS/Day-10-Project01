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

import lk.ac.vau.Model.Hospital;
import lk.ac.vau.Repo.HospitalRepo;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

	@Autowired
	HospitalRepo context;
	
	@GetMapping
	public List<Hospital> getAll()
	{
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Hospital get(@PathVariable("id") int HID)
	{
		return context.findById(HID).get();
	}
	
	@PostMapping
	public void add(@RequestBody Hospital hospital)
	{
		context.save(hospital);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer HId)
	{
		context.deleteById(HId);
	}
}
