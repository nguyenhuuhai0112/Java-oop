package iTforstudents;

public class Student {

	    private String name;
	    private int age;
	    private String address;
	    private double mathScore;
	    private double physicsScore;
	    private double chemistryScore;

	    public Student(String name, int age, String address, double mathScore, double physicsScore, double chemistryScore) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	        this.mathScore = mathScore;
	        this.physicsScore = physicsScore;
	        this.chemistryScore = chemistryScore;
	    }

	    public double calculateAverageScore() {
	        return (mathScore + physicsScore + chemistryScore) / 3;
	    }

	    public void displayInformation() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println("Math Score: " + mathScore);
	        System.out.println("Physics Score: " + physicsScore);
	        System.out.println("Chemistry Score: " + chemistryScore);
	        System.out.println("Average Score: " + calculateAverageScore());
	    }

	    public static void main(String[] args) {
	        Student student = new Student("John Doe", 18, "123 Main Street", 8.5, 7.9, 9.2);
	        student.displayInformation();
	    }
	}


