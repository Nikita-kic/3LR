package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        try {
            String path = "src/info.txt";
            String currentLine;
            BufferedReader fileReader = new BufferedReader(new FileReader(path));
            while ((currentLine = fileReader.readLine()) != null) {
                if (Pattern.matches("^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$", currentLine)) {
                    System.out.println(currentLine);
                }
            }
            fileReader.close();

        } catch (IOException e) {
            System.out.println("Файл не найден или не открываается" + e);
            return;
        }
    }
}
