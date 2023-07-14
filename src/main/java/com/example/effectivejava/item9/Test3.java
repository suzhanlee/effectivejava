package com.example.effectivejava.item9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test3 {

    public static void getInput(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
                String line = br.readLine();
                bw.write(line);
                throw new RuntimeException("오류 발생1");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        getInput("path");
    }

}
