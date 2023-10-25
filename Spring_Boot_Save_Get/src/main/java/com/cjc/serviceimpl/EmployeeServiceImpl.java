package com.cjc.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Employee;
import com.cjc.repo.HomeRepository;
import com.cjc.servicei.EmployeeServiceI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI
{
	@Autowired
	HomeRepository hr;

	@Override
	public void savedata(Employee e) 
	{
		hr.save(e);
	}

	@Override
	public List<Employee> getdata()
	{
		List<Employee> list = (List<Employee>)hr.findAll();
		
		return list;
	}

	@Override
	public void deletedata(int id)
	{
		hr.deleteById(id);
	}

	@Override
	public Employee editdata(int id)
	{
		Optional<Employee> e = hr.findById(id);
		
		return e.get();
	}

	@Override
	public void updatedata(Employee e)
	{
		hr.save(e);
	}

  
}
