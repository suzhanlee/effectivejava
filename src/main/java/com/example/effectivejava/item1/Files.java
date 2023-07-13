package com.example.effectivejava.item1;

public class Files {

    public int size;
    public String content;

    private Files() {
    }

    public static Files createFiles(String content) {
        Files files = new Files();
        files.content = content;
        return files;
    }



}
