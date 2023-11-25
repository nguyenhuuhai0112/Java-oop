package iTforstudents;
     import java.util.*;
public class nguyenhuuhai_23ns024_baitap2 {
     public static void main(String[] args) {
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

