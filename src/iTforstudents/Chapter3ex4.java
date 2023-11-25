package iTforstudents;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter3ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so phan tu cua mang: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
			a[i] = sc.nextInt();
		}

		int sumOddPositive = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] > 0 && a[i] % 2 != 0) {
				sumOddPositive += a[i];
			}
		}
		System.out.println("Tong cac so duong le trong mang: " + sumOddPositive);

		System.out.print("Nhap phan tu k can tim kiem: ");
		int k = sc.nextInt();
		boolean foundK = false;
		for (int i = 0; i < n; i++) {
			if (a[i] == k) {
				System.out.println("Phan tu " + k + " xuat hien tai vi tri " + (i + 1));
				foundK = true;
			}
		}
		if (!foundK) {
			System.out.println("Phan tu " + k + " khong co trong mang.");
		}

		Arrays.sort(a);
		System.out.print("Mang sau khi sap xep tang dan: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();

		System.out.print("Nhap so can chen p: ");
		int p = sc.nextInt();
		int[] b = new int[n + 1];
		boolean inserted = false;
		for (int i = 0, j = 0; i < n + 1; i++, j++) {
			if (!inserted && (i == 0 || p < a[j])) {
				b[i] = p;
				inserted = true;
				j--;
			} else {
				b[i] = a[j];
			}
		}
		System.out.print("Mang sau khi chen " + p + ": ");
		for (int i = 0; i < n + 1; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}
}
