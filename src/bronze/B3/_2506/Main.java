package bronze.B3._2506;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum =0;
        int a=0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                a++;
                sum+=a;
            }else{
                a=0;
            }
        }
        System.out.println(sum);
    }
}
