package example;

public class Main {
    public static void main(String[] args){
        Menu m1 = new Menu();
        m1.get();
        ReturnValues r1 = new ReturnValues();
        r1.getAnimals();
        String animal =r1.animals();
        System.out.println(animal);

        Caluculator c1 = new Caluculator();
        int b = c1.square(8,4,3);
        System.out.println(b);
        int sum = c1.add(100,100);

        System.out.println(sum);
    }
}
