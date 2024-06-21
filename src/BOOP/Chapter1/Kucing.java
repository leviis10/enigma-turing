package BOOP.Chapter1;

public class Kucing extends Hewan {
    // property / field / attributes
    Boolean hasTail; // -> default value

    // constructor -> method yang pertama x dijalankan ketika pertama kali object di instantiate
    Kucing(String name, String color) {
        super(name, color);
    }

    // overloading -> jumlah parameter harus beda / beda tipe data
    Kucing(String name) {
        this(name, null);
    }

    // this() -> memanggil constructor di dalam constructor
    Kucing() {
        this(null);
    }

    // method
    void sayHello() {
        System.out.println("meow");
    }

    // call parent method
    void bapakkuNgomong() {
        super.speak();
    }

    // method override
    @Override
    void speak() {
        System.out.println("saya kucing");
    }
}
