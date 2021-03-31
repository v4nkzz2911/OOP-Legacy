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
public class Teacher extends Person {
    protected String subject;

    public Teacher() {
    }

    public Teacher(String subject) {
        this.subject = subject;
    }

    public Teacher(String subject, String name, int age, int birthyear) {
        super(name, age, birthyear);
        this.subject = subject;
    }

    
    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public void outputInfo(){
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " +age);
        System.out.println("Nam sinh: " +birthyear);
        System.out.println("Mon: "+subject);
    }
    
    public void run(){
        System.out.println("Giao vien dang chay");
    }
}
