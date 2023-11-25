package iTforstudents;

import java.util.*;

public class Chapter3ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap chuoi S: ");
		String s = sc.nextLine();

		StringBuilder reverseSBuilder = new StringBuilder(s).reverse();
		String reverseS = reverseSBuilder.toString();
		System.out.println("Chuoi dao nguoc cua S: " + reverseS);

		String upperS = s.toUpperCase();
		System.out.println("Chuoi S in hoa: " + upperS);

		String lowerS = s.toLowerCase();
		System.out.println("Chuoi S in thuong: " + lowerS);

		int n, m;
		do {
			System.out.print("Nhap vi tri bat dau n: ");
			n = sc.nextInt();
			System.out.print("Nhap vi tri ket thuc m: ");
			m = sc.nextInt();
			if (n < 1 || m > s.length() || n >= m) {
				System.out.println("Vi tri nhap vao khong hop le!");
			}
		} while (n < 1 || m > s.length() || n >= m);
		String subS = s.substring(n - 1, m);
		System.out.println("Chuoi con cua S tu vi tri " + n + " den vi tri " + m + ": " + subS);
	}
}
