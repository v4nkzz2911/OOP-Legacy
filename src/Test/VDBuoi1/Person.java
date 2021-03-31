/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.VDBuoi1;

/**
 *
 * @author er1nzz
 */
public abstract class Person {
    protected String name;
    protected int age;
    protected int birthyear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    
    
    public Person() {
    }

    
    
    public Person(String name, int age, int birthyear) {
        this.name = name;
        this.age = age;
        this.birthyear = birthyear;
    }
    
    public void outputInfo(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("Nam sinh: " +birthyear);
    }
    
    public abstract void run();
    
}
