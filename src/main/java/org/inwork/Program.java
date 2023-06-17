package org.inwork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {
        try {
            int[] nums = new int[3];
            nums[3] = 57;
            System.out.println(nums[3]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            ex.toString();
//            ex.printStackTrace();
        }

    }
    public static void readTextFile(String fileName)  {
        try {
            FileReader fileReader = new FileReader(fileName);
            char[] buf = new char[256];
            int c;
            while ((c = fileReader.read(buf)) > 0) {

            }
        }
        catch (FileNotFoundException ex){
            System.out.println("* Сложности при открытии файла *");
        }
        catch (IOException ex){
            System.out.println("* Сложности при обработке файла *");

        }
    }
}