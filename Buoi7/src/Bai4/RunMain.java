package Bai4;

import Bai2.ThiSinh;
import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Nguoi> listGV = new ArrayList<>();
        do {
            System.out.println("\nMENU\n+"
                    + "1.Them 1 giao vien\n"
                    + "2.Xoa 1 gv\n"
                    + "3.Hien thi danh sach gv\n"
                    + "4.Thoat");
           
            System.out.println("Moi ae chon:");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1: {
                    nhap(listGV);
                    break;
                }
                case 2: {
                    xoa(listGV);
                    break;
                }
                case 3: {
                    xuat(listGV);
                    break;
                }
                case 4: {
                    return;
                }

                default:
                    System.out.println("Khong co yeu cau, chon lai:");
            }
        } while (true);

    }

    public static boolean check(ArrayList<Nguoi> listGV) {
        return listGV.size() != 0;
    }

    public static void title() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Ma GV", "Ho va Ten", "Tuoi", "Que quan", "Luong");
    }

    public static void nhap(ArrayList<Nguoi> listGV) {
        Nguoi newNguoi = new Nguoi();
        newNguoi.nhap();
        listGV.add(newNguoi);
    }

    public static void xoa(ArrayList<Nguoi> listGV) {
        if (check(listGV)) {
            System.out.println("Nhap ma sv can xoa:");
            String ma = scanner.nextLine();
            for (int i = 0; i < listGV.size(); i++) {
                if (ma.compareTo(listGV.get(i).getMaSoGV()) == 0) {
                    listGV.remove(i);
                }
            }
        } else {
            System.out.println("Khong co giao vien de xoa");
        }
    }

    public static void xuat(ArrayList<Nguoi> listGV) {
        if (check(listGV)) {
            title();
            for (Nguoi item : listGV) {
                item.xuat();
            }
        } else {
            System.out.println("Khong co giao vien de xoa");
        }
    }

}
