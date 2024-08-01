package com.orm.springbootorm.entity;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    private  String dept_no;
    private String dept_name;

    @OneToMany(mappedBy = "department")
    private List<DeptEmp> deptEmps;

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    public List<DeptEmp> getDeptEmps() {
        return deptEmps;
    }

    public void setDeptEmps(List<DeptEmp> deptEmps) {
        this.deptEmps = deptEmps;
    }
}
