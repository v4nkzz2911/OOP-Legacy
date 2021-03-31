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
public class Student extends Person{
    protected String Schoolyear;
    protected String classroom;

    public Student() {
    }

    public Student(String Schoolyear, String classroom) {
        this.Schoolyear = Schoolyear;
        this.classroom = classroom;
    }

    public Student(String Schoolyear, String classroom, String name, int age, int birthyear) {
        super(name, age, birthyear);
        this.Schoolyear = Schoolyear;
        this.classroom = classroom;
    }

    public String getSchoolyear() {
        return Schoolyear;
    }

    public void setSchoolyear(String Schoolyear) {
        this.Schoolyear = Schoolyear;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    
    public void outputInfo(){
        super.outputInfo();
        System.out.println("Khoa: "+Schoolyear);
        System.out.println("Lop: "+classroom);
    }
    
    public void run(){
        System.out.println("Hoc sinh dang chay");
    }
}
