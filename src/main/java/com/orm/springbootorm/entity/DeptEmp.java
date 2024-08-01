package com.orm.springbootorm.entity;

import java.io.Serializable;
import jakarta.persistence.*;

@Entity
@IdClass(DeptEmpId.class)
public class DeptEmp implements Serializable {

    @Id
    @Column(name = "emp_no")
    private int emp_no;

    @Id
    @Column(name = "dept_no")
    private String dept_no;

    @OneToOne
    @JoinColumn(name = "emp_no", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "dept_no", insertable = false, updatable = false)
    private Department department;

    // Getters and Setters
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}