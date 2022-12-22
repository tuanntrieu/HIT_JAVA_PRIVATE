
package Bai4;

import java.util.Scanner;

public class CBGV {
    private double luongCung;
    private double luongThuong;
    private double luongPhat;
    private double luongLinhVuc;
   
    public CBGV(){
        
    }

    public CBGV(double luongCung, double luongThuong, double luongPhat, double luongLinhVuc) {
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.luongPhat = luongPhat;
        this.luongLinhVuc = luongLinhVuc;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }

    public double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public double getLuongPhat() {
        return luongPhat;
    }

    public void setLuongPhat(double luongPhat) {
        this.luongPhat = luongPhat;
    }

    public double getLuongLinhVuc() {
        return luongLinhVuc;
    }

    public void setLuongLinhVuc(double luongLinhVuc) {
        this.luongLinhVuc = luongLinhVuc;
    }
    public static Scanner scanner=new Scanner(System.in);
    public void nhap(){
        System.out.println("Luong cung: ");
        setLuongCung(scanner.nextDouble());
        System.out.println("Luong thuong: ");
        setLuongThuong(scanner.nextDouble());
        System.out.println("Luong phat: ");
        setLuongPhat(scanner.nextDouble());
        System.out.println("Luong linh vuc: ");
        setLuongLinhVuc(scanner.nextDouble());
        scanner.nextLine();
    }
    
}
