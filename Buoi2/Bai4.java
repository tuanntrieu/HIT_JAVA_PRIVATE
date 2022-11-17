import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubA
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			n = sc.nextInt();
		} while (n <= 0);
		int dem = 0;
		int[] a = new int[1000];
		while (n > 0) {
			int du = n % 10;
			if ((int) Math.sqrt(du) * (int) Math.sqrt(du) == du) {
				a[dem++] = du;
			}
			n /= 10;
		}
		if (dem == 0)
			System.out.println("No");
		else {
			for (int i = dem - 1; i >= 0; i--) {
				System.out.println(a[i] + " ");
			}
		}

	}

}


