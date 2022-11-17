import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public void nhap(SinhVien []sv,int n ){
        
        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien " + (i + 1) + ": ");
            sv[i] = new SinhVien();
            sv[i].input();

        }
    }
}
