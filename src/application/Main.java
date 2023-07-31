package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Person p1 = new Person();
        Person h1 = new Person();
        System.out.println("Enter persons name:");
        p1.name = sc.nextLine();
        System.out.println("Enter Hobbies:");
        p1.hobbies = sc.nextLine();
        p1.greet();

    }
}