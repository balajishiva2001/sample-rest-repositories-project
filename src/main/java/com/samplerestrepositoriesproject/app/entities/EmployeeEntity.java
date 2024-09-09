package com.samplerestrepositoriesproject.app.entities;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	
	private String empName;
	
	private String empRole;
	
	private String[] empSkills;

	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeEntity(int empId, String empName, String empRole, String[] empSkills) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.empSkills = empSkills;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public String[] getEmpSkills() {
		return empSkills;
	}

	public void setEmpSkills(String[] empSkills) {
		this.empSkills = empSkills;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", empSkills="
				+ Arrays.toString(empSkills) + "]";
	}
	
	
}
