package org.inwork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        readTextFile("/Users/olegmonogarov/GeekBrains_/java/java-core/6_test.txt");
//        try {
//            int[] nums = new int[3];
//            nums[3] = 57;
//            System.out.println(nums[3]);
//        }
//        catch (ArrayIndexOutOfBoundsException ex){
//            ex.toString();
////            ex.printStackTrace();
//        }

    }
    public static void readTextFile(String fileName)  {
        try {
            FileReader fileReader = new FileReader(fileName);
            char[] buf = new char[256];
            int c;
            while ((c = fileReader.read(buf)) > 0) {
                if (c < 256){
                    buf = Arrays.copyOf(buf, c);
                }
                for (char c1 : buf) {
                    System.out.print(c1);

                }

            }
            fileReader.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("* Сложности при открытии файла *");
        }
        catch (IOException ex){
            System.out.println("* Сложности при обработке файла *");

        }
    }
}