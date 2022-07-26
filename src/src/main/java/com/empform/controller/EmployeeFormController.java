package com.empform.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.empform.model.EmployeeFormDetails;
import com.empform.service.EmployeeFormDetailsService;



@Controller
public class EmployeeFormController {
	
	@Autowired
	EmployeeFormDetailsService disputeCustomerDetailsService;
	

	
	@RequestMapping(value = "addDisputeDetails", method = RequestMethod.POST )
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public ModelAndView addDisputeCustomerDetails(EmployeeFormDetails disputeCustomerDetails) {
		ModelAndView modelAndView = new ModelAndView("disputeSuccess");
		EmployeeFormDetails addedDisputeCustomerDetails = disputeCustomerDetailsService.createDisputeCustomerDetails(disputeCustomerDetails);
		modelAndView.addObject("disputeCustomerDetails", addedDisputeCustomerDetails);
		return modelAndView;
	}
}
