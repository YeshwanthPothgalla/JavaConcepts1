package application;

import java.util.Scanner;

public class Person {
    String name;
    String hobbies;
    int age;

    void setName(String theName){
        name = theName;

    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void setAge(int theAge){
        age = theAge;
    }

    public void greet(){
        System.out.println("My Name is"+" "+name);
        System.out.println("My hobbies are only"+" "+ hobbies);
    }


}
