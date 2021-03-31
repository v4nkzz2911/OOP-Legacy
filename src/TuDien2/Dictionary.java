/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TuDien2;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author er1nzz
 */
public class Dictionary {
    static ArrayList<Word> Dict = new ArrayList();
    public static void docFile(){
        Dict.clear();
        try {
            FileReader fr = new FileReader("Dictionary.txt");
            BufferedReader br = new BufferedReader(fr);
            
            String temp;
            while ((temp = br.readLine())!=null){
                Word t = new Word();
                String[] result = temp.split("\\$");
                t.setID(result[0]);
                t.setEn(result[1]);
                t.setVi(result[2]);
                Dict.add(t);
            }
            Collections.sort(Dict);
            br.close();
            fr.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    
    public static int timTu(String tuCanTim,int dau, int cuoi){
        if (dau>cuoi) return -1;
        int giua = (dau+cuoi)/2;
        if (tuCanTim.compareTo(Dict.get(giua).getEn())==0){
            return giua;
        }
        if (tuCanTim.compareTo(Dict.get(giua).getEn())>0){
            dau=giua+1;
        }
        else cuoi=giua-1;
        return timTu(tuCanTim, dau, cuoi);
    }
    
    
}
