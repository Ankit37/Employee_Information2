package com.example.Employee_information2.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Employee_information2.entity.EmployeeInformation;

@RestController
public class EmployeeInformation2Controller {

	@GetMapping("/employeeinformation/alluser/from/{from}/to/{to}")
	public EmployeeInformation getallUser(@PathVariable String from, @PathVariable String to) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("from", from);
		map.put("to", to);
		ResponseEntity<EmployeeInformation> responseEntity = new RestTemplate()
				.getForEntity("http://localhost:5000/from/{from}/to/{to}", EmployeeInformation.class, map);

		EmployeeInformation responseBody = responseEntity.getBody();

		responseBody.setAge(23);

		EmployeeInformation employeeInformation = new EmployeeInformation(23, responseBody.getName(),
				responseBody.getStatus(), from, to, responseBody.getAge());
		return employeeInformation;
	}

	@GetMapping("/employeeinformation/alluser/user/{id}")
	public EmployeeInformation getUserById(@PathVariable int id) {
		int URIid = id;
		ResponseEntity<EmployeeInformation> responseEntity = new RestTemplate()
				.getForEntity("http://localhost:5000/id/{id}", EmployeeInformation.class, URIid);

		EmployeeInformation body = responseEntity.getBody();
		body.setAge(23);
		EmployeeInformation employeeInformation = new EmployeeInformation(id, body.getName(), body.getStatus(),
				body.getFrom(), body.getTo(), body.getAge());

		return employeeInformation;
	}
	
	
	//Reutrning only name
	@GetMapping("/employeeinformation/alluser/user/name/{id}")
	public String getUserByName(@PathVariable int id) {
		int URIid = id;
		ResponseEntity<EmployeeInformation> responseEntity = new RestTemplate()
				.getForEntity("http://localhost:5000/id/{id}", EmployeeInformation.class, URIid);

		EmployeeInformation body = responseEntity.getBody();
		body.setAge(23);
		EmployeeInformation employeeInformation = new EmployeeInformation(body.getName());

		return body.getName();
	}

}
