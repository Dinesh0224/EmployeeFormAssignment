package com.empform.service;

import java.util.List;

import com.empform.model.EmployeeFormDetails;

public interface EmployeeFormDetailsService {

	EmployeeFormDetails createDisputeCustomerDetails(EmployeeFormDetails disputeCustomerDetails);
	EmployeeFormDetails findDisputeCustomerDetailsById(int disputeId);
	List<EmployeeFormDetails> findAllDisputeCustomerDetails();
	EmployeeFormDetails updateDisputeCustomerDetails(EmployeeFormDetails disputeCustomerDetails);
	void deleteDisputeCustomerDetails(int disputeId);
}
