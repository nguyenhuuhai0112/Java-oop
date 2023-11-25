package HDTforbeginer;

import HDTforbeginer.mypack.Person;

public class Helloworld {
    public static void main(String[] args) {
    Person a = new Person("Nguyen Huu Hai",18,1.65f);
    
    // a.name = "Nguyen Huu Hai ";
    // a.age = 18;  
    // a.eat("rice");.
    // int age = a.getAge(); //tinhs ddongs gois
    a.eat("rice"); 

    int age = a.getAge();
    System.out.println("His age: "+ age);
    

    }
}
