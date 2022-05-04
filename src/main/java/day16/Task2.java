package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            PrintWriter file1 = new PrintWriter("file1.txt");
            PrintWriter file2 = new PrintWriter("file2.txt");
            Random r = new Random();
            for (int i = 0; i < 1000; i++) {
                file1.print(r.nextInt(100) + " ");
            }
            file1.close();
            File file = new File("file1.txt");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] array = line.split(" ");
            for (int i = 0; i < 1000; i = i + 20) {
                double arithmetic = 0;
                int sum = 0;
                for (int j = 0; j < 20; j++) {
                    sum += Integer.parseInt(array[j + i]);
                }
                arithmetic = (double) sum / 20;
                file2.print(arithmetic + " ");
            }
            file2.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не удалось создать");
        }

        printResult(new File("file2.txt"));
    }

    public static void printResult(File file) {
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] res = line.split(" ");
            double sum = 0;
            for (String numbers : res) {
                sum += Double.parseDouble(numbers);
            }
            int result=(int) sum;
            System.out.println(result);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");;
        }
    }
}
