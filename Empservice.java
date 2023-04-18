package com.practice.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practice.crud.Repository.EmpRepository;
import com.practice.crud.entity.Emp;

@Service
public class Empservice {
	
	@Autowired
	EmpRepository empRepository;
	
	public Emp  save(Emp emp) {
		return empRepository.save(emp);
		
	}
	
	public Emp getEmp(int id)
	{
		return empRepository.findById(id).get();
		
	}
	
	public Emp update(Emp emp)
	
	{
		Emp e =empRepository.findById(emp.getEid()).get();
		e.setEname(emp.getEname());
		e.setAge(emp.getAge());
		
		return empRepository.save(e);
		
	}
	public String delete(int id) {
		empRepository.deleteById(id);
		
		return " Entity deleted"+id;
	}

	public EmpRepository getEmpRepository() {
		return empRepository;
	}

	public void setEmpRepository(EmpRepository empRepository) {
		this.empRepository = empRepository;
	}

}



