package abstractClasses;

public class Child extends Parent {

    void career(String name){
        System.out.println("I am Going to be a " + name);
    }

    void partner(String name , int age){
        System.out.println("my Partner is "+ name + " " + age);
    }
}
