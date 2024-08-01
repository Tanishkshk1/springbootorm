package com.orm.springbootorm.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.orm.springbootorm.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Query("SELECT e FROM Employee e JOIN e.deptEmps de JOIN de.department d WHERE d.dept_no = :deptNo")
    List<Employee> findEmployeesByDepartmentNo(@Param("deptNo") String deptNo);
}
//@Repository
//public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
   // @Query("SELECT e FROM Employee e JOIN e.deptEmps de JOIN de.department d WHERE d.dept_name = :deptName")
    //List<Employee> findEmployeesByDepartmentName(@Param("deptNo") String deptName);
//}
