package com.haddad.readers;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Document {
    private String path;
    private List<String> content;

    public Document(String path) {
        this.path = path;
        this.content =content;
    }



    public String getPath() {
        return path;
    }


    public List<String> getContent() {
        return content;
    }
}
