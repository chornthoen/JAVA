package OOP_3;

import java.util.Scanner;

public class StudentsUtil {


    public void sortStudentsName(Students[] students){
        for (int i = 0; i < students.length; i++) {
            for (int j = i+1; j < students.length; j++) {
                if (students[i].getName().compareTo(students[j].getName())>0){
                    Students tpm = students[i];
                    students[i]=students[j];
                    students[j]=tpm;
                }

            }
        }
    }

    public void sortStudentsAge(Students[] students){
        for (int i = 0; i < students.length; i++) {
            for (int j = i+1; j < students.length; j++) {
                if (students[i].getAge()>students[j].getAge()){
                    Students tpm = students[i];
                    students[i]=students[j];
                    students[j]=tpm;
                }

            }
        }
    }

    public void printStudentList(Students[] students){
        for (Students student : students) {
            print(student);
            System.out.println();
        }
    }

    public Students[] inputStudentList(int n){
        Students[] students = new Students[n];
        for (int i=0;i<n;i++){
            System.out.println("input #"+i);
            students[i]=this.inputStudents();
        }
        return students;
    }

    public Students inputStudents(){

        String name = this.getString("Enter name:");
        String gender = this.getString("Enter gender:");
        int age = this.getInt("Enter age:");
        Students students = new Students(name,gender,age);
        return students;
    }


    public int getInt(String label){
        return Integer.parseInt(this.getString(label));
    }



    public String getString(String label){
        Scanner scanner = new Scanner(System.in);
        System.out.print(label);
        return scanner.next();
    }

    public void print(Students students){
        printString("Name: "+students.getName());
        printString(", Gender :"+students.getGender());
        printString(", Age :"+students.getAge());


    }
    private void printString(String text){
        System.out.print(text);
    }
}
