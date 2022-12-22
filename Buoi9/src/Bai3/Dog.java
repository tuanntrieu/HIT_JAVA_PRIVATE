
package Bai3;

import java.util.Scanner;

public class Dog extends Animal {

    private String loai;
    
    public Dog(){}

    public Dog(String loai, String ten, int tuoi, String moTa) {
        super(ten, tuoi, moTa);
        this.loai = loai;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    public void input(){
        setLoai("Cho");
        System.out.println("Ten: ");
        super.setTen(new Scanner(System.in).nextLine());
        System.out.println("Tuoi: ");
        super.setTuoi(new Scanner(System.in).nextInt());
        System.out.println("Mo ta: ");
        super.setMoTa(new Scanner(System.in).nextLine());
    }
    @Override
     public void xemThongTin() {
        System.out.printf("%-15s %-15s %-15d %-15s\n",this.getLoai(),super.getTen(),super.getTuoi(),super.getMoTa());
    }

    @Override
    public void tiengKeu() {
        System.out.println("Go go");    }
    
}
