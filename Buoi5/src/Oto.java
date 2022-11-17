import java.util.Scanner;

public class Oto {
    private String chuSoHuu;
    private String tenXe;
    private String Hang;
    private long gia;
    private long namMua;

    private static Scanner sc = new Scanner(System.in);

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public void setHang(String hang) {
        Hang = hang;
    }

    public void setGia(long gia) {
        this.gia = gia;
    }

    public void setNamMua(long namMua) {
        this.namMua = namMua;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public String getTenXe() {
        return tenXe;
    }

    public String getHang() {
        return Hang;
    }

    public long getGia() {
        return gia;
    }

    public long getNamMua() {
        return namMua;
    }

    private long giaHienTai;

    public void setGiaHienTai(long giaHienTai) {
        if (gia < 1000000000)
            giaHienTai = gia - (gia * 7 / 100 * (2022 - namMua));
        else if (gia >= 1000000000 && gia <= 2000000000)
            giaHienTai = gia - (gia * 7 / 100 * (2022 - namMua));
        else
            giaHienTai = gia - (gia * 3 / 100 * (2022 - getNamMua()));
        this.giaHienTai = giaHienTai;
    }

    public long getGiaHienTai() {
        
        return giaHienTai;
    }

    public static void sort(Oto[] oto, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (oto[i].getGiaHienTai() > oto[j].getGiaHienTai()) {
                    Oto temp = oto[i];
                    oto[i] = oto[j];
                    oto[j] = temp;
                }
            }
        }
    }

    public void output() {
        String s1 = Long.toString(getGia());
        String s2 = Long.toString((long) 2022 - getNamMua());
        String s3 = Long.toString(getGiaHienTai());
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", getChuSoHuu(), getTenXe(), getHang(), s1, s2, s3);
    }

    public void input() {
        System.out.print("Chu so huu: ");
        sc.nextLine();
        setChuSoHuu(sc.nextLine());
        System.out.print("Ten xe: ");
        setTenXe(sc.nextLine());
        System.out.print("Hang: ");
        setHang(sc.nextLine());
        System.out.print("Gia: ");
        setGia(sc.nextLong());
        System.out.print("Nam mua: ");
        setNamMua(sc.nextLong());
        setGiaHienTai(giaHienTai);
    }

    public static void main(String[] args) {

        System.out.print("Nhap so luong oto:");
        int n = sc.nextInt();

        Oto[] oto = new Oto[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Oto " + i + 1 + ": ");
            oto[i] = new Oto();
            oto[i].input();
        }
        System.out.println("DANH SACH O TO VUA NHAP ");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Chu SO Huu", "Ten xe", "Hang", "Gia", "Nam su dung",
                "Gia tri hien tai");
        for (int i = 0; i < n; i++) {
            oto[i].output();
        }
        sort(oto, n);
        System.out.println("DANH SACH O TO HET GIA TRI SU DUNG");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n", "Chu SO Huu", "Ten xe", "Hang", "Gia", "Nam su dung",
                "Gia tri hien tai");
        for (int i = 0; i < n; i++) {
            if (oto[i].getGiaHienTai() > 0)
                continue;
            else
                oto[i].output();
        }
    }
}
