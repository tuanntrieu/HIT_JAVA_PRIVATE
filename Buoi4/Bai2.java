import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = new String();
        String str2 = new String();
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        int maxx = 0;
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i + 1; j <= str2.length(); j++) {
                String str3 = str2.substring(i, j);
                if (str1.contains(str3)) {
                    maxx = Math.max(maxx, str3.length());
                }
            }
        }
        System.out.println(maxx);

    }

}
