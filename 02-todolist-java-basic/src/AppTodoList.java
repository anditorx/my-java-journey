public class AppTodoList {

   public static String[] model = new String[10];
   public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
//      testShowTodoList();
//      testAddTodoList();
//      testRemoveTodoList();
//      testInput();
//      testViewShowTodoList();
//        testViewAddTodoList();
//        testViewRemoveTodoList();
        viewShowTodoList();
    }

    /**
     * Menampilkan ToDo List
     * */
    public static void showTodoList (){
        System.out.println("TODO LIST");
        for (var i= 0; i< model.length; i++){
         var todo = model[i];
         var no = i+1;

         if (todo != null){
          System.out.println(no + ". " + todo);
         }
        }
    }
//    public static void testShowTodoList (){
//        model[0]= "Belajar Java Basic";
//        model[1]= "Belajar Java OOP";
//        model[2]= "Buat aplikasi todo list sederhana menggunakan java";
//        showTodoList();
//    }

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
//    public static void testAddTodoList(){
//        for (int i=0; i< 20; i++){
//            addTodoList("Test ke-"+i);
//        }
//        showTodoList();
//    }
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
     * melakukan input todo
     * */
    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }
    public static void testInput(){
       var name = input("Nama");
       var prodi = input("Prodi");

        System.out.println("Hi "+ name);
       System.out.println("Selamat datang di keluarga besar "+ prodi);
    }
    /**
     * Menampilkan view todo list
     * */
    public static void viewShowTodoList(){
        while (true){
            showTodoList();
            System.out.println("MENU : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            var input = input("PILIH");
            if (input.equals("1")){
                viewAddTodoList();
            }else if(input.equals("2")){
                viewRemoveTodoList();
            }else if(input.equals("3")){
                break;
            }else{
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }
    public static void testViewShowTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        viewShowTodoList();
    }
    /**
     * Menampilkan view add todo list
     * */
    public static void viewAddTodoList(){
        System.out.println("TAMBAH TODO LIST");
        var todo = input("Todo (x Jika Batal)");
        if (todo.equals("x")){
            // batal
        }else{
            addTodoList(todo);
        }
    }
    public static void testViewAddTodoList(){

        viewAddTodoList();
        showTodoList();
    }
    /**
     * Menampilkan view remove todo list
     * */
    public static void viewRemoveTodoList(){
        System.out.println("HAPUS TODO LIST");
        var number = input("Nomor yang di hapus (x Jika Batal)");

        if (number.equals("x")){
            //batal
        }else {
            boolean success = removeTodoList(Integer.valueOf(number));
            if (!success){
                System.out.println("Gagal menghapus todolist : "+number);
            }
        }

    }
    public static void testViewRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");

        showTodoList();

        viewRemoveTodoList();
        showTodoList();
    }
}
