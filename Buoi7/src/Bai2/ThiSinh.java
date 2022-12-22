
package Bai2;

import java.util.Scanner;


public class ThiSinh {

    public static Scanner sc = new Scanner(System.in);
    private String SBD;
    private String hoTen;
    private String diaChi;
    private int mucUuTien;
    private KhoiThi khoiThi = new KhoiThi();

    public ThiSinh() {
    }

    public ThiSinh(String SBD, String hoTen, String diaChi, int mucUuTien,KhoiThi khoiThi) {
        this.SBD = SBD;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUuTien = mucUuTien;
        this.khoiThi=khoiThi;
    }

    public String getSBD() {
        return SBD;
    }

    public void setSBD(String SBD) {
        this.SBD = SBD;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getMucUuTien() {
        return mucUuTien;
    }

    public void setMucUuTien(int mucUuTien) {
        this.mucUuTien = mucUuTien;
    }

    public KhoiThi getKhoiThi() {
        return khoiThi;
    }

    public void setKhoiThi(KhoiThi khoiThi) {
        this.khoiThi = khoiThi;
    }

    public void input() {
        System.out.println("So bao danh: ");
        setSBD(sc.nextLine());
        System.out.println("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Dia chi: ");
        setDiaChi(sc.nextLine());
        System.out.println("Muc uu tien: ");
        setMucUuTien(sc.nextInt());
        sc.nextLine();
        System.out.println("Chon khoi thi:\n1.KhoiA\n2.KhoiB\n3.Khoi3 ");
        int choose;
        do{
             choose = sc.nextInt();
             if(choose !=1 && choose!=2 && choose!=3)
                 System.out.println("Chon lai:");
        }while(choose !=1 && choose!=2 && choose!=3);
        switch (choose) {
            case 1: {
                khoiThi = new KhoiThi("Toan", "Ly", "Hoa");
                break;
            }
            case 2: {
                khoiThi = new KhoiThi("Toan", "Hoa", "Sinh");
                break;
            }
            case 3: {
                khoiThi = new KhoiThi("Van", "Su", "Dia");
                break;
            }
        }
        sc.nextLine();
    }

    public void output() {
        System.out.printf("%-15s %-15s %-15s %-15d ", getSBD(), getHoTen(), getDiaChi(), getMucUuTien());
        System.out.println(khoiThi);
        System.out.println("");
    }
    public static void main(String[] args) {
        ThiSinh a=new ThiSinh();
        a.input();
        a.output();
    }

}
