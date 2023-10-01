package com.khadri.spring.rest.controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khadri.spring.rest.entity.Student;

@RestController
public class TestRestController {

	@PostMapping(value = "/content/student/create", consumes = { MediaType.APPLICATION_XML_VALUE }, produces = {
			MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<Student> createStudent(Integer id, String name, String address) {
		return ResponseEntity.ok(Student.builder().withId(id).withName(name).withAddress(address).build());
	}

}
