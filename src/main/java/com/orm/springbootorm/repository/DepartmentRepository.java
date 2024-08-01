package com.orm.springbootorm.repository;
import com.orm.springbootorm.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, String> {
}
