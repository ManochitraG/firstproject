package com.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;

	public String post(Employee e) {
		er.save(e);
		return "Posted Successfully";
	}

	public String postList(List<Employee> list) {
		er.saveAll(list);
		return "List Posted Successfully";
	}

	public List<Employee> getAllEmps() {		
		return er.findAll();
	}

	public Employee getByID(int id) {
		return er.findById(id).get();
	}

	public String put(Employee e) {
		er.save(e);
		return "Updated Successfully";
	}

	public String deleteById1(int id) {
		er.deleteById(id);
		return "Deleted Successfully";
	}

	public String patchUpdate(int id, Employee e) {
		Employee existingEmp = er.findById(id).get();
		System.out.println(existingEmp.getName()+" "+existingEmp.getAge());
		if(e.getName()!=null) {
			existingEmp.setName(e.getName());
		}
		if(e.getAge()!= 0) {
			existingEmp.setAge(e.getAge());
		}
		System.out.println(existingEmp.getName()+" "+existingEmp.getAge());
		er.save(existingEmp);
		return "Patch Successful";
	}
}
