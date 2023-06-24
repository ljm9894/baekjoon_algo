package bronze._2566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][]arr;
        arr = new int[101][101];
        int max = 0;
        int a = 0,b=0;
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(max< arr[i][j]){
                    max = arr[i][j];
                    a =i;
                    b=j;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d",a+1,b+1);
    }
}
