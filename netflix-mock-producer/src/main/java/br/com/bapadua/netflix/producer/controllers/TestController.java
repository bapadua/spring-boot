package br.com.bapadua.netflix.producer.controllers;

import br.com.bapadua.netflix.producer.entity.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("netflix")
public class TestController {

    @GetMapping("test")
    public ResponseEntity<Employee> firstPage() {
        final Employee employee = Employee.builder()
                .designation("dev")
                .empId(UUID.randomUUID().toString())
                .name("First Name")
                .salary(2000d)
                .build();

        return new ResponseEntity<>(employee ,HttpStatus.CREATED);
    }
}
