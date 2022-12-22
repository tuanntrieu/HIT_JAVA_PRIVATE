/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

public class Classs {

    private String maLop;
    private String tenlop;

    public Classs() {

    }

    public Classs(String maLop, String tenlop) {
        super();
        this.maLop = maLop;
        this.tenlop = tenlop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }
    public static Scanner sc = new Scanner(System.in);

    public void input() {
        System.out.println("Nhap ma lop: ");
        setMaLop(sc.nextLine());
        System.out.println("Ten lop: ");
        setTenlop(sc.nextLine());
    }

    public void output() {
        System.out.printf("%-15s %-15s", getMaLop(), getTenlop());
    }
   
}
