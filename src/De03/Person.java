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
public class Person {
    protected String name;
    protected String birthday;
    protected String address;
    protected String sex;

    public Person() {
    }

    public Person(String name, String birthday, String address, String sex) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
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
    
    
    
    @Override
    public String toString() {
        return name + "$" + birthday + "$" + address + "$" + sex + '$';
    }

    
    
}
