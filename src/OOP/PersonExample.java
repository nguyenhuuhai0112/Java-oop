package OOP;

import iTforstudents.Person;
import iTforstudents.Teacher;

public class PersonExample {
	class Person {
		private String ten;
		private int tuoi;
		private String diaChi;

		public Person(String ten, int tuoi, String diaChi) {
			this.ten = ten;
			this.tuoi = tuoi;
			this.diaChi = diaChi;
		}

		public void hienThiThongTin() {
			System.out.println("Ten: " + ten);
			System.out.println("Tuoi: " + tuoi);
			System.out.println("Dia chi: " + diaChi);
		}
	}

	class Teacher extends Person {
		private String tenTruong;
		private String[] khoaHoc;

		public Teacher(String ten, int tuoi, String diaChi, String tenTruong, String[] khoaHoc) {
			super(ten, tuoi, diaChi);
			this.tenTruong = tenTruong;
			this.khoaHoc = khoaHoc;
		}

		public void hienThiThongTin() {
			super.hienThiThongTin();
			System.out.println("Ten truong: " + tenTruong);
			System.out.print("Khoa hoc: ");
			for (String khoaHoc : khoaHoc) {
				System.out.print(khoaHoc + " ");
			}
			System.out.println();
		}
	}

	public class PersonExample {
		public static void main(String[] args) {
			Person person = new Person("Nguyen Van An", 18, "Hue");
			person.hienThiThongTin();

			String[] khoaHoc = { "Toan", "Ly", "Hoa" };
			Teacher teacher = new Teacher("Duong Thi Thung", 34, "Quang Nam", "Dai hoc Khoa hoc Tu nhien", khoaHoc);
			teacher.hienThiThongTin();

		}

	}

}
