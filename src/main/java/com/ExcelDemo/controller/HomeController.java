package com.ExcelDemo.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ExcelDemo.dto.Address;
import com.ExcelDemo.dto.EmployeeDetails;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
//import com.ExcelDemo.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@RequestMapping("/excel")
@RequiredArgsConstructor
@Log4j2
public class HomeController {
	
//	@Autowired
//	private final EmployeeService employeeService;
//	
//	
//	@GetMapping(value="/get", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE} )
//	public Object getData()
//	{
//	
//		log.info("-----------------------> employee excel start <-----------------------");
//	try {
//		Object list = this.employeeService.get();
//		//Map<String,Integer> map=new HashMap<>();
//		//map.put("amount",list);
//		MultiValueMap<String,Object> m=new LinkedMultiValueMap<>();
//		m.add("response", list);
//		m.add("Date", new Date().toString());
//		System.out.println(m);
//		return m;
//	}
//		catch(Exception e)
//		{
//			throw new NullPointerException();
//		}
//	   finally {
//		   log.info("----------------------> employee excel end <----------------------------");
//	   }	
//	
//	}
//	
//	@GetMapping(value="/success", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE} )
//	public Object getData1()
//	{
//	
//		log.info("-----------------------> employee success start <-----------------------");
//	try {
//		int list1 = this.employeeService.get1();
//
//		Map<String,Integer> map=new HashMap<>();
//		map.put("amount",list1);
//		return map;
//	}
//		catch(Exception e)
//		{
//			throw new NullPointerException();
//		}
//	   finally {
//		   log.info("----------------------> employee success end <----------------------------");
//	   }	
//	
//	}
//	@GetMapping(value="/fail", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE} )
//	public Object getData2()
//	{
//	
//		log.info("-----------------------> employee fail start <-----------------------");
//	try {
//		int list1 = this.employeeService.get2();
//		
//		Map<String,Integer> map=new HashMap<>();
//		map.put("amount",list1);
//		return map;
//	}
//		catch(Exception e)
//		{
//			throw new NullPointerException();
//		}
//	   finally {
//		   log.info("----------------------> employee fail end <----------------------------");
//	   }	
//	
//	}
	@PostMapping(value="/post", consumes = {MediaType.APPLICATION_JSON_UTF8_VALUE}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE} )
	public Object Post(@RequestBody EmployeeDetails emp) throws IOException
	{
		System.out.println(emp);
	          String sr = emp.getEmployees().get(0).getSr();
	          System.out.println(sr);
		//String string = emp.toString();
		
//		ObjectMapper mapper=new ObjectMapper();
//		JsonNode readTree = mapper.readTree((JsonParser) emp);
//	//	EmployeeDetails readValue = mapper.readValue(string,EmployeeDetails.class);
//		System.out.println(readTree);
		
		 return new ResponseEntity<Object>(emp, null, HttpStatus.OK);
	}
	

}
