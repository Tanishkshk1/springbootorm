package com.orm.springbootorm.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.orm.springbootorm.entity.Employee;
import com.orm.springbootorm.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public Employee getEmployeeByEmp_no(int emp_no) {
        return repository.findById(emp_no).get();
    }

    public List<Employee> getAllEmployees(){
        List<Employee> employees = new ArrayList<Employee>();
        repository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }

    public void saveOrUpdate(Employee employee) {
        repository.save(employee);
    }

    public void deleteEmployeeByEmp_no(int emp_no) {
        repository.deleteById(emp_no);
    }

    //public List<Employee> getEmployeesByEmpId(int emp_no) {
     //   return repository.findEmployeesByDepartmentName(departmentName);
    //}

    public List<Employee> getEmployeesByDepartmentNo(String deptNo) {
        return repository.findEmployeesByDepartmentNo(deptNo);
    }
}