package iTforstudents;

import java.util.Scanner;

public class baitaptinhbinhphuong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so chan n: ");
		int n;
		n = sc.nextInt();
		if (n % 2 == 0) {
			int square = n * n;
			System.out.println("Binh phuong cua " + n + " la " + square);
		} else {
			System.out.println(n + "khong phai la so chan");
		}

	}
}
