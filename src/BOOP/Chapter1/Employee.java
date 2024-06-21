package BOOP.Chapter1;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHi() {
        System.out.println("Hello from Employee");
    }
}
