package BOOP.Chapter1;

public class Hewan {
    String name;
    String color;
    int counter;
    // static field
    static int count;

    public Hewan(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
        counter++;
    }

    void speak() {
        System.out.println("im an animal");
    }

    static void say() {
        System.out.println("HELLO FROM HEWAN CLASS");
    }
}
