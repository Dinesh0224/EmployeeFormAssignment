package com.empform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empform.model.EmployeeFormDetails;

public interface EmployeeFormDetailsRepository extends JpaRepository<EmployeeFormDetails, Integer> {

}
