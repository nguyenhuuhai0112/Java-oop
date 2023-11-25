package OOP;

import java.util.*;

public class C4bt5 {
	
	    public static void main(String[] args) {
	        int[] factorials = new int[10];
	        for (int i = 1; i <= 10; i++) {
	            factorials[i - 1] = calculateFactorial(i);
	        }
	        for (int i = 9; i >= 0; i--) {
	            System.out.println("Factorial of " + (i + 1) + " is " + factorials[i]);
	        }
	    }

	    public static int calculateFactorial(int num) {
	        int factorial = 1;
	        while (num > 1) {
	            factorial *= num;
	            num--;
	        }
	        return factorial;
	    }
	}
