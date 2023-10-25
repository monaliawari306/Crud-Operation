package com.cjc.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Employee;

@Repository
public interface HomeRepository extends CrudRepository<Employee, Integer>

{

	public void findAllByUsernameAndPassword(String us,String ps);
	
}
