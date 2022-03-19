/**
 * Recursive Method
 * Recursive method adalah kemampuan method memanggil method dirinya sendiri
 * Kadang memang ada banyak problem, yang lebih mudah diselesaikan menggunakan recursive method, seperti contohnya kasus factorial
 * */

public class RecursiveMethod {
    public static void main(String[] args) {
        // factorial loop
        System.out.println(factorialLoop(5));
        // factorial recursive
        System.out.println(recursive(5));
    }

    static int factorialLoop(int value){
      var res = 1;
      for (int i = 1; i<= value; i++){
          res *=i;
      }
      return  res;
    };

    static int recursive(int value){
       if (value ==1){
           return 1;
       }else {
           return value * recursive((value-1));
       }
    };
}
