package com.example.demo.service;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
    public List<Employee> saveEmployees(List<Employee> employees) {
        return repository.saveAll(employees);
    }
    public List<Employee> getEmployees() {
        return repository.findAll();
    }
    public Employee getEmployeeById(int id) {
        return repository.findById(id).orElse(null);
    }
    public Employee getEmployeeByName(String name) {
        return repository.findByName(name);
    }
    public String deleteEmployee(int id) {
        repository.deleteById(id);
        return "Employee removed !! " + id;
    }
    public Employee updateEmployee(Employee employee) {
        Employee existingEmployee = repository.findById(employee.getId()).orElse(null);
        existingEmployee.setName(employee.getName());
        return repository.save(existingEmployee);
    }
    public String delete(){
        repository.deleteAll();
        return "All Employees removed";
    }
}