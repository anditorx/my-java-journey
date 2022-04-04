/**
 * Object adalah hasil instansiasi dari sebuah class
 * Untuk membuat object kita bisa menggunakan kata kunci new, dan diikuti dengan nama Class dan kurung ()
 * */
public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person();
        var person2 = new Person();
        var person3 = new Person();

        person1.name = "Andito";
        person1.address = "Jakarta";

        System.out.println(person1.name);
        System.out.println(person1.address);
    }
}
