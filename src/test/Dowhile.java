package test;
import java.util.*;
public class Dowhile {
    public static void main(String[] args) {     
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         do {
            System.out.println("hello");
            n++;
        } while(n<10);
    }
}
