package mypackage.sts.controller;


import java.util.List;

import org.springframework.ui.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import mypackage.sts.entity.entity;
import mypackage.sts.service.service;


@Controller

public class controller {
	@Autowired
	public service ser;
	
	@GetMapping("/")
	public String home(Model m)
	{
		List<entity>emp=ser.getAllEmp();
		m.addAttribute("emp",emp);
		return "index";
	}
	  
	@GetMapping("/add_todo")
	public String addtodo()
	{
		return "add_todo";
	}
	
	@PostMapping("/register")
	public String empRegister(@ModelAttribute entity e) {
		System.out.println(e);
		ser.addtodoo(e);
		return "redirect:/";
	}
	 
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable int id,Model m)
	{
		entity e=ser.getMPBuId(id);
		m.addAttribute("emp",e);
		return "edit";
	}
	
	@PostMapping("/update")
	public String updatetodo(@ModelAttribute entity e)
	{
		 ser.addtodoo(e);
		 return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String deleteString(@PathVariable int id)
	{
		ser.deletetodo(id);
		return "redirect:/";
	}
	
}
