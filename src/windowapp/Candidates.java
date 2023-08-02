package windowapp;

public class Candidates {

    private String name;
    private int height;

    public Candidates(String name, int height){
        this.name = name;
        this.height= height;
        System.out.println("created person");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;

    }

}
