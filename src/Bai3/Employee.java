/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author er1nzz
 */
public class Employee extends Persion{
    protected String department;
    protected double salaryrate;
    protected double seniority;
    protected int basesalary;
    protected double salary;
    
    public Employee() {
    }

    public Employee(String department, double salaryrate, double seniority, int basesalary, String name, String birthday, String address, String sex) {
        super(name, birthday, address, sex);
        this.department = department;
        this.salaryrate = salaryrate;
        this.seniority = seniority;
        this.basesalary = basesalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalaryrate() {
        return salaryrate;
    }

    public void setSalaryrate(double salaryrate) {
        this.salaryrate = salaryrate;
    }

    public double getSeniority() {
        return seniority;
    }

    public void setSeniority(double seniority) {
        this.seniority = seniority;
    }

    public int getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(int basesalary) {
        this.basesalary = basesalary;
    }
    
    public String calcSalary(){
        this.salary = this.basesalary*this.salaryrate*(1+this.seniority/100);
        return ""+this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +super.toString() + "department=" + department + ", salaryrate=" + salaryrate + ", seniority=" + seniority + ", basesalary=" + basesalary + ", salary=" + salary + '}';
    }
    
    
}
