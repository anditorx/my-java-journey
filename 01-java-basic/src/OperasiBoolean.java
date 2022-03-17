/**
 * Jika OR maka keduanya harus dalam kondisi benar atau salah (sama)
 * Jija and atau &&, apabila salah satunya bernilai true atau false maka benar
 * */
public class OperasiBoolean {
    public static void main(String[] args) {
        int absenMasuk = 14;
        int nilaiTugas = 75;

        boolean lulusAbsen = absenMasuk > 12;
        boolean lulusTugas = nilaiTugas >= 75;

        boolean lulus = lulusAbsen && lulusTugas;
        System.out.println(lulus);
    }
}
