package com.EmployeeManage.Controller;

import com.EmployeeManage.DAO.Employee;
import com.EmployeeManage.Dto.EmployeeDTO;
import com.EmployeeManage.Dto.JwtRequest;
import com.EmployeeManage.Dto.JwtResponse;
import com.EmployeeManage.Service.EmployeeService;
import com.EmployeeManage.ServiceImpl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	@Autowired
	JwtRequest jwtRequest;
	@GetMapping("/getAll")
	public ResponseEntity<?> getAll(){
		return new ResponseEntity<>("Hello springboot",HttpStatus.OK);
	}
	
	@PostMapping("/createNewEmployee")
	public ResponseEntity<Employee> createNewEmployee(@RequestBody Employee emp){
		Employee empdata=employeeService.createNewEmployee(emp);
		return new ResponseEntity<Employee>(empdata,HttpStatus.CREATED);
	}

	@GetMapping("/getAllEmployee")
	public ResponseEntity<List<Employee>> getAllEmployee(){
		List<Employee> employeeList=employeeService.getAllEmployee();
		return new ResponseEntity<>(employeeList,HttpStatus.OK);
	}

	@GetMapping("/findById/{id}")
	public  ResponseEntity<Optional<Employee>> findById(@PathVariable("id") int id){
		Optional<Employee> employee=employeeService.findById(id);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}

	@GetMapping("/findByIdName")
	public ResponseEntity<Optional<Employee>> findByIdName(@RequestParam ("id") int id,@RequestParam ("name")String name){
		Optional<Employee> employee=employeeService.findByIdName(id,name);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}

	@PutMapping("/updateEmpData/{id}")
	public ResponseEntity<Employee> updateEmpData(@PathVariable("id") int id,@RequestBody Employee employee){
		Employee employee1=employeeService.updateEmpData(id,employee);
		return  new ResponseEntity<>(employee1,HttpStatus.OK);
	}

	@PatchMapping("/partialEmpUpdate/{id}")
	public ResponseEntity<Optional<Employee>> partialEmpUpdate(@PathVariable("id") int id,@RequestBody Map<String,Object> objectMap){
		Optional<Employee> employee1=employeeService.partialEmpUpdate(id,objectMap);
		return new ResponseEntity<>(employee1,HttpStatus.OK);
	}

	@GetMapping("/findAllByPagination")
	public ResponseEntity<Object> findAllBypagination(@RequestParam int pageno,@RequestParam int pagesize){
		ResponseEntity<EmployeeDTO> employee=employeeService.findAllBypagination(pageno,pagesize);
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}

	@PostMapping("/getToken")
	public ResponseEntity<Object> getToken(@RequestBody JwtRequest request){
		String token=null;
		JwtResponse response=employeeService.getToken(request);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}



}
