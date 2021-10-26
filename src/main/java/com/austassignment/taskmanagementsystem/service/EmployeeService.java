package com.austassignment.taskmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.austassignment.taskmanagementsystem.reporsitory.EmployeeRepository;
import com.austassignment.taskmanagementsystem.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee save(Employee employee) {
 
	    if (employee.getId()!= null ) {
			throw new EntityExistsException("There is already existing entity with such ID in the database.");
		}
		return employeeRepository.save(employee);
	}

	public Employee update(Employee employee) {
		
	   if (employee.getId()!= null)
	            {
			throw new EntityNotFoundException("There is no entity with such ID in the database.");
		}
	
		return employeeRepository.save(employee);
	}
	
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> findOne(Long id) {
		return employeeRepository.findById(id);
	}
	
	public void delete(Long id) {
		employeeRepository.deleteById(id);
	}

}
