package bronze._2446;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i-1;k++){
                System.out.printf(" ");
            }
            for(int j=1;j<=n*2-i*2+1;j++){
                System.out.printf("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n- 1; i++) {

            for (int j = 1; j < (n- 1) - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 3 + 2 * i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
