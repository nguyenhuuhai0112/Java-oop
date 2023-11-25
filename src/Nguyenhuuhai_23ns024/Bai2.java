//Nguyen Huu Hai 23ns024
package NguyenHuuHai_23ns024;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho Va Ten Nhan Vien: ");
        String name = sc.nextLine();
        System.out.print("Nhap so tuoi cua nhan vien: ");
        int age = sc.nextInt();
        System.out.print("Nhap dia chi cua nhan vien: ");
        String address = sc.nextLine();
        System.out.println("Nhap so dien thoai cua nhan vien: ");
        long phoneNumber = sc.nextLong();

        System.out.println("Ho Va Ten nhan vien la: "+name);
        System.out.println("tuoi nhan vien la: "+age);
        System.out.println("dia chi nhan vien la: "+address);
        System.out.println("so dien thoai nhan vien la: "+phoneNumber);
    }
}
