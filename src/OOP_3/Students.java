package OOP_3;

public class Students {
    private  String name;
    private String gender;
    private int age;
    Students(String name,String gender,int age){
        this.name=name;
        this.gender = gender;
        this.age=age;

    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age ;
    }

}
