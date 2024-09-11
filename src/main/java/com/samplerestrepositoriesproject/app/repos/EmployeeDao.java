package com.samplerestrepositoriesproject.app.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.samplerestrepositoriesproject.app.entities.EmployeeEntity;

@RepositoryRestResource(path = "employees")
public interface EmployeeDao extends JpaRepository<EmployeeEntity, Integer> {
	@RestResource(path = "byUserName")
	EmployeeEntity findByEmpName(@Param("empName") String empName);
}
