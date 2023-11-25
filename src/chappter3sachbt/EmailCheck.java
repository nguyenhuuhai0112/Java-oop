package chappter3sachbt;

import java.util.Scanner;

public class EmailCheck {
    public static void check(String str) throws EmailAddressException {
        int place = str.indexOf('@');
        if (place == -1) {
            throw new EmailAddressException("khong co '@");
        }
        if (place == 0) {
            throw new EmailAddressException("khong hop le do '@' o vi tri dau");
        }
        place = str.indexOf('@', place + 1);
        if (place != -1) {
            throw new EmailAddressException("khong hop le do co hon 1 '@'");
        }
        System.out.println("dia chi email hop le");
    }

    public static void main(String[] args) {
        try {
            Scanner kb = new Scanner(System.in);
            System.err.println("Nhap dia chi email: ");
            String email = kb.nextLine();
            check(email);
        } catch (EmailAddressException e) {
            System.out.println(e.getMessage());
        }
    }

}
