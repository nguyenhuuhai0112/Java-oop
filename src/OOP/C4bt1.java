package OOP;

import java.util.Scanner;

public class C4bt1 {
	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("num1: ");
		num1 = sc.nextInt();
		System.out.println("num2: ");
		num2 = sc.nextInt();
		System.out.println("num3: ");
		num3 = sc.nextInt();
		int smallestNum = findSmallest(num1, num2, num3);

		System.out.println("The smallest number is: " + smallestNum);
	}

	public static int findSmallest(int num1, int num2, int num3) {
		int smallest = num1;

		if (num2 < smallest) {
			smallest = num2;
		}

		if (num3 < smallest) {
			smallest = num3;
		}

		return smallest;
	}

}
