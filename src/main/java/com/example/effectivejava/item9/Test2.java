package com.example.effectivejava.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test2 {

    static void readInput() throws IOException {
        try (BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in))) {
            br.readLine();
            throw new RuntimeException("예외 발생!");
        }
    }

    static void readFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(
            new FileReader(path))) {
            br.readLine();
            throw new RuntimeException("예외 발생!");
        }
    }


    public static void main(String[] args) throws IOException {
        readFile("path");
    }

}
