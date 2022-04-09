package day6;

import java.util.Random;

public class Teacher {
    private String nameT;
    private String subject;

    public Teacher(String name, String subject) {
        this.nameT = name;
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random r = new Random();
        int a = r.nextInt(4) + 2;
        String grade = "";
        switch (a) {
            case 2:
                grade = "неудовлетворительно";
                break;
            case 3:
                grade = "удовлетворительно";
                break;
            case 4:
                grade = "хорошо";
                break;
            case 5:
                grade = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.nameT + " оценил студента с именем " + student.getName() + " по предмету " + this.subject + " на оценку " + grade);
    }
}
