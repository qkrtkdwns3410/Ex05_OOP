package default11;


import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num-- > 0) {
            for (int i = 0; i < num; i++) {
                String[] strArr = sc.nextLine().split(" ");
                for (int j = strArr.length - 1; j >= 0; j--) {
                    System.out.printf("%s ",strArr[j]);
                }
                System.out.println();
            }
        }



    }
}














