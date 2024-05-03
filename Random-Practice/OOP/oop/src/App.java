package oop.src;

public class App {
    public static void main(String[] args) throws Exception {
        Humans human = new Humans("Alex Harper", 20, "San Jose, California");
        human.setName("Antonio Valdez");
        System.out.println(human.getName());
    }
}
