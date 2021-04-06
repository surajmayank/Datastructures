package com.java.file;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileClass {
    public static void main(String[] args) {
        File f = new File("delete.txt");
        try{
//            FileOutputStream fos = new FileOutputStream(f);
//            BufferedOutputStream bos = new BufferedOutputStream(fos);
//            bos.write("welcome to the New York".getBytes(StandardCharsets.UTF_8));
//            bos.flush();
//            bos.close();

            Files.write(Paths.get("deleteme.txt"),"helloWorld".getBytes(StandardCharsets.UTF_8));
            Files.readAllLines(Paths.get("deleteme.txt")).forEach(System.out::println);


//            FileInputStream fis = new FileInputStream(f);
//            InputStreamReader bis = new InputStreamReader(fis,StandardCharsets.UTF_8);
//            BufferedReader br = new BufferedReader(bis);
//            br.lines().forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
