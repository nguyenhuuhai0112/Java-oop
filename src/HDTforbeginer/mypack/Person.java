package HDTforbeginer.mypack;

public class Person {
    public String name;
    public int age;
    public float height;

    public Person(String name, int age , float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void eat(String foodname){
        System.out.println(name +" is eating "+foodname);
    }

    public int getAge(){
        return age;
    }
}
