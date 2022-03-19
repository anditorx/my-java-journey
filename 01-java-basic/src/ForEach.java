/**
 * For Each
 * Kadang kita biasa mengakses data array menggunakann perulangan
 * Mengakses data array menggunakan perulangan sangat bertele-tele, kita harus membuat counter,
 * lalu mengakses array menggunakan counter yang kita buat
 * Namun untungnya, di Java terdapat perulangan for each, yang bisa digunakan untuk mengakses seluruh data di Array secara otomatis
 * */
public class ForEach {
    public static void main(String[] args) {
        String[] dummyArray = {
                "Andi", "Dian", "Karina", "Sebastian", "Joko", "Melvin"
        };

        // Tanpa For Each
        for (int i=0; i<= dummyArray.length-1; i++){
            System.out.println("data ke-"+i+" = "+dummyArray[i]);
        }

        System.out.println("");

        // dengan for each
        for(var value: dummyArray){
            System.out.println(value);
        }
    }
}
