package iTforstudents;

import java.util.*;

public class Chapter3ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap mot ky tu: ");
		String input = sc.nextLine().toLowerCase();
		if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
			System.out.println("Ky tu nhap vao khong hop le!");
		} else {
			char c = input.charAt(0);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println("Ky tu nhap vao la nguyen am.");
			} else {
				System.out.println("Ky tu nhap vao la phu am.");
			}
		}
	}
}
