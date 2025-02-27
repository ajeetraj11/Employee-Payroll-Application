package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeRequestDTO;
import com.bridgelabz.employeepayrollapp.dto.EmployeeResponseDTO;
import com.bridgelabz.employeepayrollapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employeepayrollservice")
public class EmployeeController {

    // Injecting EmployeeService using @Autowired
    @Autowired
    private EmployeeService employeeService;

    // GET Employee
    @GetMapping("/get")
    public EmployeeResponseDTO getEmployee() {
        return employeeService.getEmployee();
    }

    // POST - Add Employee
    @PostMapping("/create")
    public EmployeeResponseDTO addEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        return employeeService.addEmployee(employeeRequestDTO.getName(), employeeRequestDTO.getSalary());
    }

    // PUT - Update Employee
    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable Long id) {
        return employeeService.updateEmployee(id);
    }

    // DELETE - Delete Employee
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }
}