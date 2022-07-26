package com.empform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empform.model.EmployeeFormDetails;
import com.empform.repository.EmployeeFormDetailsRepository;

@Service
public class EmployeeFormDetailsServiceImpl implements EmployeeFormDetailsService {
	
	@Autowired
	EmployeeFormDetailsRepository disputeCustomerDetailsRepo;

	@Override
	public EmployeeFormDetails createDisputeCustomerDetails(EmployeeFormDetails disputeCustomerDetails) {
		return disputeCustomerDetailsRepo.save(disputeCustomerDetails);
	}

	@Override
	public EmployeeFormDetails findDisputeCustomerDetailsById(int disputeId) {
		return disputeCustomerDetailsRepo.findById(disputeId).orElse(null);
	}

	@Override
	public List<EmployeeFormDetails> findAllDisputeCustomerDetails() {
		return disputeCustomerDetailsRepo.findAll();
	}

	@Override
	public EmployeeFormDetails updateDisputeCustomerDetails(EmployeeFormDetails disputeCustomerDetails) {
		EmployeeFormDetails updatedDisputeCustomerDetails=  null;
		int disputeCustomerId = disputeCustomerDetails.getDisputeId();
		EmployeeFormDetails disputeCustomerDetailsToBeUpdated = disputeCustomerDetailsRepo.findById(disputeCustomerId).orElse(null);
		if(disputeCustomerDetailsToBeUpdated != null) {
			updatedDisputeCustomerDetails = disputeCustomerDetailsRepo.save(disputeCustomerDetails);
		}

		return updatedDisputeCustomerDetails;
	}

	@Override
	public void deleteDisputeCustomerDetails(int disputeId) {
		EmployeeFormDetails disputeCustomerDetailsToBeDeleted = disputeCustomerDetailsRepo.findById(disputeId).orElse(null);
		if(disputeCustomerDetailsToBeDeleted != null) {
			disputeCustomerDetailsRepo.deleteById(disputeId);
		}
		
	}

}
