import java.util.Scanner;

public class Bai4 {
    public static String dele(String a, int idx) {
        String a2 = a.substring(0, idx);
        String a3 = a.substring(idx + 1, a.length());
        a2 = a2.concat(a3);
        return a2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        str = sc.nextLine();
        str = str.trim();
        str = str.toLowerCase();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) == ' ') {
                str = dele(str, i - 1);
                i--;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                str = dele(str, i);
                i--;
            }
        }
        char arr[] = str.toCharArray();
        arr[0] -= 32;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) == ' ') {
                arr[i] -= 32;
            }
        }
        System.out.println(arr);
    }
}
