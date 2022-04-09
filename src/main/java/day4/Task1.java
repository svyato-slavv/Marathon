package day4;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int[] array=new int[a];
        Random r=new Random();
        int vosem=0;
        int odin=0;
        int che=0;

        for (int i = 0; i < array.length; i++) {
            array[i]=r.nextInt(11);
            if (array[i]>8){
                vosem++;
            }
            if (array[i]==1){
                odin++;
            }
            if (array[i]%2==0){
                che++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длина массива: "+array.length);
        System.out.println("Количество чисел больше 8: "+vosem);
        System.out.println("Количество чисел равных 1: "+odin);
        System.out.println("Количество четных чисел: "+che);




    }
}
