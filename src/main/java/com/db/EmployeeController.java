package com.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@PostMapping(value="/postEmp")
	public String post(@RequestBody Employee e) {
		return es.post(e);
	}
	
	@PostMapping(value="/postEmpList")
	public String postList(@RequestBody List<Employee> list) {
		return es.postList(list);
	}
	
	@GetMapping(value="/getEmp")
	public List<Employee> getAllEmps(){
		return es.getAllEmps();
	}
	
	@GetMapping(value="/getByID/{id}")
	public Employee getByID(@PathVariable int id) {
		return es.getByID(id);
	}
	
	@PutMapping(value="/updateName")
	public String put(@RequestBody Employee e) {
		return es.put(e);
	}
	
	@PatchMapping(value="/patchUpdate/{id}")
	public String patchUpdate(@PathVariable int id,@RequestBody Employee e) {
		return es.patchUpdate(id,e);
	}
	
	@DeleteMapping(value="/delete/{id}")
	public String deleteById1(@PathVariable int id) {
		return es.deleteById1(id);
	}
	
	
}
