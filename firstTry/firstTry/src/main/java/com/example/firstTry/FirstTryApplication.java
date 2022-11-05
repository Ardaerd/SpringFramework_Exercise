package com.example.firstTry;

import com.example.firstTry.Student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class FirstTryApplication {

  	public static void main(String[] args) {
		SpringApplication.run(FirstTryApplication.class, args);
	}



}
