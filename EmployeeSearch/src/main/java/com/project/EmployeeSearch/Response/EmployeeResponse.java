package com.project.EmployeeSearch.Response;

import java.util.List;

import com.project.EmployeeSearch.Model.EmployeeModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class EmployeeResponse {
	
	private int code;
	private String status ;
	private String message;
	private List<EmployeeModel> data;
	
	
	

}
