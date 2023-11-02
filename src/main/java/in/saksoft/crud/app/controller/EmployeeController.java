package in.saksoft.crud.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.saksoft.crud.app.model.Employee;
import in.saksoft.crud.app.serviceInterface.EmployeeServiceI;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceI esi;
	
	
	@PostMapping("/createEmp")
	public void createEmp(@RequestBody Employee e)
	{
		esi.createEmp(e);
	}
	
	@GetMapping("/viewEmp")
	public List<Employee> viewEmp() 
	{
		return esi.viewEmp();
	}
	
	@DeleteMapping("/deleteEmp/{id}")
	public void deleteEmp(@RequestParam int id)
	{
		esi.deleteEmp(id);
	}
	
	@PutMapping("/editEmp/{id}")
	public Employee editEmp(@RequestBody Employee e,@RequestParam int id)
	{
		e.setId(id);
		return esi.editEmp(e);	
	}
}
