package bronze._5554;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int sum = a+b+c+d;
        int min = sum/60;
        int sec = sum%60;

        System.out.println(min);
        System.out.println(sec);
    }
}
