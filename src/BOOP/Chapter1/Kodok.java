package BOOP.Chapter1;

public class Kodok {
    private String name;
    private String color;
    private final boolean amphibi = true;

    Kodok(String name, String color) {
        this.name = name;
        this.color = color;
    }

    Kodok(String name) {
        this(name, null);
    }

    Kodok() {
        this(null);
    }

    void sayHello() {
        System.out.println("WEBEEEK");
    }

    // getter and setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAmphibi() {
        return amphibi;
    }
}
