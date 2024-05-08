package com.haddad.readers;

import java.util.*;

public class Analyzor implements OccNomber{

    @Override
    public  Map<String, Integer> analyse(List<String> contentPretraite) {
        Map<String, Integer> stat = new TreeMap<>();
        for(String word : contentPretraite){
            int occurrenceNumber=0;
            for (String mot : contentPretraite) {
                if (word.equals(mot)) {
                    occurrenceNumber++;
                }
            }
            stat.put(word,occurrenceNumber);
        }



        return stat;
    }
}
