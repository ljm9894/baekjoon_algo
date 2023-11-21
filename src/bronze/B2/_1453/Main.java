package bronze.B2._1453;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int cnt=0;
        boolean[] arr = new boolean[101];
        n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int req = sc.nextInt();
            if(arr[req] == true){
                cnt++;
            }else{
                arr[req] = true;
            }
        }
        System.out.println(cnt);
    }
}
