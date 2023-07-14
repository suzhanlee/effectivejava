package com.example.effectivejava.item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

    public static void getInput(String path) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader bw = new BufferedReader(new FileReader(path));
            try {
                String line = br.readLine();
                bw.readLine();
                throw new RuntimeException("오류 발생1");
            } finally {
                bw.close();
                throw new RuntimeException("오류 발생2");
            }
        } finally {
            br.close();
            throw new RuntimeException("오류 발생3");
        }
    }

    public static void main(String[] args) throws IOException {
        getInput("path");
    }
}
