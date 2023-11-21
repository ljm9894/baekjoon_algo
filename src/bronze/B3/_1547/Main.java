package bronze.B3._1547;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int ball = 1;
        for(int i=0;i<M;i++){
            int a =sc.nextInt();
            int b = sc.nextInt();
            if(ball == b){
             ball = a;
            }else if(ball == a){
                ball = b;
            }
        }
        System.out.println(ball);
    }
}
