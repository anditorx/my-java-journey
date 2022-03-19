/**
 * For Loop
 * For adalah salah satu kata kunci yang bisa digunakan untuk melakukan perulangan
 * Blok kode yang terdapat di dalam for akan selalu diulangi selama kondisi for terpenuhi
 *
 * for(init statement; kondisi; post statement){
 *    // block perulangan
 * }
 * Init statement akan dieksekusi hanya sekali di awal sebelum perulangan
 * Kondisi akan dilakukan pengecekan dalam setiap perulangan, jika true perulangan akan dilakukan, jika false perulangan akan berhenti
 * Post statement akan dieksekusi setiap kali diakhir perulangan
 * Init statement, Kondisi dan Post Statement tidak wajib diisi, jika Kondisi tidak diisi, berarti kondisi selalu bernilai true
 * */

public class ForLoop {
    public static void main(String[] args) {
        // perulangan dengan kondisi
        var counter = 1;
        for (; counter <= 5;){
            System.out.println("Perulangan ke-"+counter);
            counter++;
        }


        System.out.println("");
        // Perulangan Dengan Init Statement
        for (var count = 1; count <= 5;){
            System.out.println("Perulangan ke-"+count);
            count++;
        }


        System.out.println("");
        // Perulangan Dengan Post Statement
        for (var i = 1; i<=5; i++){
            System.out.println("Perulangan ke-"+i);
        }

    }
}
