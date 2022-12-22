/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 84944
 */
public class ZooService implements ZooInterface {

    @Override
    public void ThemChuong(Zoo zoo) {
        Chuong c = new Chuong();
        c.input();
        zoo.DanhSachChuong.add(c);
    }

    @Override
    public void XoaChuong(Zoo zoo) {

        System.out.println("Nhap ma chuong muon xoa: ");
        int n = new Scanner(System.in).nextInt();
        if (!zoo.DanhSachChuong.isEmpty()) {
            int t = zoo.DanhSachChuong.size();
            for (int i = 0; i < zoo.DanhSachChuong.size(); i++) {
                if (n == zoo.DanhSachChuong.get(i).getMaChuong()) {
                    zoo.xoaChuong(zoo.DanhSachChuong.get(i));
                    break;
                }
            }
            if (t == zoo.DanhSachChuong.size()) {
                System.out.println("Khong ton tai ma chuong nay");
            }
        } else {
            System.out.println("Danh sach trong");
        }

    }

    @Override
    public void ThemConVat(Zoo zoo) {
        System.out.println("Nhap ma chuong can them: ");
        int tmp = new Scanner(System.in).nextInt();
        int dem = 0;
        for (int i = 0; i < zoo.DanhSachChuong.size(); i++) {
            if (tmp == zoo.DanhSachChuong.get(i).getMaChuong()) {
                dem++;
                System.out.println("Nhap loai vat muon them: ");
                String tmp1;
                do {
                    tmp1 = new Scanner(System.in).nextLine();
                    if (tmp1.compareToIgnoreCase("Ho") != 0 && tmp1.compareToIgnoreCase("Cho") != 0 && tmp1.compareToIgnoreCase("Meo") != 0) {
                        System.out.println("Nhap lai: ");
                    }
                } while (tmp1.compareToIgnoreCase("Ho") != 0 && tmp1.compareToIgnoreCase("Cho") != 0 && tmp1.compareToIgnoreCase("Meo") != 0);

                if (tmp1.compareToIgnoreCase("Ho") == 0) {
                    Animal a = new Tiger();
                    Tiger t = (Tiger) a;
                    t.input();
                    zoo.DanhSachChuong.get(i).AnimalList.add(a);
                }
                if (tmp1.compareToIgnoreCase("Meo") == 0) {
                    Animal a = new Cat();
                    Cat t = (Cat) a;
                    t.input();
                    zoo.DanhSachChuong.get(i).AnimalList.add(a);
                }
                if (tmp1.compareToIgnoreCase("Cho") == 0) {
                    Animal a = new Dog();
                    Dog t = (Dog) a;
                    t.input();
                    zoo.DanhSachChuong.get(i).AnimalList.add(a);
                }
                break;
            }
        }
        if (dem == 0) {
            System.out.println("Khong co chuong nay");
        }

    }

    @Override
    public void xoaConVat(Zoo zoo) {
        System.out.println("Nhap ten con vat can xoa:");
        String name = new Scanner(System.in).nextLine();
        int dem = 0;
        if (!zoo.DanhSachChuong.isEmpty()) {
            for (int i = 0; i < zoo.DanhSachChuong.size(); i++) {
                for (int j = 0; j < zoo.DanhSachChuong.get(i).AnimalList.size(); j++) {
                    if (zoo.DanhSachChuong.get(i).AnimalList.get(j).getTen().compareToIgnoreCase(name) == 0) {
                        dem++;
                        zoo.DanhSachChuong.get(i).AnimalList.remove(zoo.DanhSachChuong.get(i).AnimalList.get(j));
                        break;

                    }
                }
            }
            if(dem==0){
                System.out.println("Khong co con nay");
            }
        }
        else {
            System.out.println("Khong co chuong");
        }
    }

    @Override
    public void XemTatCa(Zoo zoo) {
        for (int i = 0; i < zoo.DanhSachChuong.size(); i++) {
            System.out.println("Ma chuong: " + zoo.DanhSachChuong.get(i).getMaChuong());
            System.out.printf("%-15s %-15s %-15s%-15s\n", "Loai", "Ten", "Tuoi", "Mo ta");
            for (int j = 0; j < zoo.DanhSachChuong.get(i).AnimalList.size(); j++) {
                zoo.DanhSachChuong.get(i).AnimalList.get(j).xemThongTin();
            }
        }
    }

}
