package com.orm.springbootorm.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.orm.springbootorm.entity.Employee;
import com.orm.springbootorm.service.EmployeeService;
@RestController
@RequestMapping(path = "/emp")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employee/{emp_no}")
    public Employee getEmployee(@PathVariable("emp_no") int emp_no) {
        return employeeService.getEmployeeByEmp_no(emp_no);
    }

    @GetMapping("/department/{deptNo}")
    public ResponseEntity<List<Employee>> getEmployeesByDepartmentNo(@PathVariable String deptNo) {
        List<Employee> employees = employeeService.getEmployeesByDepartmentNo(deptNo);
        return ResponseEntity.ok(employees);
/*        if (!employees.isEmpty()) {
            return ResponseEntity.ok(employees);
        } else {
            return ResponseEntity.notFound().build();
        }*/
    }
    //@GetMapping("/{emp_no}/department")
    //public Employee getEmpByDepartmentName(@PathVariable("emp_no")int emp_no){
      //  return employeeService.getEmployeesByDepartmentName(emp_no);
    //}

    @DeleteMapping("/employee/{emp_no}")
    public void deleteEmployee(@PathVariable("emp_no") int emp_no) {
        employeeService.deleteEmployeeByEmp_no(emp_no);
    }

    @PostMapping("/employee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
    }

    @PutMapping("/employee")
    public void updateEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
    }

}
