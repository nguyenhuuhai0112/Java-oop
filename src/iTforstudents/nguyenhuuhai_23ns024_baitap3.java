package iTforstudents;
 import java.util.*;
public class nguyenhuuhai_23ns024_baitap3 {
	    public static void main(String[] args) {    	
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        {
	            System.out.println("+---------------------------------------------------+");
	            System.out.println("|                      MENU                         |");
	            System.out.println("+---------------------------------------------------+");
	            System.out.println("| 1. Giải phương trình bậc nhất                      |");
	            System.out.println("| 2. Giải phương trình bậc hai                       |");
	            System.out.println("| 3. Tính tiền điện                                  |");
	            System.out.println("| 4. Kết thúc                                        |");
	            System.out.println("+---------------------------------------------------+");
	            System.out.print("Chọn chức năng (1-4): ");
	            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    giaiPTB1();
	                    break;
	                case 2:
	                    giaiPTB2();
	                    break;
	                case 3:
	                    tinhTienDien();
	                    break;
	                case 4:
	                    System.out.println("Kết thúc chương trình");
	                    break;
	                default:
	                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
	            }
	        } while (choice != 4);
	    }
	    public static void giaiPTB1() {
	    	        Scanner sc = new Scanner(System.in);

	    	        System.out.print("Nhập hệ số a: ");
	    	        double a = sc.nextDouble();

	    	        System.out.print("Nhập hệ số b: ");
	    	        double b = sc.nextDouble();

	    	        if (a == 0) {
	    	            if (b == 0) {
	    	                System.out.println("Phương trình có vô số nghiệm");
	    	            } else {
	    	                System.out.println("Phương trình vô nghiệm");
	    	            }
	    	        } else {
	    	            double x = -b / a;
	    	            System.out.println("Phương trình có nghiệm duy nhất: x = " + x);
	    	        }
	    }
	    public static void giaiPTB2() {
	    	        Scanner sc= new Scanner(System.in);

	    	        System.out.print("Nhập hệ số a: ");
	    	        double a = sc.nextDouble();

	    	        System.out.print("Nhập hệ số b: ");
	    	        double b = sc.nextDouble();

	    	        System.out.print("Nhập hệ số c: ");
	    	        double c = sc.nextDouble();
	    	        double delta = b * b - 4 * a * c;
	    	        if (delta < 0) {
	    	            System.out.println("Phương trình vô nghiệm");
	    	        } else if (delta == 0) {
	    	            double x = -b / (2 * a);
	    	            System.out.println("Phương trình có nghiệm kép: x = " + x);
	    	        } else {
	    	            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	    	            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	    	            System.out.println("Phương trình có hai nghiệm phân biệt:");
	    	            System.out.println("x1 = " + x1);
	    	            System.out.println("x2 = " + x2);
	    	        }
	    	    }
	    public static void tinhTienDien() {
	    	 Scanner sc = new Scanner(System.in);
	         System.out.print("Nhập số điện sử dụng trong tháng: ");
	         int soDien = sc.nextInt();
	         int tien;
	         if (soDien < 50) {
	             tien = soDien * 1000;
	         } else {
	             tien = 50 * 1000 + (soDien - 50) * 1200;
	         }
	         System.out.println("Tiền điện trong tháng là: " + tien + " đồng");
	    }
	}


