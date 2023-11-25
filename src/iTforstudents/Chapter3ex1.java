package iTforstudents;

import java.util.*;

public class Chapter3ex1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap chieu cao tam giac: ");
	int n = sc.nextInt();
	for(int i = 1;i<=n;i++)
	{
		for (int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
