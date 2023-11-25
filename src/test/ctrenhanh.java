package test;

import java.util.Scanner;

public class ctrenhanh {
   

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int age;      
         age = sc.nextInt();
         if(age>18)
         {
            System.out.println("Ban da du tuoi!");
         } else
         {
            System.out.println("ban tuoi con ngang con!!!");
         }
    }
}
