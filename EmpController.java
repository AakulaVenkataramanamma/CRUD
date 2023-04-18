package com.practice.crud.controller.copy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.crud.entity.Emp;
import com.practice.crud.service.Empservice;

@RestController
@RequestMapping("/employees")
  
 public class EmpController {
	
	@Autowired
	private  Empservice empservice;
	
	
	@PostMapping() 
	public Emp addEmp(@RequestBody Emp emp)
	{
		return empservice.save(emp);
		
	}
	
	@GetMapping(path ="/{id}")
	public Emp getEmp(@PathVariable int id)
	{
		return empservice.getEmp(id);
		
	}
	
	@PutMapping()
	public Emp updateEmp(@RequestBody Emp emp)
	{
		return empservice.update(emp);
		
	}
	@DeleteMapping(path ="/{id}")
	public String deleteEmp(@PathVariable int id)
	{
		return empservice.delete(id);
		
	}


	public Empservice getEmpservice() {
		return empservice;
	}

	public void setEmpservice(Empservice empservice) {
		this.empservice = empservice;
	}	

}

