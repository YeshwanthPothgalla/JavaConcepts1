package example;

public class Menu {
    String[] menu ={
            "1. View the DataBase",
            "2. Add new Item",
            "3. Delete Item",
            "4. Quit Program",
    };


    String get(){
        System.out.println("Choose an Option:");
       for(String option : menu){
           System.out.printf("  %s. \n",option);
       }
       return "hello";

    }
}
