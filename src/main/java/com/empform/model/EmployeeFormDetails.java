package com.empform.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_form_details")
public class EmployeeFormDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int disputeId;
	
	private String employeeName;
	private String employeeID;
	private String placeName;
	private int age;
	public EmployeeFormDetails()
	{
		
	}
	
	public EmployeeFormDetails(int disputeId, String employeeName, String employeeID, String placeName) 
	{
		super();
		this.disputeId = disputeId;
		this.employeeName = employeeName;
		this.employeeID = employeeID;
		this.placeName = placeName;
	}
	
	public  int getDisputeId() {
		return disputeId;
	}
	public void setDisputeId(int disputeId) {
		this.disputeId = disputeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	public String getPlaceName() {
		return placeName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}



}
