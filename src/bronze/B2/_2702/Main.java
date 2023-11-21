package bronze.B2._2702;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //유클리드 호제법
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("%d %d\n",lcm(a,b),gdc(a,b));
        }

    }
    static int gdc(int a, int b) {
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        while(b!=0){
            int r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
    static int lcm(int a, int b) {
        return a*b / gdc(a,b);
    }
}
