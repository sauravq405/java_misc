package com.demo.stream;

import com.demo.model.Employee;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeStreamDebugger {
    public static void main(String[] args) {
        List<String> names = EmployeeDatabase.getAllEmployees()
                .stream()
                .filter(employee -> employee.getSalary() > 30000)
                .map(Employee::getName)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(names);
    }

    public static List<String> getEmployeeNamesWithHighSalary() {
        // Using TreeSet to ensure uniqueness and sorting
        Set<String> namesSet = new TreeSet<>();

        // Adding employee names to TreeSet based on salary condition
        EmployeeDatabase.getAllEmployees()
                .stream()
                .filter(employee -> employee.getSalary() > 30000)  // Filter based on salary
                .map(Employee::getName)                               // Extract employee names
                .forEach(namesSet::add);                              // Add names to TreeSet (which ensures uniqueness and sorting)

        // Convert the TreeSet to a List
        return namesSet.stream().collect(Collectors.toList());
    }

    public List<String> getUnsortedEmployeeNamesWithHighSalary() {
        // Using LinkedHashSet to ensure uniqueness and preserve insertion order
        Set<String> namesSet = new LinkedHashSet<>();

        // Adding employee names to LinkedHashSet based on salary condition
        EmployeeDatabase.getAllEmployees()
                .stream()
                .filter(employee -> employee.getSalary() > 30000)  // Filter based on salary
                .map(Employee::getName)                               // Extract employee names
                .forEach(namesSet::add);                              // Add names to LinkedHashSet (ensures uniqueness)

        // Convert the LinkedHashSet to a List
        return namesSet.stream().collect(Collectors.toList());
    }
}
