package OOP;

import java.util.Scanner;

public class C4bt4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = sc.nextInt();
		int sum = calculateSum(num);
		System.out.println("Sum of digits: " + sum);
	}

	public static int calculateSum(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
