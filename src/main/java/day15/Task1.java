package day15;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator=File.separator;
        File firstFile=new File("src"+separator+"main"+separator+"resources"+separator+"shoes.csv");
        File secondFile = new File("src"+separator+"main"+separator+"resources"+separator+"missing_shoes.txt");
        try {
            Scanner scanner = new Scanner(firstFile);
            PrintWriter printWriter=new PrintWriter(secondFile);
            while(scanner.hasNextLine()){
                String line=scanner.nextLine();
                String[] mass=line.split(";");
                if(Integer.parseInt(mass[2])==0){
                    for (int i = 0; i < 3; i++) {
                        printWriter.print(mass[i]+" ");
                    }
                    printWriter.println();
                }
            }
            scanner.close();
            printWriter.close();
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");;
        }
    }
}
