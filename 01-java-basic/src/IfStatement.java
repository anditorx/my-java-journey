/**
 * Dalam Java, if adalah salah satu kata kunci yang digunakan untuk percabangan
 * Percabangan artinya kita bisa mengeksekusi kode program tertentu ketika suatu kondisi terpenuhi
 * Hampir di semua bahasa pemrograman mendukung if expression
 * */

public class IfStatement {

    public static void main(String[] args) {
        int nilai = 80;
        int absen = 90;

        if (nilai >= 75 && absen >= 75){
            System.out.println("Anda lulus");
        }

//        Else Statement
//        Blok if akan dieksekusi ketika kondisi if bernilai true
//        Kadang kita ingin melakukan eksekusi program tertentu jika kondisi if bernilai false
//        Hal ini bisa dilakukan menggunakan else expression
        System.out.println("");
        int uas = 73;
        int uts = 90;

        if (uas >= 75 && uts >= 75){
            System.out.println("Anda lulus");
        }else {
            System.out.println("Gagal");
        }


        System.out.println("");
        int nAbsensi = 70;
        int nTugas = 90;

        if (nTugas >= 80 && nAbsensi >= 80){
            System.out.println("Nilai: A");
        }else if (nTugas >= 70 && nAbsensi >= 70){
            System.out.println("Nilai: B");
        }else if (nTugas >= 60 && nAbsensi >= 60){
            System.out.println("Nilai: C");
        }else if (nTugas >= 50 && nAbsensi >= 50){
            System.out.println("Nilai: D");
        }else{
            System.out.println("Nilai: E");
        }

    }
}
