package BOOP.Chapter1;

public class Main {
    public static void main(String[] args) {
        // new -> keyword untuk membuat objek dari sebuah class
        Employee employee = new Employee("testEmployee");
        sayHi(employee);

        employee = new KuliKoding("testKuliKoding", 0);
        sayHi(employee);
    }

    public static void sayHi(Employee employee) {
        if (employee instanceof KuliKoding) {
            System.out.println("KULI");
        } else {
            System.out.println("EMPLOYEE");
        }
    }
}
