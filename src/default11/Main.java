package default11;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fi = new int[22];

        fi[0] = 0;
        fi[1] = 1;
        for (int i = 2; i < 21; i++) {
            fi[i] = fi[i - 1] + fi[i - 2];
        }
        int t = sc.nextInt();
        System.out.println(fi[t]);
    }
}

























