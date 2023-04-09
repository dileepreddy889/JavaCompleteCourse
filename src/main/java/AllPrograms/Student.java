package AllPrograms;

import java.util.ArrayList;

public class Student {

    String name;
    int number;
    String email;

    public Student(String name, int number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    public static void main(String[] args) {
        Student student = new Student("Dileep", 987, "dil@gmail.com");
        Student student1 = new Student("Dileep1", 947, "dil1@gmail.com");
        Student student2 = new Student("Dilee2", 9857, "dil3@gmail.com");
        Student studen3 = new Student("Dileep3", 9827, "dil32@gmail.com");

        ArrayList<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(studen3);

        System.out.println("-------------");
        for (Student s:
             list) {
            System.out.println(s.name +"\t\t"+ s.number +"\t\t"+ s.email);
        }

    }
}
