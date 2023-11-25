package iTforstudents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Nguyenhuuhai_23ns024_task1 {
	public static void main(String[] args) {

	class Student {
		private int id;
		private String name;
		private int age;
		private String address;
		private double gpa;

		public Student(int id, String name, int age, String address, double gpa) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.address = address;
			this.gpa = gpa;
		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public void displayInformation() {
			System.out.println("ID: " + id);
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println("Address: " + address);
			System.out.println("GPA: " + gpa);
		}
	}

	class StudentManagement {
		private ArrayList<Student> students;

		public StudentManagement() {
			students = new ArrayList<>();
		}

		public void addStudent() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter student ID: ");
			int id = scanner.nextInt();
			System.out.print("Enter student name: ");
			scanner.nextLine();
			String name = scanner.nextLine();
			System.out.print("Enter student age: ");
			int age = scanner.nextInt();
			System.out.print("Enter student address: ");
			scanner.nextLine();
			String address = scanner.nextLine();
			System.out.print("Enter student GPA: ");
			double gpa = scanner.nextDouble();

			Student student = new Student(id, name, age, address, gpa);
			students.add(student);
		}

		public void updateStudent() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter student ID to update: ");
			int id = scanner.nextInt();

			boolean isFound = false;
			for (Student student : students) {
				if (student.getId() == id) {
					System.out.print("Enter new student name: ");
					scanner.nextLine();
					String name = scanner.nextLine();
					System.out.print("Enter new student age: ");
					int age = scanner.nextInt();
					System.out.print("Enter new student address: ");
					scanner.nextLine();
					String address = scanner.nextLine();
					System.out.print("Enter new student GPA: ");
					double gpa = scanner.nextDouble();

					student = new Student(id, name, age, address, gpa);
					isFound = true;
					break;
				}
			}

			if (!isFound) {
				System.out.println("Student not found!");
			}
		}

		public void removeStudent() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Enter student ID to remove: ");
			int id = scanner.nextInt();

			boolean isRemoved = students.removeIf(student -> student.getId() == id);

			if (!isRemoved) {
				System.out.println("Student not found!");
			}
		}

		public void sortStudentsByName() {
			Collections.sort(students, Comparator.comparing(Student::getName));
		}

		public void displayStudents() {
			for (Student student : students) {
				student.displayInformation();
				System.out.println();
			}
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			StudentManegement studentMegement = new StudentMegement();

			while (true) {
				System.out.println("1. Add Student");
				System.out.println("2. Update Student Information");
				System.out.println("3. Remove Student");
				System.out.println("4. Sort Students By Name");
				System.out.println("5. Display Students");
				System.out.println("0. Exit");
				System.out.print("Enter your choice: ");
				int choice = scanner.nextInt();

				switch (choice) {
				case 1:
					studentManagement.addStudent();
					break;
				case 2:
					studentManagement.updateStudent();
					break;
				case 3:
					studentManagement.removeStudent();
					break;
				case 4:
					studentManagement.sortStudentsByName();
					break;
				case 5:
					studentManagement.displayStudents();
					break;
				case 0:
					System.exit(0);
				default:
					System.out.println("Invalid choice!");
					break;
				}
			}
		}
	}

}
}