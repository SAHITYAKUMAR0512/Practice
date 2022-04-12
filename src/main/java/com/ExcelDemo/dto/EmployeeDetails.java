package com.ExcelDemo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONPropertyName;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@RequiredArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class EmployeeDetails implements Serializable {
	
	
	     private int id;
	     @JsonProperty(value="Address")
	     private Address address;
	     @JsonProperty(value="Employees")
         public  List<Employees> employees=new ArrayList<>();
	    
         
        

}
