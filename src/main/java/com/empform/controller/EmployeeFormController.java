package com.empform.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.empform.model.EmployeeFormDetails;
import com.empform.service.EmployeeFormDetailsService;

@Controller
public class EmployeeFormController {

	@Autowired
	EmployeeFormDetailsService empRegistrationDetailsService;

	@RequestMapping(value = "addEmployeeDetails", method = RequestMethod.POST)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	public ModelAndView addDisputeCustomerDetails(EmployeeFormDetails employeeRegDetails) throws IOException {
		ModelAndView modelAndView = new ModelAndView("employeeSuccess");
		EmployeeFormDetails addedDisputeCustomerDetails = empRegistrationDetailsService
				.createEmployeeDetails(employeeRegDetails);
		modelAndView.addObject("employeeRegDetails", addedDisputeCustomerDetails);
		ArrayList<EmployeeFormDetails> list = new ArrayList<EmployeeFormDetails>();
		list = (ArrayList<EmployeeFormDetails>) empRegistrationDetailsService.findAllEmployeeDetails();
		File file = new File("C:\\Users\\dineshv\\eclipse-workspace\\Employee_Form\\Employee Report.csv");
		BufferedWriter w = new BufferedWriter(new FileWriter(file));
		w.write("Emp_Name,Emp_ID,Age,Place_Name");
		w.newLine();

		for (EmployeeFormDetails empreport : list) {
			w.write(empreport.getEmployeeName() + "," + empreport.getEmployeeID() + "," + empreport.getAge() + ","
		+ empreport.getPlaceName()
					+ ",");
			w.newLine();
		}
		w.close();
		System.out.println("The Employee Report is generated.......!\n");
		return modelAndView;
	}
}
