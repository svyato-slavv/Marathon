package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix=new int[12][8];
        Random r=new Random();
        int [] sum=new int[matrix.length];
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                matrix[i][j]= r.nextInt(50);
                sum[i]+=matrix[i][j];
            }
        }
        int maxIndex=0;
        for (int i = 0; i < sum.length ; i++) {
            if (sum[i]>=sum[maxIndex]){
                maxIndex=i;
            }
        }
        System.out.println(maxIndex);
    }
}
