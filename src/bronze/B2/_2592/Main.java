package bronze.B2._2592;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10000];
        int sum =0;
        int a = 0;
        int manyCnt = 0;
        for(int i=0;i<10;i++){
            int n = Integer.parseInt(bf.readLine());
            sum+=n;
            arr[n]++;
        }
        int cnt=0;
        for(int i = 0; i<1000; i+=10){
            if(manyCnt<arr[i]){
                manyCnt = arr[i];
                cnt = i;
            }
        }
        int result = sum/10;
        System.out.println(result);
        System.out.println(cnt);
    }
}
