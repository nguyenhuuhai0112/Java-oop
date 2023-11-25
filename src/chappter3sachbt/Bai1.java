package chappter3sachbt;

import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        try { // nhap chuoi so nguyen tu ban phim
            Scanner kb = new Scanner(System.in);
            System.out.println("nahp chuoi so nguyen: ");
            String str = kb.nextLine();
            /*
             * chuyển chuỗi snag số nguyên, nếu chuỗi khoong đúng định dạng, hàm páeint sẽ
             * phát ra một đối tượng biệt lệ
             */
            int num = Integer.parseInt(str);
            // hiển thị kết quả
            System.out.println(num);
        } catch (NumberFormatException e) {
            /*
             * neéu chuỗi nhâpj vào khoong đúng dịnh dạng, hàm parseint không chuyển sang
             * được sôs nguyên thì một đối tuoenjg lỗi NumberFormatException
             * được phát ra và khôid cacth năt slaay được thuẹc hiẹn
             */
            System.out.print("Không đúng định dạng số");

        }
    }

}
