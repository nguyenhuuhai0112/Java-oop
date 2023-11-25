package chappter3sachbt;

import java.util.Scanner;

public class CheckNumber {
    public static void CheckNumber(String s) throws UnsignedIntegerException {
        String numReg = "^\\d+$";
        Boolean b = s.matches(numReg);
        if (b == false)
            throw new UnsignedIntegerException("dinh fang chuoi so nguyen khong hop le! ");
    }

}

 public static void main(String args[]) {
        try {
            Scanner kb = new Scanner(System.in);
            System.out.println("Nhap vao mot chuoi so nguyen duong:");
            String numStr = kb.nextLine();
            CheckNumber(numStr);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
