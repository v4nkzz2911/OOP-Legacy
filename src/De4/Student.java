/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De4;

/**
 *
 * @author winan
 */
public class Student extends Person{
    protected String MSV,emailString,DTK;

    public Student(String MSV, String emailString, String DTK, String HT, String NS, String DC, String GT) {
        super(HT, NS, DC, GT);
        this.MSV = MSV;
        this.emailString = emailString;
        this.DTK = DTK;
    }

    public Student() {
    }

    public String getMSV() {
        return MSV;
    }

    public void setMSV(String MSV) {
        this.MSV = MSV;
    }

    public String getEmailString() {
        return emailString;
    }

    public void setEmailString(String emailString) {
        this.emailString = emailString;
    }

    public String getDTK() {
        return DTK;
    }

    public void setDTK(String DTK) {
        this.DTK = DTK;
    }
    
    

    @Override
    public String toString() {
        return super.toString()+"\t|\tMSV: " + MSV + "\t|\t emailString: " + emailString + "\t|\t DTK: " + DTK + "\n";
    } 
}
