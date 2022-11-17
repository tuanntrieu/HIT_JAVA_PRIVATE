
public class Bai3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 33; j++) {
				for (int k = 3; k < 100; k++) {
					if ((i + j + k == 100) && (i * 5 + j * 3 + k / 3 == 100) && k % 3 == 0)
						System.out.println("Trau dung: " + i + ", trau nam: " + j + ", trau gia: " + k);
				}
			}
		}

	}
}
