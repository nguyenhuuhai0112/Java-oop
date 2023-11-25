package homework;

public class Phanso {
    public int TuSo;

    public int MauSo;

    public Phanso(int t, int m) {
        this.TuSo = t;
        this.MauSo = m;
    }

    public Phanso() {

    }

    public void print() {
        System.out.println(this.TuSo + "/" + this.MauSo);
    }

    private int UocSoChungLonNhat(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return UocSoChungLonNhat(y, x % y);
        }
    }

    public Phanso RutGon() {
        Phanso ketqua = new Phanso();

        int uscln = UocSoChungLonNhat(this.TuSo, this.MauSo);

        ketqua.TuSo = this.TuSo / uscln;
        ketqua.MauSo = this.MauSo / uscln;

        return ketqua;
    }

    public Phanso cong(Phanso ps) {
        Phanso kq = new Phanso();
        if (this.MauSo == ps.MauSo) {
            kq.TuSo = this.TuSo + ps.TuSo;
            kq.MauSo = this.MauSo;
        } else {
            kq.TuSo = (this.TuSo * ps.MauSo) + (ps.TuSo * this.MauSo);
            kq.MauSo = this.MauSo * ps.MauSo;
        }
        return kq;
    }
}
