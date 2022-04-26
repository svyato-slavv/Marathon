package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file=new File("people.txt");
        System.out.println(parseFileToObjList(file));
    }


    public static List<Person> parseFileToObjList(File file) {
        List<Person> listPerson = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Person person = new Person();
                String[] list = line.split(" ");
                if (Integer.parseInt(list[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                person.setName(list[0]);
                person.setAge(Integer.parseInt(list[1]));
                listPerson.add(person);
            }
            return listPerson;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return null;
    }
}
