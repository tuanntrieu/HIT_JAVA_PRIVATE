import java.util.Scanner;

public class NhanVien {
    private int id;
    private String hoTen;
    private String kieuNhanVien;
    private int soNgayLam;
    private int namVaoLam;
    private int phuCap;
    private int luong;

    private Scanner sc = new Scanner(System.in);

    public NhanVien() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setKieuNhanVien(String kieuNhanVien) {
        this.kieuNhanVien = kieuNhanVien;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public void setNamVaoLam(int namVaoLam) {
        this.namVaoLam = namVaoLam;
    }

    public void setPhuCap(int phuCap) {
        phuCap = 100000+(2022 - namVaoLam)*200000;
        this.phuCap = phuCap;
    }

    public void setLuong(int luong) {
        int mucLuong = 0;
        if (kieuNhanVien.compareToIgnoreCase("san xuat") == 0)
            mucLuong = 350000;
        else if (kieuNhanVien.compareToIgnoreCase("van phong") == 0)
            mucLuong = 400000;

        luong = soNgayLam * mucLuong;
        this.luong = luong;
    }

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getKieuNhanVien() {
        return kieuNhanVien;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public int getNamVaoLam() {
        return namVaoLam;
    }

    public int getPhuCap() {
        
        return phuCap;
    }

    public int getLuong() {
       
        return luong;
    }

    public void input() {
        System.out.print("ID: ");
        setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.print("Kieu Nhan Vien: ");
        setKieuNhanVien(sc.nextLine());
        System.out.print("So Ngay Lam: ");
        setSoNgayLam(sc.nextInt());
        System.out.print("Nam vao lam: ");
        setNamVaoLam(sc.nextInt());
        setLuong(luong);
        setPhuCap(phuCap);
    }

    void output() {
        System.out.printf("%-15d %-15s %-15s %-15d %-15d %-15d %-15d %-15d\n",
                getId(), getHoTen(), getKieuNhanVien(),
                getSoNgayLam(), getNamVaoLam(), getLuong(), getPhuCap(), getLuong() +
                        getPhuCap());
    }

    public static void main(String[] args) {
        NhanVien[] nv = new NhanVien[5];
        for (int i = 0; i < 1; i++) {
            System.out.println("Nhav vien " +( i + 1) + ":");
            nv[i] = new NhanVien();
            nv[i].input();

        }
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", "ID",
                "Ho Ten", "Kieu Nhan Vien",
                "So ngay lam", "Nam vao lam", "Luong", "Phu cap", "Tong tien");
        for (int i = 0; i < 1; i++) {
            nv[i].output();
        }
    }
}