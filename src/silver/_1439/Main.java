package silver._1439;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringTokenizer a = new StringTokenizer(str, "0");
        StringTokenizer b = new StringTokenizer(str, "1");
        System.out.println(Math.min(a.countTokens(), b.countTokens()));

    }
}
