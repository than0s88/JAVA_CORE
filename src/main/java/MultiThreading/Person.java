package MultiThreading;

public class Person extends  Thread{
    private String name;
    public Person(String name){
        this.name = name;
    }

    public void run(){
        System.out.println("My name is "+name);
    }
}
