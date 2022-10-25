package OOP_1;

public class Cat {
    private String name;
    private String color;
    private int age;
    void setValue(String name, String color, int age){
        this.name= name;
        this.color=color;
        this.age=age;
    }
    void disPlay(){
        System.out.println("Name: "+name+", Color: "+color+", Age: "+age);
    }



}
