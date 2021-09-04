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

import lk.ac.vau.Model.Nurse;
import lk.ac.vau.Repo.NurseRepo;

@RestController
@RequestMapping("/nurse")
public class NurseController {

	@Autowired
	NurseRepo context;
	
	@GetMapping
	public List<Nurse> getAll()
	{
		return context.findAll();
	}
	
	@GetMapping("/{id}")
	public Nurse get(@PathVariable("id") Integer NID)
	{
		return context.findById(NID).get();
	}
	
	
	@PostMapping
	public void add(@RequestBody Nurse nurse)
	{
		context.save(nurse);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Integer NID)
	{
		context.deleteById(NID);
	}
	
	
}
