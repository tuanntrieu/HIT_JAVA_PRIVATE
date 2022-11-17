import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        int dem = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                dem++;
                sum += (int) (s.charAt(i) - '0');
            }
        }
        if (dem == 0)
            System.out.println("false");
        else {
            System.out.println("true");
            System.out.println((double) Math.round((double) sum / dem * 1000) / 1000);
        }
    }
}
