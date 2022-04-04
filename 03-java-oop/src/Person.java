
public class Person {
    String name;
    String address;
    final String country = "Indonesia";


    Person (String paramName, String paramAddress){
        name = paramName;
        address = paramAddress;
    }

    void sayHi(String paramName){
        System.out.println("Hi "+ paramName + ", my name is "+name);
    }
}
