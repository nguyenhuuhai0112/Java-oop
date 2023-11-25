package NguyenHuuHai_23ns024;
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.println("Nhap so phan tu cua mang: ");
       int n = scanner.nextInt();
     
       int[] arr = new int[n];
    
       System.out.println("Nhap cac phan tu cua mang: ");
       for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt();
       }

       //a.Tính trung bình cộng các phần tử trong mảng
       double avg = 0;
       for (int i = 0; i < n; i++) {
           avg += arr[i];
       }
       avg /= n;
       System.out.println("trung binh cong cua cac phan tu la: "+avg);
       
       //b.Sắp xếp mảng tăng dần
       for (int i = 0; i < n - 1; i++) {
           for (int j = i + 1; j < n; j++) {
               if (arr[i] > arr[j]) {
                   int temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                   
               }
           }                
       }

       // c.In phần tử thứ 2 của mảng
       System.out.println("phan tu thu hai cua mang la: " + arr[1]);
   }

 }

