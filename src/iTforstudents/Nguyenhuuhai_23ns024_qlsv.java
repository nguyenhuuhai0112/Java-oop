package iTforstudents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Nguyenhuuhai_23ns024_qlsv {

	class Student {
		private int id;
		private String name;
		private int age;
		private String address;
		private float gpa;

		public Student(int id, String name, int age, String address, float gpa) {
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

		public int getAge() {
			return age;
		}

		public String getAddress() {
			return address;
		}

		public float getGpa() {
			return gpa;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public void setGpa(float gpa) {
			this.gpa = gpa;
		}
	}

	public class StudentManagement {
		private ArrayList<Student> students;

		public StudentManagement() {
			students = new ArrayList<>();
		}

		public void addStudent(Student student) {
			students.add(student);
			System.out.println("Thêm sinh viên thành công!");
		}

		public void updateStudent(int id, String name, int age, String address, float gpa) {
			for (Student student : students) {
				if (student.getId() == id) {
					student.setName(name);
					student.setAge(age);
					student.setAddress(address);
					student.setGpa(gpa);
					System.out.println("Cập nhật thông tin sinh viên thành công!");
					return;
				}
			}
			System.out.println("Không tìm thấy sinh viên có id = " + id);
		}

		public void deleteStudent(int id) {
			for (Student student : students) {
				if (student.getId() == id) {
					students.remove(student);
					System.out.println("Xóa sinh viên thành công!");
					return;
				}
			}
			System.out.println("Không tìm thấy sinh viên có id = " + id);
		}

		public void sortStudentsByName() {
			Collections.sort(students, new Comparator<Student>() {
				public int compare(Student s1, Student s2) {
					return s1.getName().compareTo(s2.getName());
				}
			});
			System.out.println("Sắp xếp sinh viên theo tên thành công!");
		}

		public void displayStudents() {
			for (Student student : students) {
				System.out.println("ID: " + student.getId());
				System.out.println("Tên: " + student.getName());
				System.out.println("Tuổi: " + student.getAge());
				System.out.println("Địa chỉ: " + student.getAddress());
				System.out.println("Điểm trung bình: " + student.getGpa());
				System.out.println("--------------------");
			}
		}

		public static void main(String[] args) {
			StudentManagement manager = new StudentManagement();
			Scanner scanner = new Scanner(System.in);
			int choice;

			do {
				System.out.println("/****************************************/");
				System.out.println("1. Thêm sinh viên");
				System.out.println("2. Cập nhật thông tin sinh viên theo id");
				System.out.println("3. Xóa sinh viên theo id");
				System.out.println("4. Sắp xếp sinh viên theo tên");
				System.out.println("5. Hiển thị danh sách sinh viên");
				System.out.println("0. Kết thúc chương trình");
				System.out.println("/********************************/");
				System.out.print("Nhập lựa chọn của bạn: ");
				choice = scanner.nextInt();

				switch (choice) {
				case 1:
					System.out.print("Nhập id: ");
					int id = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Nhập tên: ");
					String name = scanner.nextLine();
					System.out.print("Nhập tuổi: ");
					int age = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Nhập địa chỉ: ");
					String address = scanner.nextLine();
					System.out.print("Nhập điểm trung bình: ");
					float gpa = scanner.nextFloat();

					Student student = new Student(id, name, age, address, gpa);
					manager.addStudent(student);
					break;
				case 2:
					System.out.print("Nhập id: ");
					int updateId = scanner.nextInt();
					scanner.nextLine();

					System.out.print("Nhập tên mới: ");
					String updateName = scanner.nextLine();
					System.out.print("Nhập tuổi mới: ");
					int updateAge = scanner.nextInt();
					scanner.nextLine();
					System.out.print("Nhập địa chỉ mới: ");
					String updateAddress = scanner.nextLine();
					System.out.print("Nhập điểm trung bình mới: ");
					float updateGpa = scanner.nextFloat();

					manager.updateStudent(updateId, updateName, updateAge, updateAddress, updateGpa);
					break;
				case 3:
					System.out.print("Nhập id sinh viên cần xóa: ");
					int deleteId = scanner.nextInt();
					manager.deleteStudent(deleteId);
					break;
				case 4:
					manager.sortStudentsByName();
					break;
				case 5:
					manager.displayStudents();
					break;
				case 0:
					System.out.println("Kết thúc chương trình.");
					break;
				default:
					System.out.println("Lựa chọn không hợp lệ.");
				}
			} while (choice != 0);

			scanner.close();
		}
	}

}
