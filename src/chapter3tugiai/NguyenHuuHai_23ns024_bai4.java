package chapter3tugiai;
import java.util.*;

public class NguyenHuuHai_23ns024_bai4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so đien thoai: ");
        String phoneNumber = sc.nextLine();

        try {
            validatePhoneNumber(phoneNumber);
            System.out.println("So đien thoai hop le!");
        } catch (PhoneException e) {
            System.out.println("Loi: " + e.getMessage());
        }
    }

    public static void validatePhoneNumber(String phoneNumber) throws PhoneException {
        if (phoneNumber.length() != 10) {
            throw new PhoneException("So đien thoai phai co 10 chu so!");
        }
        if (!phoneNumber.startsWith("0")) {
            throw new PhoneException("So đien thoai phai bat đau bang so 0!");
        }
        try {
            int number = Integer.parseInt(phoneNumber);
            if (number < 0) {
                throw new PhoneException("So đien thoai khong đưac am!");
            }
        } catch (NumberFormatException e) {
            throw new PhoneException("So đien thoai khong hop le!");
        }
    }
}

class PhoneException extends Exception {
    public PhoneException(String message) {
        super(message);
    }
}


