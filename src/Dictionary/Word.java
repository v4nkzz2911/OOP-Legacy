/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dictionary;

/**
 *
 * @author er1nzz
 */
public class Word implements Comparable<Word>{
    private String word;
    private String meaning;

    public Word() {
    }

    public Word(String word, String meaning) {
        this.word = word;
        this.meaning = meaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return word + "$" + meaning;
    }

    @Override
    public int compareTo(Word o) {
        if (this.word.compareTo(o.getWord())==0){
            return 0;
        }
        else if(this.word.compareTo(o.getWord()) > 0){
            return 1;
        }
        else{
            return -1;
        }
            
        
    }
    
    
    
}
