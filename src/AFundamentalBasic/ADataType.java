package AFundamentalBasic;

public class ADataType {
    public static void main(String[] args) {;
        // Data Types lesson

        // Primitive data types
        // #########################################################################################
        // integer
        // byte: 1 byte
        // short: 2 bytes
        // int: 4 bytes
        // long: 8 bytes
//        byte iniByte = 100;
//        long iniLong = 10000L;
//        System.out.println(iniByte);

        // Floating Point Number --> decimal
        // float: 4 bytes
        // double: 8 bytes
//        float iniFloat = 10.12F;
//        double iniDouble = 12.2424;

//        long iniAngkaPanjang = 1_000_000;

        // Literals
        // Hex
//        int hexInt = 0x4132B;
        // binInt
//        int binInt = 0b0101;

        // Casting
        // 1. Widening Casting (Otomatis): byte --> short --> int --> long --> float --> double
//        byte iniByte = 100;
//        short iniShort = iniByte;
//        int iniInt = iniShort;
//        long iniLong = iniInt;
//        float iniFloat = iniLong;
//        double iniDouble = iniFloat;

        // 2. Narrowing Casting (Manual): double --> float --> long --> int --> short --> byte
//        float iniFloat2 = (float) iniDouble;
//        long iniLong2 = (long) iniFloat2;
//        int iniInt2 = (int) iniLong2;
//        short iniShort2 = (short) iniInt2;
//        byte iniByte2 = (byte) iniShort2;

        // #########################################################################################
        // 2. char
//        char e = 'E';

        // 3. boolean
//        boolean benar = true;
//        boolean salah = false;

        // 4. String
        // default value = null
        String name = "Levi";
        String lastName = "Sutantio";
        String fullName = name + " " + lastName;
        System.out.println(fullName);

        // Non primitive Data Types memiliki method tidak bisa dicasting
        Byte iniByte;
        Short iniShort;
        Long iniLong;
        Boolean iniBoolean;
        Character iniChar;

        int age = 23;
        Integer ageObject = 30;
        short coba = ageObject.shortValue();
        short casted = (short) age;
        System.out.println(coba);
        // #########################################################################################

        // Array
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "test"; // assigning operation
        arrayString[1] = "test2";
        arrayString[2] = "test3";
        System.out.println(arrayString[0]);
        // langsung init elements
        int[] arrayInt = new int[] {1, 2, 3, 4, 5};

        // Array Operation
        // 1. assigning (=)
        // 2. accessing array[n]
        // 3. array.length
//        System.out.println(arrayInt.length);

        // multi dimension array
        String[][] turingClass = {
                { "tommy", "Irsyad", "Levi" },
                { "tommy", "Irsyad", "Levi" },
                { "tommy", "Irsyad3", "Levi" }
        };
        System.out.println(turingClass[2][1]);
    }
}
