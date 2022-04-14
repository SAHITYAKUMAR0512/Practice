package com.ExcelDemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import com.ExcelDemo.dto.Employees;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class EmployeesService {
	  
	static List<Employees> emp=new ArrayList<>();
	{
		Employees e1=new Employees();
		e1.setSr(1);
		e1.setName("ram");
		e1.setDate("12-04-2022");
		e1.setAmount(99);
		e1.setStatus("sucess");
		
		Employees e2=new Employees();
		e2.setSr(2);
		e2.setName("ram2");
		e2.setDate("12-04-2022");
		e2.setAmount(10);
		e2.setStatus("fail");
		
		Employees e3=new Employees();
		e3.setSr(3);
		e3.setName("ram3");
		e3.setDate("12-04-2022");
		e3.setAmount(90);
		e3.setStatus("fail");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		
		
	}
	
	
	public Object get()
	{
		List<Long> collect = emp.stream().map(s-> s.getAmount()).collect(Collectors.toList());
		log.info("amount {}", collect);
		int sum=0;
		int size = collect.size();
		   for(int i=0; i<size;i++)
		   {
			   sum +=collect.get(i);
		   }
		    System.out.println(sum);
		    MultiValueMap<String,Object> m=new LinkedMultiValueMap<>();
			m.add("Total emp", emp);
			m.add("total amount", sum);
		 return m;
		
	}
	 public int get1()
	 {
		 
		 List<Employees> collect = emp.stream().filter(s->s.getStatus().equalsIgnoreCase("sucess")).collect(Collectors.toList());
		List<Long> collect2 = collect.stream().map(s->s.getAmount()).collect(Collectors.toList());
		log.info("Amount {}", collect2);
		int sum=0;
		int size = collect2.size();
		   for(int i=0; i<size;i++)
		   {
			   sum +=collect2.get(i);
		   }
		    System.out.println(sum);
		   
		 return sum;
	 }
	 public int get2()
	 {
		 
		 List<Employees> collect = emp.stream().filter(s->s.getStatus().equalsIgnoreCase("fail")).collect(Collectors.toList());
		 List<Long> collect2 = collect.stream().map(s->s.getAmount()).collect(Collectors.toList());
			System.out.println(collect2);
			log.info("Amount {}", collect2);
			int sum=0;
			int size = collect2.size();
			   for(int i=0; i<size;i++)
			   {
				   sum +=collect2.get(i);
			   }
			    System.out.println(sum);
			   
		 return sum;
	 }


	

}
