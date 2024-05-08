package com.haddad.readers;
import java.util.Map;
import java.util.HashMap;

public class Statistic {
    private String path;
    private String word;
    private int statistique;

    public Statistic(String word,int statistique){
        this.word = word;
        this.statistique = statistique;
    }

    public int getStatistique() {
        return statistique;
    }

    public String getWord() {
        return word;
    }
}
