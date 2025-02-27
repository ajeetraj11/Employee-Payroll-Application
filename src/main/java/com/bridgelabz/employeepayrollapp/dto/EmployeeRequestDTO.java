package com.bridgelabz.employeepayrollapp.dto;

// DTO (Data Transfer Object) for Employee requests.
// This class is used to transfer employee details from the client to the server.
public class EmployeeRequestDTO {
     private Long id;
     private String name;
     private double salary;

     // Constructor
     public EmployeeRequestDTO() {}

     public EmployeeRequestDTO(Long id , String name, double salary) {
          this.id = id;
          this.name = name;
          this.salary = salary;
     }

     // Getter Method for the id
     public Long getId(){
          return id;
     }
     // Setter Method for the id
     public void setId(Long id){
          this.id = id;
     }
     // Getter for name
     public String getName() {
          return name;
     }

     // Setter for name
     public void setName(String name) {
          this.name = name;
     }

     // Getter for salary
     public double getSalary() {
          return salary;
     }

     // Setter for salary
     public void setSalary(double salary) {
          this.salary = salary;
     }

     @Override
     public String toString() {
          return "EmployeeRequestDto{" +
                  "name='" + name + '\'' +
                  ", salary=" + salary +
                  '}';
     }
}