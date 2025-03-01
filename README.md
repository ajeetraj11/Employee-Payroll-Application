# Employee Payroll Application

## Section-1_UC-1
- Added Dependencies
- Kept Confidential and Unnecessary Files in `.gitignore`
- Created `application.properties` for Configuration

## Section-1_UC-2
- Implemented REST Endpoints: **GET, POST, PUT, DELETE**
- Configured **MySQL** Connection

### Steps to Run the Application
> **Note:** `application.properties` file is not included in the repository. You need to create it manually.

### Path to Create `application.properties`:

```properties
# Database Configuration
spring.datasource.url=your_mysql_URL/Dbname
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# JPA Configuration
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect  

```
## Section-2 UC-1 
- **Introducing DTO for request and Response** 
- **Introducing the Model(Entity) to save data in database** 
- **DTO add  extra abstraction layer to the user interaction**

## Section-2 UC-2 
- **Introducing Service Layer for Business Logic**
- **Adding Abstraction Layer for User request** 
- **Now Controller Interact with Service Layer then service layer Respond the user request**

## Section-2 UC-3
- **Temporally Storing Data in List**
- **Adding Employee to the List**
- **Getting Employee from the List**
- **Updating Employee in the List**
- **Deleting Employee from the List** 

## Section-3 UC-1
- **Introducing Lombok for Reducing Boilerplate Code**
- **Adding Lombok Dependency in `pom.xml`**
- **Using Lombok Annotations to Generate Getters, Setters, Constructors, etc.**
- **Removing Boilerplate Code from DTO Classes**

## Section-3 UC-2

### Configuration Code for Logger
*(I used this in UC-2, but `application.properties` is not included in the GitHub repository. To run this, manually add these lines to `application.properties`.)*

```properties
# Set log level for the application
logging.level.root=INFO
logging.level.com.example=DEBUG

# Log output format
logging.pattern.console=%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n

# Log file output
logging.file.name=logs/app.log
``` 

### 1. Adding Logger to the Project
- Include the necessary logging dependency in `pom.xml` (if using Maven).

### 2. Using Logger to Log Information
- Implement logging in the application using different log levels:
    - `INFO` – General information about the application's flow.
    - `DEBUG` – Detailed debugging information.
    - `WARN` – Warning messages about potential issues.
    - `ERROR` – Errors that need attention.

### 3. Configuring Logger Settings
- Define the log levels and specify how logs should be formatted.


## Section-3 UC-3
- **I have added the application-prod.properties and application-dev.properties in .gitignore make sure for running log create these files**
- **Path to Create `application-dev.properties`**: src/main/java/resources/application-dev.properties
- **Path to Create `application-prod.properties`**: src/main/java/resources/application-prod.properties
- **Determining Different Logging Based on Application Running**
- **like Different for Dev**
- **like Different for Prod** 

## Section-4 UC1
- **Validation in DTORequest for validating the name**
- **@Valid Annotation and @Pattern for name Field Validation**

## Section-4 UC-2
- **User Friendly Error message to name field validation**
- **Creating Global Exception for all controller for the name validation**

--- 

## Section-4 UC-3
- ####  User-Friendly Error Handling for Missing Employee ID

#### Overview
- **This update introduces a custom exception to handle cases where an invalid Employee ID is passed. The system will now return a user-friendly error message instead of a generic error.**

#### Changes Implemented
- **Custom Exception:** Defined a new exception class for Employee Not Found.
- **Exception Handling:** Added `@ExceptionHandler` in `EmployeePayrollException` class to catch and handle the exception gracefully.
- **Improved REST Responses:** Ensured that users receive meaningful error messages when querying non-existent Employee IDs.

## Section-5 UC-1

- **Adding Remaining Properties to EmployeePayrollDTO and Model**
- **Created Custom ResponseDTO to not sharing the internal model and confidential detail with the client**

## Section-5 UC-2
- **Validation of EmployeeRequest Data on different Field like salary , startDate, gender etc.**
- **@Valid Annotation and @Pattern for name Field Validation**

## Section-5 UC-3
- **Created Custom Exception Handler to display custom message to the user for invalid Date format
- **@JsonFormat annotation to format the date in the response**
- **@PastOrPresent annotation to validate the date**
- **@NotNull annotation to validate the date**

## Section-5 UC-4
# Steps to Save Employee Payroll Data to MySQL DB

## Step 1: Define Employee Payroll Model
- Handle one-to-many relationships using `@ElementCollection` and `@CollectionTable`.

## Step 2: Create Repository Interface
- Define an interface extending `JpaRepository` to manage Employee Payroll records.
- Spring Boot will auto-implement repository methods.

## Step 3: Autowire Repository to Save Data
- Inject the repository into the service layer using `@Autowired`.
- Use `save()` method to store employee payroll data.

## Step 4: Auto-Creation of Tables in MySQL
- Enable Hibernate auto-DDL feature (`spring.jpa.hibernate.ddl-auto=update`).
- Spring Boot automatically creates tables based on entity mappings.  
