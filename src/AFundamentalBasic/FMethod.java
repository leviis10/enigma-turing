package AFundamentalBasic;

public class FMethod {
    public static void main(String[] args) {
        String name = "Levi";
//        hello(name);

        int hasil = sum(5, 5);
//        System.out.println(hasil);

//        sayCongrats("Levi", 10, 10, 10, 10);
//        sayCongrats("Levi", new int[] {10, 10, 10, 10});

//        System.out.println(factorial(5));
    }

    // access modifier + static + return type + nama method + parameter + block
    public static void hello(String name) {
        System.out.println("Hello " + name);
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // method variable argument
    public static void sayCongrats(String name, int... totalScore) {
        int total = 0;
        for (var score : totalScore) {
            total += score;
        }
        int finalScore = total / totalScore.length;
        System.out.println("Congrats " + name + ", Score: " + finalScore);
    }

    // method overload
    static void sayHello() {
        System.out.println("Hello");
    }

    static void sayHello(int age) {
        System.out.println("I'm " + age);
    }

    static void sayHello(String name, String gender) {
        System.out.println(name + gender);
    }

    // recursive
    static int factorial(int value) {
        if (value == 1) {
            return 1;
        }
        return value * factorial(value - 1);
    }

    // scope
    static void sayHello(String name) {
        String hello = "Hello " + name;
        if (name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        System.out.println(hello);
//        System.out.println(hi);
    }
}
