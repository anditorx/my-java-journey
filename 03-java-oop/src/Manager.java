/**
 * INHERITANCE
 * Inheritance atau pewarisan adalah kemampuan untuk menurunkan sebuah class ke class lain
 * Dalam artian, kita bisa membuat class Parent dan class Child
 * Class Child, hanya bisa punya satu class Parent, namun satu class Parent bisa punya banyak class Child
 * Saat sebuah class diturunkan, maka semua field dan method yang ada di class Parent, secara otomatis akan dimiliki oleh class Child
 * Untuk melakukan pewarisan, di class child, kita harus menggunakan kata kunci extends lalu diikuti dengan nama class parent nya.
 * */
public class Manager {
    String name;

    void sayHello (String name){
        System.out.println("Hello "+name+ ", my name is "+this.name);
    }
}
