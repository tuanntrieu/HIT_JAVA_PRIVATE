import java.util.Scanner;

public class Bai4 {
    public static boolean snt(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean checkSNT(int n) {
        int dem = 0, dem1 = 0;
        if (snt(n))
            dem++;
        while (n > 0) {
            int du = n % 10;
            if (snt(du))
                dem++;
            dem1++;
            n /= 10;
        }

        if (dem == (dem1 + 1))
            return true;
        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (checkSNT(a[i])) {
                System.out.print(a[i] + " ");
                dem++;
            }
        }
        if (dem == 0)
            System.out.print("NO");

    }
}
