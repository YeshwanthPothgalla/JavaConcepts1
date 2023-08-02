package windowapp;

import application.Person;

public class App {
    public static void main(String[] args){
//        Window w1 = new Window();
//        w1.setWindowType("Glass");
//        w1.setHeight(100);
//        w1.setWidth(300);
//        w1.setColour("purple");
//        System.out.println("Type is"+" "+ w1.getWindowType());
//        System.out.println("Window height is"+" "+ w1.getHeight());
//        System.out.println("window width is"+" "+ w1.getWidth());
//        System.out.println("window colour is"+" "+ w1.getColour());


        Candidates c1 = new Candidates("Rama",30);
        Candidates c2 = new Candidates("Sita",30);
        c1.setName("Rama");
//        c1.setHeight(20);
////        Candidates c2 = new Candidates();
//        c2.setName("Sita");
//        c2.setHeight(10);
        System.out.println(c1.getName());
        System.out.println(c1.getHeight());
        System.out.println(c2.getName());
        System.out.println(c2.getHeight());

    }
}
