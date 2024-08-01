package com.orm.springbootorm.repository;

import com.orm.springbootorm.entity.DeptEmp;
import com.orm.springbootorm.entity.DeptEmpId;
import org.springframework.data.repository.CrudRepository;

public interface DeptEmpRepository extends CrudRepository<DeptEmp, DeptEmpId> {
}
