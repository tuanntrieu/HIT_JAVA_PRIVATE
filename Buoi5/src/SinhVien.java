import java.util.Scanner;

public class SinhVien {
    private static Scanner sc = new Scanner(System.in);
    public int count = 0;
    private int maSV;
    private String hoTen;
    private String diaChi;
    private int SDT;
    private float diemSo;

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public void setDiemSo(float diemSo) {
        this.diemSo = diemSo;
    }

    public int getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public float getDiemSo() {
        return diemSo;
    }

    public SinhVien() {
        maSV = 0;
        hoTen = "No Name";
        diaChi = "No Address";
        SDT = 0;
        diemSo = 0;
    }

    public SinhVien(int maSV, String hoTen, String diaChi, int SDT, float diemSo) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
        this.diemSo = diemSo;
    }

    public String toString() {
        return String.format("%-10d %-20s %20s %20s %15f", maSV, hoTen, diaChi, SDT, diemSo);
    }

    public void input() {
        setMaSV(++count);
        System.out.print("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Dia Chi: ");
        setDiaChi(sc.nextLine());
        System.out.print("So Dien Thoai: ");
        setSDT(sc.nextInt());
        System.out.print("Diem so: ");
        setDiemSo(sc.nextFloat());
        sc.nextLine();
    }

}