/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author er1nzz
 */
public class Dictionary {
    static ArrayList<Word> list = new ArrayList();
    public static void readWordList(){
        list.clear();
        try {
            FileReader fr = new FileReader("Dictionary.txt");
            BufferedReader br = new BufferedReader(fr);
            String temp;
            while ((temp=br.readLine())!=null){
                Word t = new Word();
                String[] result = temp.split("\\$");
                t.setWord(result[0]);
                t.setMeaning(result[1]);
                list.add(t);
                Collections.sort(list);
            }
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static int searchWord(String target,int d,int c){
        if (d>c) return -1;
        int g=(d+c)/2;
        if (list.get(g).getWord().equals(target)){
            return g;
        }
        else{
            if(list.get(g).getWord().compareTo(target)<0){
                d=g+1;
            }
            else{
                c=g-1;
            }
            return searchWord(target, d, c);
        }
        
    }
    
}
