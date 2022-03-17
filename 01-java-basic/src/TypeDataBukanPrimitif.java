/**
 * Tipe data primitif adalah tipe bawaan di dalam bahasa pemrograman. Tipe data primitif tidak bisa diubah lagi
 * Tipe data number, char, boolean adalah tipe data primitif. Tipe data primitif selalu memiliki default value
 * Tipe data String bukan tipe data primitif, tipe data bukan primitif tidak memiliki default value, dan bisa bernilai null
 * Tipe data bukan primitif bisa memiliki method/function (yang akan dibahas nanti)
 * Di Java, semua tipe data primitif memiliki representasi tipe data bukan primitif nya
 * */
public class TypeDataBukanPrimitif {
    public static void main(String[] args) {
        // Type data buka primitif
        Integer thisIsInteger = 10;
        Long thisIsLong = 10L;
        Boolean thisIsBoolean = true;

        Short thisIsShort;
        thisIsShort = 100;

        System.out.println(thisIsShort);
    }
}
