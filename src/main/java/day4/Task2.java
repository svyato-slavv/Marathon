package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random r = new Random();
        int max = 0;
        int min = 10000;
        int count10=0;
        int sum10=0;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10000);
        }
        for (int a : array) {
            if (a > max) max = a;
            if (a < min) min = a;
            if(a%10==0) count10++;
            if(a%10==0) sum10 += a;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Наибольший элемент массива: "+max);
        System.out.println("Наименьший элемент массива: "+min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: "+count10);
        System.out.println("Сумму элементов массива, оканчивающихся на 0: "+sum10);

    }
}
