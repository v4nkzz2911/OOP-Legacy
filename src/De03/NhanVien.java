/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De03;

/**
 *
 * @author er1nzz
 */
public class NhanVien extends Person{
    protected String department;
    protected double salaryrate;
    protected double seniority;
    protected int salarybase;

    public NhanVien() {
    }

    public NhanVien(String department, double salaryrate, double seniority, int salarybase, String name, String birthday, String address, String sex) {
        super(name, birthday, address, sex);
        this.department = department;
        this.salaryrate = salaryrate;
        this.seniority = seniority;
        this.salarybase = salarybase;
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

    public int getSalarybase() {
        return salarybase;
    }

    public void setSalarybase(int salarybase) {
        this.salarybase = salarybase;
    }
    
    public double calcSalary(){
        return this.salarybase*this.salaryrate*(1+this.seniority/100);
    }

    @Override
    public String toString() {
        return super.toString() + department + "$" + salaryrate + "$" + seniority + "$" + salarybase + "$"+ calcSalary();
    }
    
    
    
    
}
