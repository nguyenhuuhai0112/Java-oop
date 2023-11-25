package test;

import java.awt.Point;

public class bttest {
    public static void main(String[] args) {
        try {
            System.out.println("goi phuong thuc methodeX()");
            methodeX();
        } catch (Exception e) {
            System.out.println("co loi trong khoi try!");
        }
        System.out.println("co loi");

    }

    public static void methodeX() {
        Point[] pts = new Point[10];
        for (int i = 0; i <= pts.length; i++) {
            pts[i].x = i;
            pts[i].y = i + 1;
        }

    }

}
