package org.example;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        String path1 = "C:/Users/gmalyshev/Desktop/myCode.txt";
        String path2 = "C:/Users/gmalyshev/Desktop/digitalCode.txt";

        try {
            fis = new FileInputStream(path1);
            fos = new FileOutputStream(path2);

            byte[] byteArray = new byte[fis.available()];
            fis.read(byteArray, 0, byteArray.length);

            fos.write(byteArray, 0, byteArray.length);

        } catch (IOException exception) {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }
        }
    }
}




