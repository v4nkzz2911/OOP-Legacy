/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De10_Lan2;

import java.util.Scanner;

/**
 *
 * @author er1nzz
 */
public class GiangVien {
    private String name;
    private String ID;
    private String address;
    private String sex;
    private String department;

    public GiangVien() {
    }

    public GiangVien(String name, String ID, String address, String sex, String department) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.sex = sex;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return name + "$" + ID + "$" + address + "$" + sex + "$" + department ;
    }
    
   
    
    
    
}
