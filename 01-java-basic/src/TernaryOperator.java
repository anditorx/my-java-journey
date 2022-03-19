/**
 * Ternary Operator
 * Ternary operator adalah operator sederhana dari if statement
 * Ternary operator terdiri dari  kondisi yang dievaluasi,
 * jika menghasilkan true maka nilai pertama diambil, jika false, maka nilai kedua diambil
 *
 * */

public class TernaryOperator {
    public static void main(String[] args) {
        var nilai = 75;
        String result;

        // tanpa ternary operator
        if (nilai >= 75){
            result = "Anda lulus";
        }else {
            result = "Coba lagi!";
        }
        System.out.println(result);

        System.out.println("");


        // dengan ternary operator
        result = nilai >= 75 ? "Anda lulus!" : "Coba lagi!";
        System.out.println(result);
    }
}
