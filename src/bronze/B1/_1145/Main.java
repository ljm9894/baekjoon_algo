package bronze.B1._1145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch=1;
        int cnt = 0;
        int[] arr = new int[5];
        for(int k=0;k<5;k++){
            arr[k] = sc.nextInt();
        }
        while(true) {

            for (int j = 0; j < 5; j++) {
                if (ch % arr[j] == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {

                break;
            }
            cnt = 0;
            ch++;
        }
        System.out.println(ch);
        sc.close();
    }
}
