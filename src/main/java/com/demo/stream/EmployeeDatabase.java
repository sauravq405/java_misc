package com.demo.stream;

import com.demo.model.Employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDatabase {

    public static List<Employee> getAllEmployees(){

        return Stream.of(
                new Employee(100, "Alan", "HR", 25000),
                new Employee(101, "Bela", "Sales", 20000),
                new Employee(102, "Alan", "Finance", 30000),  // Duplicate name
                new Employee(103, "Cara", "IT", 28000),
                new Employee(104, "David", "Marketing", 27000),
                new Employee(105, "Bela", "HR", 26000),      // Duplicate name
                new Employee(106, "Evan", "Sales", 22000),
                new Employee(107, "Fiona", "IT", 29000),
                new Employee(108, "Greg", "Finance", 31000),
                new Employee(109, "Hana", "Marketing", 32000),
                new Employee(110, "Ian", "HR", 24000),
                new Employee(111, "Jade", "Sales", 21000),
                new Employee(112, "Alan", "IT", 33000),      // Duplicate name
                new Employee(113, "Kira", "Finance", 34000),
                new Employee(114, "Leo", "Marketing", 35000),
                new Employee(115, "Mina", "HR", 23000),
                new Employee(116, "Neil", "Sales", 20500),
                new Employee(117, "Bela", "IT", 30500),      // Duplicate name
                new Employee(118, "Omar", "Finance", 36000),
                new Employee(119, "Peta", "Marketing", 37000)
        ).collect(Collectors.toList());
    }
}
