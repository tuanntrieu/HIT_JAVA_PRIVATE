import java.util.Scanner;

public class Main {

    public static void sortHour(Employee[] ep, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ep[i].getHourWorked() < ep[j].getHourWorked()) {
                    Employee temp = ep[i];
                    ep[i] = ep[j];
                    ep[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So nhan vien: ");
        int n = sc.nextInt();
        sc.nextLine();
        Employee[] ep = new Employee[1000];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhan vien " + (i + 1) + ": ");
            ep[i] = new Employee();
            ep[i].input();
        }
        System.out.println("---------------LUA CHON---------------");
        System.out.println("1.Them moi nhan vien                  ");
        System.out.println("2.Hien thi danh sach nhan vien        ");
        System.out.println("3.Hien thi 3 nhan vien cham chi nhat  ");
        System.out.println("4.Tim kiem nhan vien                  ");
        System.out.println("5.Thoat                               ");
        System.out.print("Chon yeu cau: ");
        int y = sc.nextInt();
        switch (y) {
            case 1:
                Employee ep1 = new Employee();
                System.out.println("Nhap thong tin sv can them:");
                ep1.input();
                ep[n++] = ep1;
                break;
            case 2:
                System.out.printf("%-20s %-10s %-15s %-20s %-10s\n", "Ho ten", "Tuoi", "Gioi Tinh", "Dia chi",
                        "Tien nhan duoc");
                for (int i = 0; i < n; i++) {
                    ep[i].output();
                }
                break;
            case 3:
                sortHour(ep, n);
                int stopp = 0;
                System.out.printf("%-20s %-10s %-15s %-20s %-10s\n", "Ho ten", "Tuoi", "Gioi Tinh", "Dia chi",
                        "Tien nhan duoc");
                for (int i = 0; i < n; i++) {
                    ep[i].output();
                    stopp++;
                    if (stopp == 3)
                        break;
                }
                break;
            case 4:
            sc.nextLine();
            System.out.print("Nhap ho ten nhan vien can tim: ");
            String s=sc.nextLine();
            System.out.printf("%-20s %-10s %-15s %-20s %-10s\n", "Ho ten", "Tuoi", "Gioi Tinh", "Dia chi",
            "Tien nhan duoc");
            for(int i=0;i<n;i++){
                if(s.equalsIgnoreCase(ep[i].getName())){
                    ep[i].output();
                }
            }
        }
    }
}
