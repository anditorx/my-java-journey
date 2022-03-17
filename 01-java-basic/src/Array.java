/**
 * Array adalah tipe data yang berisikan kumpulan data dengan tipe yang sama
 * Jumlah data di Array tidak bisa berubah setelah pertama kali dibuat
 * */
public class Array {
    public static void main(String[] args) {
        String[] thisIsArray;
        thisIsArray = new String[5];
        thisIsArray[0] = "Andi";
        thisIsArray[1] = "Budi";
        thisIsArray[2] = "Regi";
        thisIsArray[3] = "Jenny";
        thisIsArray[4] = "Lisa";


        int panjangArray = thisIsArray.length;
        System.out.println("Panjang array = " + panjangArray);
        System.out.println(thisIsArray[3]);

        System.out.println("");

        // Array Initializer
        int[] arrayInt = new int[]{
                12,11,3,8,2
        };

        int [] arrayIntDua = {
                8,10,9,2
        };

        System.out.println(arrayInt[0]);
        System.out.println(arrayIntDua[2]);

        // Operasi Array
        arrayInt[0] = 100;
        System.out.println(arrayInt[0]);

        System.out.println("");

        // Array di dalam array
        String[][] members = {
                {"Budi", "Gerry", "Andi"},
                {"Jenny", "Lisa", "Claudia"},
                {"Jonny", "Joko", "Agus"}
        };
        String[] member1 = members[0];
        String member1Terakhir = members[0][2];
        System.out.println(member1Terakhir);
    }
}
