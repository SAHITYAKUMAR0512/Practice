package com.ExcelDemo.dto;

import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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
@JsonPropertyOrder
public class Employees implements Serializable {

	@JsonProperty(value="sr")
	private String sr;
	@JsonProperty(value="name")
	private String name;
	@JsonProperty(value="amount")
	private String amount;
	@JsonProperty(value="status")
	private String status;
	@JsonProperty(value="date")
	private String date;
	
}
