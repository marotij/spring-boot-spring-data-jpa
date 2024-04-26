package com.codelab.jpa.controller;

import com.codelab.jpa.model.Employee;
import com.codelab.jpa.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Tag(name = "Employee-Service", description = "To perform operation on Employee-Service")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Operation(
            summary = "POST operation on employee-service",
            description = "It is used to save employee object in database"
    )
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {

        return employeeService.saveEmployee(employee);
    }

    @Operation(
            summary = "GET operation on employee-service",
            description = "It is used to retrieve employees object from database"
    )
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {

        return employeeService.fetchAllEmployees();
    }


    @Operation(
            summary = "GET operation on employee-service",
            description = "It is used to retrieve employee object from database by using id"
    )
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id) {

        return employeeService.getEmployeeById(id);
    }

    @Operation(
            summary = "PUT operation on employee-service",
            description = "It is used to update employee object in database by using id"
    )
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployeeById(id, employee);
    }

    @Operation(
            summary = "DELETE operation on employee-service",
            description = "It is used to delete employee object from database by using id"
    )
    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Long id) {

        return employeeService.deleteDepartmentById(id);
    }


}
