import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0, dem = 1;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (a[j - 1] <= a[j])
                    dem++;
                else
                    break;
            }
            if (max < dem)
                max = dem;
            dem = 1;

        }
        System.out.println(max);

    }
}
