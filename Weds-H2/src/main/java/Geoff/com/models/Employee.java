package Geoff.com.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Employee {

    @Id
    @GeneratedValue (strategy= GenerationType.IDENTITY)
    private int empno;
    private String name;
    private String dept;
    private int salary;
    private String city;
    public void setEmpno(int empno) {
        this.empno = empno;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getEmpno() {
        return empno;
    }
    public String getName() {
        return name;
    }
    public String getDept() {
        return dept;
    }
    public int getSalary() {
        return salary;
    }
    public String getCity() {
        return city;
    }

    @OneToOne(cascade=CascadeType.ALL)
    public Passports passport;

}
