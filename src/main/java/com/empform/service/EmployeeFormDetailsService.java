package com.empform.service;

import java.util.List;

import com.empform.model.EmployeeFormDetails;

public interface EmployeeFormDetailsService {

	EmployeeFormDetails createEmployeeDetails(EmployeeFormDetails employeeRegDetails);
	EmployeeFormDetails findEmployeeDetailsById(int disputeId);
	List<EmployeeFormDetails> findAllEmployeeDetails();
	EmployeeFormDetails updateEmployeeDetails(EmployeeFormDetails employeeRegDetails);
	void deleteEmployeeDetails(int disputeId);
}
