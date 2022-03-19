public class AppTodoList {

   public static String[] model = new String[10];

    public static void main(String[] args) {
//      testShowTodoList();
      testAddTodoList();
    }

    /**
     * Menampilkan ToDo List
     * */
    public static void showTodoList (){
        for (var i= 0; i< model.length; i++){
         var todo = model[i];
         var no = i+1;

         if (todo != null){
          System.out.println(no + ". " + todo);
         }
        }
    }
    public static void testShowTodoList (){
        model[0]= "Belajar Java Basic";
        model[1]= "Belajar Java OOP";
        model[2]= "Buat aplikasi todo list sederhana menggunakan java";
        showTodoList();
    }

    /**
     * Menambah ToDo ke List
     * */
    public static void addTodoList (String todo){
        var isFull = true;
        // cek model
        for (int i=0; i<model.length; i++){
            if (model[i] == null){
                //model masih ada yg kosong
                isFull= false;
                break;
            }
        }

        // jika penuh, kita resize ukuran array 2x lipat
        if (isFull){
            var temp = model;
            model = new String[model.length * 2];

            for (int i=0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        for (var i=0; i<model.length; i++){
            if (model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }
    public static void testAddTodoList(){
        for (int i=0; i< 20; i++){
            addTodoList("Test ke-"+i);
        }
        showTodoList();
    }
    /**
     * Menghapus ToDo dari List
     * */
    public static void removeTodoList (){

    }
    /**
     * Menampilkan view todo list
     * */
    public static void viewShowTodoList(){

    }
    /**
     * Menampilkan view add todo list
     * */
    public static void viewAddTodoList(){

    }
    /**
     * Menampilkan view remove todo list
     * */
    public static void viewRemoveTodoList(){

    }
}
