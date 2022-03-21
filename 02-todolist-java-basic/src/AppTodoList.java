public class AppTodoList {

   public static String[] model = new String[10];

    public static void main(String[] args) {
//      testShowTodoList();
//      testAddTodoList();
        testRemoveTodoList();
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
    public static boolean removeTodoList (Integer number){

        if (number-1 >= model.length ){
            return false;
        }else if (model[number-1] == null){
            return false;
        }else {
            model[number-1] = null;

            for (int i =(number-1); i < model.length; i++){
                if (i == (model.length-1)){
                    model[i] = null;
                }else{
                    model[i] = model[i+1];
                }
            }

            return true;
        }
    }

    // test remove
    public static void testRemoveTodoList (){
        addTodoList("Test 1");
        addTodoList("Test 2");
        addTodoList("Test 3");
        var result = removeTodoList(30);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);
        showTodoList();
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
