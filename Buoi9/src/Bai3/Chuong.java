package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class Chuong {

    private int maChuong;

    public Chuong() {

    }

    public Chuong(int maChuong) {
        this.maChuong = maChuong;
    }

    public int getMaChuong() {
        return maChuong;
    }

    public void setMaChuong(int maChuong) {
        this.maChuong = maChuong;
    }
    ArrayList<Animal> AnimalList = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

    public void input(){
        System.out.println("Ma chuong: ");
        this.setMaChuong(scanner.nextInt());
    }
    public void themConVat(Animal a) {
        AnimalList.add(a);
    }

    public void xoaConVat(Animal a) {
        AnimalList.remove(a);
    }
    

}
