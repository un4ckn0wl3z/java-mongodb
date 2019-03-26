package com.spr.springdata.repository;

import java.util.Date;

import org.springframework.stereotype.Repository;



public interface EmployeeRepositoryCustom {
	 
    public long getMaxEmpId();
     
    public long updateEmployee(String empNo, String fullName, Date hireDate);
     
}