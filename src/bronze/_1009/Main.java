package bronze._1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int b;
        int t;
        for(int i =0;i<n;i++){
            a = sc.nextInt();
            b = sc.nextInt();
            t=1;
            for(int j=0;j<b;j++) t = (t*a)%10;
            if(t==1) t=10;
            System.out.println(t);
        }


    }
}
