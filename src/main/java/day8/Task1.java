package day8;

public class Task1 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String string = "";
        for (int i = 0; i <=2000 ; i++) {
            string=string+" "+i;
        }
        System.out.println(string);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс: "+(stopTime-startTime));

        long startTime1 = System.currentTimeMillis();

        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <=2000 ; i++) {
            stringBuilder.append(i+" ");
        }
        System.out.println(stringBuilder);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс: "+(stopTime1-startTime1));
    }
}
