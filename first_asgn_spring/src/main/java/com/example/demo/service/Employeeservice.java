package com.example.demo.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.demo.entity.employee;
import com.example.demo.model.postrequestmodel;
import com.example.demo.model.postresponsemodel;

@Service
public class Employeeservice {
	
	HashMap<Integer,employee> hm;
	public postresponsemodel create(postrequestmodel req) {
		if(hm==null)
			hm=new HashMap<>();
		
		int id=randgen();
		employee emp=new employee(req.getName(),req.getDept());
		emp.setId(id);
		hm.put(id, emp);
		postresponsemodel prm=new postresponsemodel(emp.getId(),emp.getName(),emp.getDept());
		return prm;
	}
	
	public ArrayList<employee> getall(){
		ArrayList<employee> list = new ArrayList<>();
		if(hm == null) {
			System.out.println("HashMap is not created yet.");
		} 
	for(Map.Entry<Integer,employee> mp:hm.entrySet())
		list.add(mp.getValue());
		return list;
	}
	
	public int randgen() {
		int min =1, max = 10000;
	    return (int) ((Math.random() * (max - min)) + min);

	}

	public postresponsemodel update(int id, postrequestmodel prm) {
		if(!hm.containsKey(id)) {
			System.out.print("the employee was not present");
		return null;
		}
		employee emp=new employee(prm.getName(),prm.getDept());
		emp.setId(id);
		hm.put(id, emp);
		postresponsemodel res=new postresponsemodel(emp.getId(),emp.getName(),emp.getDept());
		return res;
	}

	public void delete(int id) {
		hm.remove(id);
		System.out.print(id +" was successfully deleted");
	}
}
