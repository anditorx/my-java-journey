/**
 * Method Variable Document
 * Kadang kita butuh mengirim data ke method sejumlah data yang tidak pasti
 * Biasanya, agar bisa seperti ini, kita akan menggunakan Array sebagai parameter di method tersebut
 * Namun di Java, kita bisa menggunakan variable argument, untuk mengirim data yang berisi jumlah tak tentu, bisa nol atau lebih
 * Parameter dengan tipe variable argument, hanya bisa ditempatkan di posisi akhir parameter
 * */
public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {60, 80, 70, 95, 70};
        average("Andi", values);
        average22("Andi", values);
    }

    // tanpa variable argument
    static void average(String name, int[] values){
        var total = 0;
        for (var value: values){
            total += value;
        }
        var finalValue = total/values.length;
        if (finalValue >= 75){
            System.out.println("Selamat "+name+", Anda lulus");
        }else{
            System.out.println("Maaf "+name+", Anda tidak lulus");
        }
    }

    // dengan variable argument
    static void average22(String name, int... values){
        var total = 0;
        for (var value: values){
            total += value;
        }
        var finalValue = total/values.length;
        if (finalValue >= 75){
            System.out.println("Selamat "+name+", Anda lulus");
        }else{
            System.out.println("Maaf "+name+", Anda tidak lulus");
        }
    }
}
