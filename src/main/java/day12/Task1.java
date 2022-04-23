package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> autoList=new ArrayList<>();
        autoList.add("Audi");
        autoList.add("Mercedes");
        autoList.add("Volvo");
        autoList.add("BMW");
        autoList.add("Volkswagen");
        System.out.println(autoList);
        autoList.add(3,"Lada");
        autoList.remove(0);
        System.out.println(autoList);

    }
}
