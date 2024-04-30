package com.EmployeeManage.Repo;

import com.EmployeeManage.DAO.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
    @Query(value="select * from employeemanage where Id = :id and Name = :name ", nativeQuery=true)
    Optional<Employee> findByIdName(@Param("id") int id,@Param("name") String name);

}
