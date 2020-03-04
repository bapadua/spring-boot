package br.com.bapadua.netflix.producer.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private String empId;
    private String name;
    private String designation;
    private double salary;
}
