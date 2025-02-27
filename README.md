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