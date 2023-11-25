package homework;

public class Main {
    public static void main(String[] args) {

        Phanso ps1 = new Phanso(5, 9);
        ps1 = ps1.RutGon();
        ps1.print();

        Phanso ps2 = new Phanso(5, 7);
        ps2.print();

        Phanso ps3 = ps1.cong(ps2);
        ps3.print();
        Sys

    }
}
