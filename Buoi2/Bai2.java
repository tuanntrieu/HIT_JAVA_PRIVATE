import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if (a == b && b == c && c == d) {
			System.out.println("Khong ton tai so lon thu 2");
		} else {
			int max1 = a;
			if (b > max1)
				max1 = b;
			if (c > max1)
				max1 = c;
			if (d > max1)
				max1 = d;
			int min = a;
			if (b < min)
				min = b;
			if (c < min)
				min = c;
			if (d < min)
				min = d;
			int max2 = min;
			if (a > max2 && a < max1)
				max2 = a;
			if (b > max2 && b < max1)
				max2 = b;
			if (c > max2 && c < max1)
				max2 = c;
			if (d > max2 && d < max1)
				max2 = d;
			System.out.println(max2);

		}

	}
}
