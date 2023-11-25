package iTforstudents;
  import java.util.*;
public class nguyenhuuhai_23ns024_baitap1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Nhập hệ số a: ");
	        double a = sc.nextDouble();

	        System.out.print("Nhập hệ số b: ");
	        double b = sc.nextDouble();

	        System.out.print("Nhập hệ số c: ");
	        double c = sc.nextDouble();

	        if (a == 0) {
	            // Giải phương trình bậc nhất
	            if (b == 0) {
	                if (c == 0) {
	                    System.out.println("Phương trình có vô số nghiệm");
	                } else {
	                    System.out.println("Phương trình vô nghiệm");
	                }
	            } else {
	                double x = -c / b;
	                System.out.println("Phương trình có nghiệm duy nhất: x = " + x);
	            }
	        } else {
	            // Giải phương trình bậc hai
	            double delta = b * b - 4 * a * c;
	            if (delta < 0) {
	                System.out.println("Phương trình vô nghiệm");
	            } else if (delta == 0) {
	                double x = -b / (2 * a);
	                System.out.println("Phương trình có nghiệm kép: x = " + x);
	            } else {
	                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	                System.out.println("Phương trình có 2 nghiệm phân biệt:");
	                System.out.println("x1 = " + x1);
	                System.out.println("x2 = " + x2);
	            }
	        }
	    }
	}
