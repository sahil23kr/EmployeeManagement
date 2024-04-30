package com.EmployeeManage.Service;

import com.EmployeeManage.DAO.Employee;
import com.EmployeeManage.Dto.EmployeeDTO;
import com.EmployeeManage.Dto.JwtRequest;
import com.EmployeeManage.Dto.JwtResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeService{

    Employee createNewEmployee(Employee emp);

    List<Employee> getAllEmployee();

    Optional<Employee> findById(int id);

    Optional<Employee> findByIdName(int id, String name);

    Employee updateEmpData(int id, Employee employee);

    Optional<Employee> partialEmpUpdate(int id, Map<String,Object> objectMap);

    JwtResponse getToken(JwtRequest request);

    ResponseEntity<EmployeeDTO> findAllBypagination(int pageno, int pagesize);
}
