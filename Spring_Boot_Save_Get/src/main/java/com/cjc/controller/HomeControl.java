package com.cjc.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cjc.model.Employee;
import com.cjc.servicei.EmployeeServiceI;

@Controller
public class HomeControl 
{
	
	@Autowired
	EmployeeServiceI si;
	
	@RequestMapping ("/")
   public String prelogin()
   {
	   return "login";
   }
	@RequestMapping ("/create")
	public String register()
	{
		return "RegisterForm";
	}
	
	@RequestMapping("/save")
	public String savedata(@ModelAttribute Employee e)
	{
		si.savedata(e);

		return "login";
	}
	
	@RequestMapping("/get")
	public String getdata(Model m)
	{
		List<Employee> list = si.getdata();
		m.addAttribute("l", list);
		return "success";
	}
	
	@RequestMapping("/delete")
	public String deletedata(@RequestParam int id)
	{
		si.deletedata(id);
		
		return "login";
	}
	
	@RequestMapping("/edit")
	public String editdata(@RequestParam int id, Model m)
	{
		
		Employee e=si.editdata(id);
		
		m.addAttribute("e", e);
		
		return "edit";
	}
	
	@RequestMapping("/update")
	public String updatedata(@ModelAttribute Employee e)
	{
		
		si.updatedata(e);
		
		return "login";
	}
	
	
}
