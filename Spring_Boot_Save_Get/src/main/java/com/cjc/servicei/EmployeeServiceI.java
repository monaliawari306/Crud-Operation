package com.cjc.servicei;

import java.util.List;


import com.cjc.model.Employee;

public interface EmployeeServiceI 
{
   public void savedata(Employee e);


   public List<Employee> getdata();


   public void deletedata(int id);


   public Employee editdata(int id);


	public void updatedata(Employee e);
}
