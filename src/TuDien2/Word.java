/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuDien2;

import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author er1nzz
 */
public class Word implements Comparable<Word>{
    private String ID;
    private String En;
    private String Vi;

    public Word() {
    }

    public Word(String ID, String En, String Vi) {
        this.ID = ID;
        this.En = En;
        this.Vi = Vi;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEn() {
        return En;
    }

    public void setEn(String En) {
        this.En = En;
    }

    public String getVi() {
        return Vi;
    }

    public void setVi(String Vi) {
        this.Vi = Vi;
    }

    @Override
    public String toString() {
        return ID + "$" + En + "$" + Vi;
    }

    @Override
    public int compareTo(Word o) {
        if (this.En.compareTo(o.En)==0){
            return 0;
        }
        else if (this.En.compareTo(o.En)>0){
            return 1;
        }
        else return -1;
        
    }
    
    
}
