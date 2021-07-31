package default11;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            str = in.readLine();
            if (str == null) {
                strList.add("");
            } else {
                strList.add(str);
            }
        }
        for (String strr : strList) {
            System.out.println(strr);
        }
    }
}
















