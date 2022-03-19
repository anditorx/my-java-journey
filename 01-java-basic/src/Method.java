/**
 * Method
 * Method adalah block kode program yang akan berjalan saat kita panggil
 * Sebelumnya kita sudah menggunakan method println() untuk menampilkan tulisan di console
 * Untuk membuat method di Java, kita bisa menggunakan kata kunci void, lalu diikuti dengan nama method, kurung () dan diakhiri dengan block
 * Kita bisa memanggil method dengan menggunakan nama method lalu diikuti dengan kurung ()
 * Di bahasa pemrograman lain, Method juga disebut dengan Function
 * */
public class Method {
    public static void main(String[] args) {
        sayHello();
        // method parameter
        studentName("Joko", "Susillo");
        // method return value
        var testMethodReturne = sum(10,2);
        System.out.println(testMethodReturne);
    }
    static void sayHello(){
        System.out.println("Helo World");
    }
    static void studentName(String firstName, String lastName){
        System.out.println("Hello "+firstName+" "+lastName);
    }

    static int sum(int num1, int num2){
        var total = num1 + num2;
        return total;
    }
}
