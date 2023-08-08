package ru.skypro.lessons.springboot.springhw.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.skypro.lessons.springboot.springhw2.dto.EmployeeDTO;
import ru.skypro.lessons.springboot.springhw2.dto.EmployeeFullInfo;
import ru.skypro.lessons.springboot.springhw2.model.Employee;

import java.io.IOException;
import java.util.Collection;

public interface EmployeeService {
    Collection<EmployeeFullInfo> getAllEmployees();
    void createEmployee(EmployeeDTO employeeDTO);
    Employee getEmployeeById(Integer id);
    void updateEmployeeById(Integer id, EmployeeDTO employeeDTO);
    void deleteEmployeeById(Integer id);
    Integer getSalarySum();
    EmployeeFullInfo getSalaryMin();
    EmployeeFullInfo getSalaryMax();
    Collection<EmployeeFullInfo> getSalaryAboveAverageEmployees();
    Collection<EmployeeFullInfo> getEmployeesByParamSalary(int paramSalary);
    EmployeeFullInfo getEmployeeByIdFullInfo(Integer id);
    Collection<EmployeeFullInfo> getEmployeesByPosition(Integer position);
    Collection<EmployeeFullInfo> getEmployeesWithHighestSalary();

    Collection<EmployeeDTO> getEmployeeWithPage(Integer page);

    void createEmployeeFromFile(MultipartFile file) throws IOException;
}