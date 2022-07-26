package com.empform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empform.model.EmployeeFormDetails;
import com.empform.repository.EmployeeFormDetailsRepository;

@Service
public class EmployeeFormDetailsServiceImpl implements EmployeeFormDetailsService {
	
	@Autowired
	EmployeeFormDetailsRepository employeeRegDetailsRepo;

	@Override
	public EmployeeFormDetails createEmployeeDetails(EmployeeFormDetails employeeRegDetails) {
		return employeeRegDetailsRepo.save(employeeRegDetails);
	}

	@Override
	public EmployeeFormDetails findEmployeeDetailsById(int disputeId) {
		return employeeRegDetailsRepo.findById(disputeId).orElse(null);
	}

	@Override
	public List<EmployeeFormDetails> findAllEmployeeDetails() {
		return employeeRegDetailsRepo.findAll();
	}

	@Override
	public EmployeeFormDetails updateEmployeeDetails(EmployeeFormDetails employeeRegDetails) {
		EmployeeFormDetails updatedDisputeCustomerDetails=  null;
		int disputeCustomerId = employeeRegDetails.getDisputeId();
	
		EmployeeFormDetails employeeRegDetailsToBeUpdated = employeeRegDetailsRepo.findById(disputeCustomerId).orElse(null);
		if(employeeRegDetailsToBeUpdated != null) {
			updatedDisputeCustomerDetails = employeeRegDetailsRepo.save(employeeRegDetails);
		}

		return updatedDisputeCustomerDetails;
	}

	@Override
	public void deleteEmployeeDetails(int disputeId) {
		EmployeeFormDetails employeeRegDetailsToBeDeleted = employeeRegDetailsRepo.findById(disputeId).orElse(null);
		if(employeeRegDetailsToBeDeleted != null) {
			employeeRegDetailsRepo.deleteById(disputeId);
		}
		
	}

}
