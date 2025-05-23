package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import javax.xml.stream.events.StartDocument;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public List<Student> hello() {
		return List.of(
			new Student(
				1L,
				"Nam",
				LocalDate.of(2001, 4, 14),
				"nam@gmail.com",
				21
			)
		);
	}
}
