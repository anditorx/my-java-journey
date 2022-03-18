/**
 * Switch Statement
 *
 * Kadang kita hanya butuh menggunakan kondisi sederhana di if statement, seperti hanya menggunakan perbandingan ==
 * Switch adalah statement percabangan yang sama dengan if, namun  lebih sederhana cara pembuatannya
 * Kondisi di switch statement hanya untuk perbandingan ==
 * */

public class SwitchStatement {
    public static void main(String[] args) {
        String hari = "sore";

        switch (hari){
            case "pagi":
                System.out.println("Selamat pagi!");
                break;
            case "siang":
                System.out.println("Selamat siang!");
                break;
            case "sore":
                System.out.println("Selamat sore!");
                break;
            case "malam":
                System.out.println("Selamat malam!");
                break;
            default:
                System.out.println("Selamat pagi!");
        }

        System.out.println("");
        // Switch Lambda
        // Di Java versi 14, diperkenalkan switch expression dengan lambda
        //Ini lebih mempermudah saat penggunaan switch expression karena kita tidak perlu lagi menggunakan kata kunci break
        switch (hari){
            case "pagi", "siang" -> System.out.println("Good Morning!");
            case "sore" -> System.out.println("Good Afternoon!");
            case "malam" -> System.out.println("Good Night!");
            default -> {
                System.out.println("Good Day!");
            }
        }

        System.out.println("");
        // Kata Kunci yield
        // Di Java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield
        // untuk mengembalikan nilai pada switch statement
        //Ini sangat mempermudah kita ketika butuh membuat data berdasarkan kondisi switch statement

        // Switch Tanpa yield
        String grade = "C";
        String ucapan;

        switch (grade){
            case "A" -> ucapan = "Anda lulus dengan sangat baik!";
            case "B", "C" -> ucapan = "Anda lulus!";
            case "D" -> ucapan = "Nice try!";
            default -> ucapan = "Coba lagi!";
        }
        System.out.println(ucapan);


        System.out.println("");
        // Switch Dengan yield
        String language = "swift";
        String goals = switch (language){
            case "java", "kotlin":
                yield "Android Developer";
            case "swift":
                yield "IOS Developer";
            case "js", "php":
                yield "Website Developer";
            case "python":
                yield "Data Engineer";
            default:
                yield "Anda belum memilih";
        };
        System.out.println(goals);
    }
}
