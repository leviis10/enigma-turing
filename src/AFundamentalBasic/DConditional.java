package AFundamentalBasic;

public class DConditional {
    public static void main(String[] args) {
        // if statement
        var score = "A";
        var score_2 = 60;

//        if (score >= 55 && score_2 >= 55) {
//            System.out.println("barely enough");
//        } else if (score >= 50 && score_2 >= 50) {
//            System.out.println("minimum congrats");
//        } else {
//            System.out.println("try again next year");
//        }

        // switch case digunakan saat ada banyak studi kasus dan hanya membandingkan persamaan
        switch (score) {
            case "A":
                System.out.println("WOW");
                break;
            case "B":
                System.out.println("good enough");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
                break;
        }

        // Ternary Operator
        // digunakan saat output nya hanya 2
        var scores = 70;
        String message = scores >= 70 ? "Congrats" : "Im sorry";
        System.out.println(message);
    }
}
