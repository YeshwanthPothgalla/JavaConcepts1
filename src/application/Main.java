package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        p1.setAge(90);
        p1.setName("Mikitha");


        System.out.println("Enter persons name:");
        p1.name = sc.nextLine();
        System.out.println("Enter Hobbies:");
        p1.hobbies = sc.nextLine();
        p1.greet();

           System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}