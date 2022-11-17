import java.util.Scanner;

public class Bai1 {

	public static void sort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			n = sc.nextInt();
		} while (n < 2);
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sort(a, n);
		int k = 0, m = 0;
		int[] b = new int[n];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			int dem = 1;
			c[m++] = a[i];
			for (int j = i + 1; j < n; j++) {
				if (a[i] == a[j]) {
					dem++;
					i++;
				}
			}
			b[k++] = dem;
		}
		for (int i = 0; i < k; i++) {
			System.out.println(c[i] + ": " + b[i]);
		}

	}

}
