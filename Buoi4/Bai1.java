import java.util.Scanner;
import java.util.Locale;

public class Bai1 {
    public static String dele(String a, int idx) {
        String a2 = a.substring(0, idx);
        String a3 = a.substring(idx + 1, a.length());
        a2 = a2.concat(a3);
        return a2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        str1 = sc.nextLine();
        str1 = str1.toLowerCase(Locale.ROOT);
        int dem = 1;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ' ') {
                str1 = dele(str1, i);
                i--;
            } else {
                System.out.print(str1.charAt(i) + ": ");
                for (int j = i + 1; j < str1.length(); j++) {
                    if (str1.charAt(i) == str1.charAt(j)) {
                        dem++;
                        str1 = dele(str1, j);
                        j--;
                    }
                }
                System.out.println(dem);
                dem = 1;
            }
        }
    }
}