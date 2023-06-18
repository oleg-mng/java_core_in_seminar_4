package org.inwork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
//        readTextFile("/Users/olegmonogarov/GeekBrains_/java/java-core/6_test.txt", true);
//        try {
//            int[] nums = new int[3];
//            nums[3] = 57;
//            System.out.println(nums[3]);
//        }
//        catch (ArrayIndexOutOfBoundsException ex){
//            ex.toString();
////            ex.printStackTrace();
//        }
        Animal cat = new Cat("Кити", 2000);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int j = random.nextInt(2);
            try {
                switch (j) {
                    case 0:
                        cat.swim(i * 10);
                        break;
                    case 1:
                        cat.run(i * 10);
                        System.out.printf("Кошка пробежала дистанцию %s\n", i * 10);
                        break;
                }
            } catch (AnimalRunException ex) {
                System.out.printf("Ошибка при попытке животного %s пробежать дистанцию %d\n %s\n",
                        ex.getName(), ex.getDistance(), ex.getMessage());

            } catch (AnimalSwimException ex) {
                System.out.printf("Ошибка при попытке животного %s проплыть %d\n %s\n",
                        ex.getName(), ex.getDistance(), ex.getMessage());

            }

        }


    }

    public static void readTextFile(String fileName, boolean f) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
            char[] buf = new char[256];
            int c;
            while ((c = fileReader.read(buf)) > 0) {
                if (f) {
                    throw new Exception("Неожиданное исключение ");
                }
                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                for (char c1 : buf) {
                    System.out.print(c1);

                }

            }
            fileReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("* Сложности при открытии файла *");
        } catch (IOException ex) {
            System.out.println("* Сложности при обработке файла *");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {

            }

        }
    }
}