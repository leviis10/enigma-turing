package AFundamentalBasic;

public class EControlFlow {
    public static void main(String[] args) {
        // Control Flow --> Loop
        int[] array = { 1, 2, 3, 4, 5 };

        // For-loop
        for (var i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // while loop
        var counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }

        // do while --> dijalankan paling tidak sekali
        counter = 100;
        do {
            System.out.println("Sebelum loop");
            counter++;
        } while (counter <= 10);

        // break & continue
        // break --> berhenti dari loop
        // continue --> lanjut ke iterasi selanjutnya
        var kounting = 1;
        while (true) {
            System.out.println("perulangan ke " + kounting);
            kounting++;
            if (kounting > 10) {
                break;
            }
        }

        for (int c = 1; c < 100; c++) {
            if (c % 2 == 0) {
                continue;
            }
            System.out.println(c);
        }

        // foreach
        String[] turingClass = { "Amirul", "Alvin", "Alan" };
        for (var value : turingClass) {
            System.out.println(value);
        }
    }
}
