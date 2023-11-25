//pham vi truy vap 4 loai;
//Private
//dèault
//protected : có thể truy cập từ trong và ngoài package nhưng  phaỉ thông qua tính kế thừa
//public: Có thể truy cập từ bất kỳ class hoặc object nào

package HDTforbeginer;

import java.util.Scanner;

public class PVtruycap {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap Ho va Ten cua ban: ");
       String name = sc.nextLine();
       System.out.println("nhap tuoi cua ban: ");
       int age = sc.nextInt();
       System.out.println("nhap vao diem thi cua ban: ");
       float diemthi = sc.nextFloat();
       System.out.println("__________________");
       System.out.println("ho va ten cua ban la: "+ name);
       System.out.println("tuoi cua ban la: " +age);
       System.out.println("diem thi cua ban la: "+ diemthi);
       sc.close();
    }
}
