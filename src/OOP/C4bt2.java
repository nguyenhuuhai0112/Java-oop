package OOP;

import java.util.*;

public class C4bt2 {

	public static int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("str: ");
		str = sc.next();
		int count = countVowels(str);
		System.out.println("Number of vowels: " + count);
	}
}
