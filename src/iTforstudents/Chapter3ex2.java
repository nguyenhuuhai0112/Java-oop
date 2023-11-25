package iTforstudents;
import java.util.*;
public class Chapter3ex2 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Nhap so nguyen m: ");
	        int m = sc.nextInt();
	        int sum = 0;
	        int product = 1;
	        while (m > 0) {
	            int digit = m % 10;
	            sum += digit;
	            product *= digit;
	            m /= 10;
	        }
	        System.out.println("Tong cac chu so cua m: " + sum);
	        System.out.println("Tich cac chu so cua m: " + product);
	    }
	}


