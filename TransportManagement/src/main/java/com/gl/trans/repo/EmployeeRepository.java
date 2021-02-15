package com.gl.trans.repo;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gl.trans.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{
//what ellese it can do for me
	
//	List<Employee> findByEmployee();
//	List<Employee> findByCity(String city);
	List<Employee> findByEmailId(String emailId);
	Employee findFirstByEmailId(String emailId);
	Employee findFirstByEmployeeId(int Id);

}
