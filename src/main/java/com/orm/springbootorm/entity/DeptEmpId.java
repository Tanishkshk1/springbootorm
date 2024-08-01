package com.orm.springbootorm.entity;

import java.io.Serializable;
import java.util.Objects;

public class DeptEmpId implements Serializable {
    private int emp_no;
    private String dept_no;

    public DeptEmpId() {}

    public DeptEmpId(int emp_no, String dept_no) {
        this.emp_no = emp_no;
        this.dept_no = dept_no;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeptEmpId deptEmpId = (DeptEmpId) o;
        return emp_no == deptEmpId.emp_no && Objects.equals(dept_no, deptEmpId.dept_no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emp_no, dept_no);
    }
}
