/*xây dựng lớp PINExceptionn biểu diễn lỗi định dạng số PIN(giả sử định dạng số pin hợp lệ là chuỗi có 4 kí tự). 
viết chương trình nhập chuỗi và thông báo lỗi nếu nhập không đúng định dạng số PIN. Gợi ý : sử dụng biểu thức chính quy có dạng : ^-?\\d+$ */

package chapter3tugiai;

import java.util.Scanner;

public class NguyenHuuHai_23ns024_bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số PIN: ");
        String pin = sc.nextLine();

        try {
            validatePIN(pin);
            System.out.println("so PIN hop le!");
        } catch (PINException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }

    public static void validatePIN(String pin) throws PINException {
        if (!pin.matches("^\\d{4}$")) {
            throw new PINException("So PIN không dung dinh dang!");
        }
    }
}

class PINException extends Exception {
    public PINException(String message) {
        super(message);
    }
}
