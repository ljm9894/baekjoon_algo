package bronze._1268_X;


import java.util.Scanner;

public class Main {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[1000][1000];
        int[] st = new int[100];
        int result = 0;
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }

        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (arr[j][i] == arr[k][i]) {
                        st[j]++;
                        st[k]++;
                    }
                }
            }
        }
        for (int i : st) {
            if (max < st[i]) {
                result = i + 1;
            }
        }
        System.out.println(result);
    }

}
