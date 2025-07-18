package com.cognizant.orm_learn;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    private static EmployeeService employeeService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        employeeService = context.getBean(EmployeeService.class);

        testAddEmployee();
    }

    private static void testAddEmployee() {
        LOGGER.info("Start");

        Employee emp = new Employee();
        emp.setName("Alice");
        emp.setDepartment("Finance");

        employeeService.addEmployee(emp);

        LOGGER.debug("Employee saved: {}", emp);

        LOGGER.info("End");
    }
}
