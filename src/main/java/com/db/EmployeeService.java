package com.db;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao ed;

	public String post(Employee e) {
		return ed.post(e);
	}

	public String postList(List<Employee> list) {
		return ed.postList(list);
	}

	public List<Employee> getAllEmps() {
		return ed.getAllEmps();
	}

	public Employee getByID(int id) {
		return ed.getByID(id);
	}

	public String put(Employee e) {
		return ed.put(e);
	}

	public String deleteById1(int id) {
		return ed.deleteById1(id);
	}
	
	public String patchUpdate(int id, Employee e) {
		return ed.patchUpdate(id,e);
	}
}
