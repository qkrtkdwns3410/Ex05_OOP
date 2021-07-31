package default11;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int ans = fac(N) / (fac(N - K) * fac(K));
        System.out.println(ans);
    }

    static int fac(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fac(num - 1);
    }

}
















