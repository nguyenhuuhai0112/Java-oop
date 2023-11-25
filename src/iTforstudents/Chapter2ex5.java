package iTforstudents;

public class Chapter2ex5 {
	public class Student {
	    private String name;
	    private int age;
	    private String address;
	    private double[] scores;

	    public Student(String name, int age, String address, double[] scores) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	        this.scores = scores;
	    }

	    public double getAverageScore() {
	        double sum = 0;
	        for (double score : scores) {
	            sum += score;
	        }
	        return sum / scores.length;
	    }

	    public void displayInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	        System.out.println("Average score: " + getAverageScore());
	    }
	}
}
