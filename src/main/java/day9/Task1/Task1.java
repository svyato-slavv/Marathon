package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Игорь", "Т-710");
        Teacher teacher=new Teacher("Филип Бедросович","Геодезия");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
