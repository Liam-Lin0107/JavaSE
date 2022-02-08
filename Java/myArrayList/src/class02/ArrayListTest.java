package class02;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        addStudent(students);
        addStudent(students);
        addStudent(students);

        for (int i = 0; i < students.size(); i++){
            Student s = students.get(i);
            System.out.println(s.getName() + " ," + s.getAge());
        }

    }

    public static void addStudent(ArrayList<Student> array){
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入學生姓名 : ");
        String name = scanner.nextLine();

        System.out.print("請輸入學生年齡 : ");
        int age = scanner.nextInt();

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        array.add(student);

    }
}
