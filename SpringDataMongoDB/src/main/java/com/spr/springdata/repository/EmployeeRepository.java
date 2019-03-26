package com.spr.springdata.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.spr.springdata.model.Employee;


public interface EmployeeRepository extends MongoRepository<Employee, Long> {

	Employee findByEmpNo(String empNo);

	List<Employee> findByFullNameLike(String fullName);

	List<Employee> findByHireDateGreaterThan(Date hireDate);

	// Supports native JSON query string
	@Query("{fullName:'?0'}")
	List<Employee> findCustomByFullName(String fullName);
	
	

}
