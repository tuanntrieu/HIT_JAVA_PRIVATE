
import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);

    public static void sxDiem(SinhVien[] sv, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (sv[i].getDiemSo() > sv[j].getDiemSo()) {
                    SinhVien temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
    }

    public static String Ten(String a) {
        return a.substring(a.lastIndexOf(" "), a.length() - 1);
    }

    public static void sxTen(SinhVien[] sv, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Ten(sv[i].getHoTen()).compareToIgnoreCase(Ten(sv[j].getHoTen())) > 0) {
                    SinhVien temp = sv[i];
                    sv[i] = sv[j];
                    sv[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("So sinh vien can nhap: ");
        int n = sc.nextInt();
        SinhVien[] sv = new SinhVien[n];
        Input ip = new Input();
        ip.nhap(sv, n);
        System.out.println("---------------MENU--------------");
        System.out.println("1.Danh sach diem sinh vien       ");
        System.out.println("2.Tim kiem sinh vien             ");
        System.out.println("3.Sap xep sv theo thu tu tang dan");
        System.out.println("4.Thoat                          ");
        System.out.print("Chon yeu cau: ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                sxDiem(sv, n);
                System.out.printf("%-10s %-20s %20s %20s %15s\n", "Ma SV", "Ho Ten", "Dia Chi", "SDT", "Diem So");
                for (int i = 0; i < n; i++) {
                    System.out.println(sv[i]);
                }
                break;
            case 2:
                System.out.print("Nhap ten can tim kiem:");
                sc.nextLine();
                String s = sc.nextLine();
                System.out.println("Thong tin sv can tim la: ");
                System.out.printf("%-10s %-20s %20s %20s %15s\n", "Ma SV", "Ho Ten", "Dia Chi", "SDT", "Diem So");
                for (int i = 0; i < n; i++) {
                    if (sv[i].getHoTen().contains(s)
                            && s.charAt(s.length() - 1) == sv[i].getHoTen().charAt(sv[i].getHoTen().length() - 1))
                        System.out.println(sv[i]);
                }
                break;
            case 3:
                sxTen(sv, n);
                System.out.printf("%-10s %-20s %20s %20s %15s\n", "Ma SV", "Ho Ten", "Dia Chi", "SDT", "Diem So");
                for (int i = 0; i < n; i++) {
                    System.out.println(sv[i]);
                }
                break;

            default:
                break;
        }
    }

}
