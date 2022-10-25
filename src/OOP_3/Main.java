package OOP_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        StudentsUtil studentsUtil = new StudentsUtil();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n array: ");
        int n  = scanner.nextInt();
        Students[] students = studentsUtil.inputStudentList(n);
        studentsUtil.printStudentList(students);


        System.out.println("After sort Age");
        studentsUtil.sortStudentsAge(students);
        studentsUtil.printStudentList(students);


        System.out.println("After sort name");
        studentsUtil.sortStudentsName(students);
        studentsUtil.printStudentList(students);

    }
}
