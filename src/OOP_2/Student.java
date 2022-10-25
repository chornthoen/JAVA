package OOP_2;

public class Student {
    String name;
    int age;
    Student(){
        System.out.println("Hello Student");
    }
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    void disPlay(){
        System.out.println("my name is "+name+ ", I'm "+age);
    }
}
