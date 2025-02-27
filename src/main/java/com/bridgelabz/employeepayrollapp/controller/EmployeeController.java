package com.bridgelabz.employeepayrollapp.controller;

import com.bridgelabz.employeepayrollapp.dto.EmployeeRequestDTO;
import com.bridgelabz.employeepayrollapp.dto.EmployeeResponseDTO;
import com.bridgelabz.employeepayrollapp.model.Employee;
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
    @GetMapping("/getById/{id}")
    public EmployeeResponseDTO getEmployee(@PathVariable Long id) {
        try {
            Employee employee = employeeService.getEmployeeById(id);
            return new EmployeeResponseDTO(employee.getName() , employee.getSalary());
        }catch (Exception e){
            e.getStackTrace();
        }
      return null;
    }

    // POST - Add Employee
    @PostMapping("/create")
    public Employee addEmployee(@RequestBody EmployeeRequestDTO employeeRequestDTO) {
        return employeeService.addEmployee( new Employee(employeeRequestDTO.getId() ,employeeRequestDTO.getName(), employeeRequestDTO.getSalary()));
    }

    // PUT - Update Employee
    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable Long id , @RequestBody EmployeeRequestDTO employeeRequestDTO) {
        return employeeService.updateEmployee(id , new Employee(employeeRequestDTO.getId() , employeeRequestDTO.getName() , employeeRequestDTO.getSalary()));
    }

    // DELETE - Delete Employee
    @DeleteMapping("/delete/{id}")
    public boolean deleteEmployee(@PathVariable Long id) {
        return employeeService.deleteEmployee(id);
    }
}