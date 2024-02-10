package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.employee;
import com.example.demo.model.postrequestmodel;
import com.example.demo.model.postresponsemodel;
import com.example.demo.service.Employeeservice;

@RestController
@RequestMapping("/employee")
public class requestcontroller {
	@Autowired
	Employeeservice empservice;
	
	@GetMapping("/test")
	public String test() {
		return "testing done";
	}
	@PostMapping("/create")
	public postresponsemodel create(@RequestBody postrequestmodel prm) {
		return empservice.create(prm);
	}

	@GetMapping("/getall")
	public ArrayList<employee> getall(){
		return empservice.getall();
	}
	
	@PutMapping("/update/{id}")
	public postresponsemodel update(@PathVariable int id,@RequestBody postrequestmodel prm){
		return empservice.update(id,prm);
	}
	@PutMapping("/delete/{id}")
	public ArrayList<employee> delete(@PathVariable int id){
		empservice.delete(id);
		return empservice.getall();
	}
}
