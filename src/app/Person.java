package app;

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }

    public Person(String name) {
        this.name = name;

    }
     public void showInfo (){
      System.out.println(getName());}
}

