package Bai4;

import Bai3.Classs;
import java.util.Scanner;

public class Nguoi {

    private String maSoGV;
    private String hoTen;
    private int tuoi;
    private String queQuan;
    CBGV gv = new CBGV();

    public Nguoi() {
    }

    public Nguoi(String maSoGV, String hoTeng, int tuoi, String queQuan) {
        this.maSoGV = maSoGV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public String getMaSoGV() {
        return maSoGV;
    }

    public void setMaSoGV(String maSoGV) {
        this.maSoGV = maSoGV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public CBGV getGv() {
        return gv;
    }

    public void setGv(CBGV gv) {
        this.gv = gv;
    }
    
    public static Scanner scanner=new Scanner(System.in);
    public void nhap(){
        System.out.println("Ma giao vien" );
        setMaSoGV(scanner.nextLine());
        System.out.println("Ho ten: ");
        setHoTen(scanner.nextLine());
        System.out.println("Tuoi: ");
        setTuoi(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Que quan: ");
        setQueQuan(scanner.nextLine());
        gv.nhap();
    }
    
    public double getLuongThuc(){
        return gv.getLuongCung()+gv.getLuongThuong()+gv.getLuongLinhVuc()-gv.getLuongPhat();
    }
    public  void xuat(){
        System.out.printf("%-15s %-15s %-15d %-15s %-15f\n",getMaSoGV(),getHoTen(),getTuoi(),getQueQuan(),getLuongThuc());
    }
    
    
}
