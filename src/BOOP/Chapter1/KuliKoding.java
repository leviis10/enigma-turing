package BOOP.Chapter1;

public class KuliKoding extends Employee {
    private int salary;

    public KuliKoding(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void sayHi() {
        System.out.println("Hello from KuliKoding");
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
