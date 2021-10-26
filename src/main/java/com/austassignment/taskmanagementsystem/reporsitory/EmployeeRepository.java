package com.austassignment.taskmanagementsystem.reporsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import com.austassignment.taskmanagementsystem.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	@Nullable
	Employee findByFullname(String name);
}
