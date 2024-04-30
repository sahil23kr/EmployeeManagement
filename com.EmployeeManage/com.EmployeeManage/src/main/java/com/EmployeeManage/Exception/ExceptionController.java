package com.EmployeeManage.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value= EmployeeIdNotFoundException.class)
    public ResponseEntity<Object> empIdNotFound(EmployeeIdNotFoundException employeeException){
        return new ResponseEntity<>("Employee Id does not exist", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value=EmpIdNameNotFoundException.class)
    public ResponseEntity<Object> empNameNotFound(EmpIdNameNotFoundException empIdNameNotFoundException){
        return new ResponseEntity<>("Employee Id and Name do not exist", HttpStatus.NOT_FOUND);
    }

}
