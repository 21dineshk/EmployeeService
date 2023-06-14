package com.application.employee.service.services;

import com.application.employee.service.entities.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee e);

    List<Employee> getAllEmployee();

    Employee getEmployee(String id);
}
