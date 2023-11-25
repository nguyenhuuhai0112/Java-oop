package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NguyenHuuHai_bt9tugiai {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = scanner.nextInt();

		// Tạo danh sách lưu trữ sinh viên
		ArrayList<Student> studentList = new ArrayList<>();

		// Nhập giá trị cho danh sách sinh viên
		for (int i = 0; i < n; i++) {
			System.out.println("Enter information for student " + (i + 1) + ":");
			System.out.print("Full name: ");
			String fullName = scanner.next();
			System.out.print("Age: ");
			int age = scanner.nextInt();
			System.out.print("Address: ");
			String address = scanner.next();
			System.out.print("Math score: ");
			double mathScore = scanner.nextDouble();
			System.out.print("Physical score: ");
			double physicalScore = scanner.nextDouble();
			System.out.print("Chemistry score: ");
			double chemistryScore = scanner.nextDouble();
			// Tạo một đối tượng sinh viên và thêm nó vào danh sách
			Student student = new Student(fullName, age, address, mathScore, physicalScore, chemistryScore);
			studentList.add(student);
		}

		// Sắp xếp học sinh theo thứ tự điểm trung bình tăng dần
		Collections.sort(studentList);

		// Hiển thị học sinh có điểm toán cao nhất
		Student highestMathScoreStudent = studentList.get(0);
		for (Student student : studentList) {
			if (student.getMathScore() > highestMathScoreStudent.getMathScore()) {
				highestMathScoreStudent = student;
			}
		}

		// Hiển thị tất cả học sinh có độ tuổi lớn hơn 23
		System.out.println("Students with age greater than 23:");
		for (Student student : studentList) {
			if (student.getAge() > 23) {
				System.out.println(student);
			}
		}
		// Tìm tất cả học sinh có họ "Huỳnh"
		System.out.println("Students with last name \"Huynh\":");
		for (Student student : studentList) {
			if (student.getFullName().startsWith("Huynh")) {
				System.out.println(student);
			}
		}
		// Hiển thị danh sách sinh viên có địa chỉ tại “Đà Nẵng”
		System.out.println("Students with addresses in \"Da Nang\":");
		for (Student student : studentList) {
			if (student.getAddress().equals("Da Nang")) {
				System.out.println(student);
			}
		}
	}
}

class Student implements Comparable<Student> {
	private String fullName;
	private int age;
	private String address;
	private double mathScore;
	private double physicalScore;
	private double chemistryScore;

	public Student(String fullName, int age, String address, double mathScore, double physicalScore,
			double chemistryScore) {
		this.fullName = fullName;
		this.age = age;
		this.address = address;
		this.mathScore = mathScore;
		this.physicalScore = physicalScore;
		this.chemistryScore = chemistryScore;
	}

	public String getFullName() {
		return fullName;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

	public double getMathScore() {
		return mathScore;
	}

	public double getPhysicalScore() {
		return physicalScore;
	}

	public double getChemistryScore() {
		return chemistryScore;
	}

	public double getAverageScore() {
		return (mathScore + physicalScore + chemistryScore) / 3;
	}

	@Override
	public int compareTo(Student otherStudent) {
		if (this.getAverageScore() < otherStudent.getAverageScore()) {
			return -1;
		} else if (this.getAverageScore() > otherStudent.getAverageScore()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Student{" + "fullName='" + fullName + '\'' + ", age=" + age + ", address='" + address + '\''
				+ ", mathScore=" + mathScore + ", physicalScore=" + physicalScore + ", chemistryScore=" + chemistryScore
				+ '}';
	}
}
