package com.project.EmployeeSearch.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Employee" )
@Getter
@Setter
@ToString

public class EmployeeEntity {
	@Id
	@Column(name = "Emp_id")
	private Long id ;
	
	@Column(name = "Emp_name")
	private String name;
	@Column(name = "Emp_city")
	private String city;
	@Column(name = "Emp_designation")
	private String designation;
	
	

}
