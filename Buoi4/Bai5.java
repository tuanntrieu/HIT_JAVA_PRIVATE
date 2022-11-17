import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        s = sc.nextLine();
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I')
                sum += 1;
            if (s.charAt(i) == 'V') {
                if (i == 0)
                    sum += 5;
                else {
                    if (s.charAt(i - 1) == 'I')
                        sum += 3;
                    else
                        sum += 5;
                }
            }
            if (s.charAt(i) == 'X')
                if (i == 0)
                    sum += 10;
                else {
                    if (s.charAt(i - 1) == 'I')
                        sum += 8;
                    else
                        sum += 10;
                }
            if (s.charAt(i) == 'L') {
                if (i == 0)
                    sum += 50;
                else {
                    if (s.charAt(i - 1) == 'X')
                        sum += 30;
                    else
                        sum += 50;
                }
            }
            if (s.charAt(i) == 'C') {
                if (i == 0)
                    sum += 100;
                else {
                    if (s.charAt(i - 1) == 'X')
                        sum += 80;
                    else
                        sum += 100;
                }
            }

            if (s.charAt(i) == 'D') {
                if (i == 0)
                    sum += 500;
                else {
                    if (s.charAt(i - 1) == 'C')
                        sum += 300;
                    else
                        sum += 500;
                }
            }
            if (s.charAt(i) == 'M') {
                if (i == 0)
                    sum += 1000;
                else {
                    if (s.charAt(i - 1) == 'C')
                        sum += 800;
                    else
                        sum += 1000;
                }
            }
        }
        System.out.println(sum);
    }
}
