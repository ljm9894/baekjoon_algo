package bronze.B3._2720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int quater = a/25;
            int b = a%25;
            int dime = b/10;
            int c = b%10;
            int nickel = c/5;
            int d = c%5;
            int penny = d/1;
            System.out.printf("%d %d %d %d\n", quater, dime, nickel, penny);
        }
    }
}
