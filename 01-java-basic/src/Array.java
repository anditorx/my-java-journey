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
        System.out.println(panjangArray);
        System.out.println(thisIsArray[3]);
    }
}
