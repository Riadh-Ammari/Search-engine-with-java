/*package com.haddad.domain;

import com.haddad.readers.*;
import com.haddad.tokenizers.*;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.haddad.analyzers.*;
import com.haddad.indexes.*;

public class SearchEngine {
   

    public void index(String path){
        File filePath = Paths.get(path).toFile();
        if(filePath.exists()){
            if(filePath.isDirectory()){
                System.out.println(path+" is a directory");
                indexDirectory(path);
            }else{
                System.out.println(path+" is a file");
                indexSingleDocument(path);
            }
        }else{
            System.out.println(path+" does not exist");
        }
        
    }



    private void indexSingleDocument(String path){
        System.out.println(path);
    }

    private void indexDirectory(String path){
        File pathFile = Paths.get(path).toFile();
        File[] files = pathFile.listFiles();
        for(File f: files ){
            if(f.isDirectory()){
                indexDirectory(f.getAbsolutePath());
            }else{
                indexSingleDocument(f.getAbsolutePath());
            }
        }
    }

    

}
*/