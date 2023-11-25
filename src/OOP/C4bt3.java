package OOP;

import java.util.*;

public class C4bt3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		int count = countWords(str);
		System.out.println("Number of words: " + count);
	}

	public static int countWords(String str) {
		int count = 0;
		boolean isWord = false;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				isWord = true;
			} else if (isWord) {
				count++;
				isWord = false;
			}
		}
		if (isWord) {
			count++;
		}
		return count;

	}
}
