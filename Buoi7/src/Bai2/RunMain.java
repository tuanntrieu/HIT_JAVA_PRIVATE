
package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<ThiSinh> thiSinhs = new ArrayList<>();
        do {
            System.out.println("\nQUAN LY THI SINH\n"
                    + "1.Them moi this sinh\n"
                    + "2.Hien thi thong tin cac thi sinh\n"
                    + "3.Tim kiem theo so bao danh\n"
                    + "4.Thoat khoi chuong trinh");
            
            System.out.println("Moi ae chon:");
            int choose = scanner.nextInt();
            scanner.nextLine();
            switch (choose) {
                case 1: {
                    nhap(thiSinhs);
                    break;
                }
                case 2: {
                    xuat(thiSinhs);
                    break;
                }
                case 3: {
                    timKiem(thiSinhs);
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

    public static void nhap(ArrayList<ThiSinh> thiSinhs) {
        ThiSinh item = new ThiSinh();
        item.input();
        thiSinhs.add(item);
    }

    public static void title() {
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "So bao danh", "Ho va ten", "Dia chi", "Muc uu tien", "To hop thi");
    }

    public static void xuat(ArrayList<ThiSinh> thiSinhs) {
        if (check(thiSinhs)) {
            title();
            for (ThiSinh item : thiSinhs) {
                item.output();
            }
        } else {
            System.out.println("Chua co thi sinh nao");
        }
    }

    public static void timKiem(ArrayList<ThiSinh> thiSinhs) {
        int dem=0;
        System.out.println("Nhap so bao danh can tim kiem: ");
        String a = scanner.nextLine();
        for (int i = 0; i < thiSinhs.size(); i++) {
            if (thiSinhs.get(i).getSBD().compareTo(a) == 0) {
                title();
                dem++;
                thiSinhs.get(i).output();
                break;
            }
        }
        if(dem==0)System.out.println("Khong co thi sinh nao");
    }

    public static boolean check(ArrayList<ThiSinh> thiSinhs) {
        return thiSinhs.size() != 0;
    }

}
