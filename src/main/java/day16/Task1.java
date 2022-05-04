package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("TestingExceptions");
        printResult(file);
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += Integer.parseInt(numbers[i]);
            }
            double result = (double) sum / numbers.length;
            System.out.print(result+"-->");
            System.out.format("%.3f",result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}

