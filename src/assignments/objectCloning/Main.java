package assignments.objectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human saurabh = new Human(23, "saurabh");

        Human twin = (Human) saurabh.clone();

        System.out.println(twin.age + " " + twin.name);
    }
}
