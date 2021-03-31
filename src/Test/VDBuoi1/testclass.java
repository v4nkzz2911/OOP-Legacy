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
public class testclass {
    public static void main(String[] args) {
        
        System.out.println();
        Person nguoi1 = new Student("15", "AT15B", "A", 19, 2000);
        nguoi1.outputInfo();
        nguoi1.run();
        System.out.println();
        nguoi1 = new Teacher("OOP", "B", 20, 1999);
        nguoi1.outputInfo();
        nguoi1.run();
        
    }
    
}
