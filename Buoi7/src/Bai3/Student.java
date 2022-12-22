package Bai3;

import java.util.Scanner;

public class Student {

    private String hoTen;
    private int tuoi;
    private String queQuan;
    private Classs c = new Classs();

    public Classs getC() {
        return c;
    }

    public void setC(Classs c) {
        this.c = c;
    }

    public Student() {

    }

    public Student(String hoTen, int tuoi, String queQuan, Classs c) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.c = c;
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

    public static Scanner sc = new Scanner(System.in);

    public void input() {
        c.input();
        System.out.println("Ho ten: ");
        setHoTen(sc.nextLine());
        System.out.println("Tuoi: ");
        setTuoi(sc.nextInt());
        sc.nextLine();
        System.out.println("Que quan:  ");
        setQueQuan(sc.nextLine());

    }

    public void output() {
         c.output();
        System.out.printf(" %-15s %-15d %-15s", getHoTen(), getTuoi(), getQueQuan());
       
    }
}
