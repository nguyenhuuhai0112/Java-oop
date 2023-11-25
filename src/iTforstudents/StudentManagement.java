package iTforstudents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", gpa=" + gpa + "]";
    }
}

public class StudentManagement {
    private static ArrayList<Student> studentList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("****************************************");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Cập nhật thông tin sinh viên theo id");
            System.out.println("3. Xóa sinh viên theo id");
            System.out.println("4. Sắp xếp sinh viên theo tên");
            System.out.println("5. Hiển thị danh sách sinh viên");
            System.out.println("0. Kết thúc chương trình");
            System.out.println("****************************************");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Đã kết thúc chương trình");
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    removeStudent();
                    break;
                case 4:
                    sortStudentsByName();
                    break;
                case 5:
                    displayStudents();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        } while (choice != 0);
    }

    public static void addStudent() {
        System.out.print("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear the input buffer
        System.out.print("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.print("Nhập điểm trung bình: ");
        double gpa = scanner.nextDouble();

        studentList.add(new Student(id, name, age, address, gpa));
        System.out.println("Thêm sinh viên thành công.");
    }

    public static void updateStudent() {
        System.out.print("Nhập id sinh viên cần cập nhật thông tin: ");
        int id = scanner.nextInt();
        boolean isUpdated = false;
        for (Student student : studentList) {
            if (student.getId() == id) {
                scanner.nextLine(); // Clear the input buffer
                System.out.print("Nhập tên mới: ");
                String name = scanner.nextLine();
                student.setName(name);
                System.out.print("Nhập tuổi mới: ");
                int age = scanner.nextInt();
                student.setAge(age);
                scanner.nextLine(); // Clear the input buffer
                System.out.print("Nhập địa chỉ mới: ");
                String address = scanner.nextLine();
                student.setAddress(address);
                System.out.print("Nhập điểm trung bình mới: ");
                double gpa = scanner.nextDouble();
                student.setGpa(gpa);
                isUpdated = true;
                break;
            }
        }
        if (isUpdated) {
            System.out.println("Cập nhật thông tin sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên với id đã nhập.");
        }
    }

    public static void removeStudent() {
        System.out.print("Nhập id sinh viên cần xóa: ");
        int id = scanner.nextInt();
        boolean isRemoved = false;
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                isRemoved = true;
                break;
            }
        }
        if (isRemoved) {
            System.out.println("Xóa sinh viên thành công.");
        } else {
            System.out.println("Không tìm thấy sinh viên với id đã nhập.");
        }
    }

    public static void sortStudentsByName() {
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getName().compareTo(student2.getName());
            }
        });
        System.out.println("Sắp xếp sinh viên theo tên thành công.");
    }

    public static void displayStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}


