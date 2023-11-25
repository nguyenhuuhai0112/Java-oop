package HDTforbeginer.mypack;

import java.util.*;

class AgeException extends Exception {

    public AgeException(String message) {
        super(message);
    }
}

public class C3tugiai1 {
    public static void main(String[] args) {
        try {

            int age = enterAge();

            System.out.println("Tuoi cua ban la: " + age);
        } catch (AgeException e) {

            System.out.println("Loi: " + e.getMessage());
        }
    }

    private static int enterAge() throws AgeException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi cua ban: ");
        int age = sc.nextInt();

        if (age <= 0 || age >= 100) {

            throw new AgeException("Gia tri tuoi khong hop le!");
        }

        return age;
    }
}
