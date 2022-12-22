package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        do {
            System.out.println("\nMENU" + "\n1.Them 1 hoc sinh" + "\n2.Xuat thong tin cac hoc sinh"
                    + "\n3.Hien thi cac hoc sinh 20 tuoi" + "\n4.Cho biet so luong hoc sinh tuoi 23 va que o DN"
                    + "\n5.Sap xep sinh vien tang dan theo que quan" + "\n6.Thoat chuong trinh.");
            System.out.print("Nhap lua chon: ");
            int choose = new Scanner(System.in).nextInt();
            switch (choose) {
                case 1: {
                    nhap();
                    break;
                }
                case 2: {
                    xuat();
                    break;
                }
                case 3: {
                    hienThi();
                    break;
                }
                case 4: {
                    demHocSinh();
                    break;
                }
                case 5: {
                    sapXep();
                    break;
                }
                case 6: {
                    return;
                }
                default:
                    System.out.println("Khong co trong MENU");
            }
        } while (true);
    }

    public static void nhap() {
        System.out.println("Nhap thong tin 1 sv: ");
        Student s = new Student();
        s.input();
        students.add(s);
    }

    public static void title() {
        System.out.printf("%-15s %-15s  %-15s %-15s %-15s \n", "Ho ten", "Tuoi", "Que quan", "Ma lop", "Ten lop");
    }

    public static void xuat() {
        if (check()) {
            title();
            for (int i = 0; i < students.size(); i++) {
                students.get(i).output();
                System.out.println();
            }
        } else {
            System.out.println("chua co hoc sinh nao");
        }
    }

    public static void hienThi() {
        if (check()) {
            int dem = 0;
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getTuoi() == 20) {
                    dem++;
                    if (dem == 1) {
                        title();
                    }
                    students.get(i).output();
                    System.out.println("");
                }
            }
            if (dem == 0) {
                System.out.println("Khong co hoc sinh 20 tuoi");
            }
        } else {
            System.out.println("chua co hoc sinh nao");
        }
    }

    public static void demHocSinh() {
        if (check()) {
            int dem = 0;
            for (int i = 0; i < students.size(); i++) {
                if (students.get(i).getTuoi() == 23 && students.get(i).getQueQuan().compareTo("DN") == 0) {
                    dem++;
                }
            }
            System.out.println("So hoc sinh 23 tuoi qua o DN la: " + dem);
        } else {
            System.out.println("chua co hoc sinh nao");
        }

    }

    public static void sapXep() {
        if (students.size() >= 2) {
            for (int i = 0; i < students.size() - 1; i++) {
                for (int j = i + 1; j < students.size(); j++) {
                    if (students.get(i).getQueQuan().compareTo(students.get(j).getQueQuan()) > 0) {
                        Student item = students.get(i);
                        students.set(i, students.get(j));
                        students.set(j, item);
                    }
                }
            }
        } else {
            System.out.println("Khong the sap xep");
        }
    }

    public static boolean check() {
        return students.size() != 0;
    }

}
