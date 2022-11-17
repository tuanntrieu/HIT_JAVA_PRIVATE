import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[a[n - 1]];
        for (int i = 0; i < a[n - 1]; i++) {
            b[i] = i + 1;
        }
        if (a.length == b.length)
            System.out.print("YES");
        int k = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] == a[k]) {               
                k++;
            }
            else System.out.print(b[i] + " ");
        }
    }
}
