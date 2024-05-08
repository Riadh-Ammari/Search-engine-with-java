package com.haddad.readers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pretraiteur implements DeleteEmptyWords {
    @Override
    public List<String> DeleteEmptyWords(List<String> contenu) {
        List<String> result = new ArrayList<>();
        List<String> unnecessary= Arrays.asList("of","or","a","and",".",",",";","","?","!",":" );
        for(String word : contenu){
            if(!unnecessary.contains(word.toLowerCase())){
                result.add(word.toLowerCase());
            }
        }
        return result;
    }

}
