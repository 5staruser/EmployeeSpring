package com.example.demo.Repository;
import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Employee findByName(String name);
}