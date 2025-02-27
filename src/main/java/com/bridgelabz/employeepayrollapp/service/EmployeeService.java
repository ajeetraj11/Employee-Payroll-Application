package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeeResponseDTO;
import org.springframework.stereotype.Service;

@Service  // Marks this as a service component
public class EmployeeService {

    // Method to fetch an employee
    public EmployeeResponseDTO getEmployee() {
        return new EmployeeResponseDTO("Ajeet", 45000.0);
    }

    // Method to add an employee
    public EmployeeResponseDTO addEmployee(String name, double salary) {
        return new EmployeeResponseDTO(name, salary);
    }

    // Method to update an employee
    public String updateEmployee(Long id) {
        return "Updating the Employee with ID: " + id;
    }

    // Method to delete an employee
    public String deleteEmployee(Long id) {
        return "Employee with ID " + id + " deleted successfully!";
    }
}