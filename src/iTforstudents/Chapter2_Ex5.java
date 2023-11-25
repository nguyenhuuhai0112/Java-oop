package iTforstudents;

public class Chapter2_Ex5 {
	private String name;
    private int age;
    private String address;
    private int[] marks;

    public void Student1(String name, int age, String address, int[] marks) 
    {
        this.name = name;
        this.age = age;
        this.address = address;
        this.marks = marks;
    }

    public double calculateAverage() 
    {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }

    public void displayInformation() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Average Mark: " + calculateAverage());
    }
    
    public static void main(String[] args)
    {
    int[] marks = { 8, 8, 9 };
    Student1 student = new Student1("Nguyen Van An", 18, "Hue", marks);
    student.displayInformation();
    }
}
