package com.orm.springbootorm.entity;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int emp_no;
    private String first_name;
    private String last_name;
    @OneToMany(mappedBy = "employee")
    private List<DeptEmp> deptEmps;

    public void setDeptEmps(List<DeptEmp> deptEmps) {
        this.deptEmps = deptEmps;
    }

    public List<DeptEmp> getDeptEmps() {
        return deptEmps;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}
